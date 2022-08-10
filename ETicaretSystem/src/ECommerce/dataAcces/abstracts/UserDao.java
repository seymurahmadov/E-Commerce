package ECommerce.dataAcces.abstracts;

import ECommerce.entities.concretes.User;

public interface UserDao {
    void register(User user);
    void logIn(User user);

}
