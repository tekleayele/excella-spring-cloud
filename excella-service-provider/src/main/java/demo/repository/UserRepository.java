package demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import demo.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT DISTINCT user FROM User user "
            + "WHERE user.username = :username")
    public User findByUsername(@Param("username") String username);

    @Query("SELECT DISTINCT user FROM User user "
            + "WHERE user.username = :username and user.password =:password")
    public User login(@Param("username") String username, @Param("password") String password);
}
