package demo.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import demo.config.PasswordEncoders;
import demo.domain.User;
import demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoders passwordEncoders;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if (user != null) {
            return user;
        }

        throw new UsernameNotFoundException(username);
    }

    /**
     * Pass userName and password for login.
     */
    public User login(String username, String password) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if (user != null) {
            boolean validPassword =
                    passwordEncoders.userPasswordEncoder().matches(password, user.getPassword());

            if (validPassword) {

                return user;
            } else {
                throw new UsernameNotFoundException(username);
            }
        }

        throw new UsernameNotFoundException(username);
    }

    @Transactional(readOnly = true)
    public List<User> loadAllUsers() {
        return userRepository.findAll();
    }
}