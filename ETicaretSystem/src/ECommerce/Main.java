package ECommerce;

import ECommerce.business.abstracts.UserService;
import ECommerce.business.concretes.UserManager;
import ECommerce.core.abstracts.GoogleService;
import ECommerce.core.concretes.GoogleManagerAdaptor;
import ECommerce.dataAcces.concretes.HibernateUserDao;
import ECommerce.entities.concretes.User;

public class Main {
    public static void main(String[] args) {

    UserService userService = new UserManager(new HibernateUserDao(),new GoogleManagerAdaptor());
    User user = new User("Seymur" , "Ahmadov", "s.axmedov99@gmail.com", "123456789");

    userService.registered(user);
    userService.logIn(user,"s.axmed14@mail.ru", "145214852");

    




    }
}
