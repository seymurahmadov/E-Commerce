package ECommerce.business.abstracts;

import ECommerce.entities.concretes.User;

import java.util.List;

public interface UserService {
    void registered(User user);
    void logIn(User user,String email, String password);
    List<User> getAll();
}
