package demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import demo.domain.User;
import demo.service.UserServiceImpl;

@RestController
@RequestMapping("/secure/api")
public class UserController {

    private final UserServiceImpl userDetailsService;

    @Autowired
    public UserController(UserServiceImpl userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @GetMapping(value = "/login/{userName}/{password}",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User login(@PathVariable String userName, @PathVariable String password) {
        return userDetailsService.login(userName, password);
    }

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<User> getListUser() {
        return userDetailsService.loadAllUsers();
    }

    @GetMapping(value = "/{userName}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public UserDetails getCurrentUser(@PathVariable String userName) {
        return userDetailsService.loadUserByUsername(userName);
    }
}
