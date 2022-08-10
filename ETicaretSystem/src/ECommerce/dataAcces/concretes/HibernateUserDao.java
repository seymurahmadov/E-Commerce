package ECommerce.dataAcces.concretes;

import ECommerce.dataAcces.abstracts.UserDao;
import ECommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao {


    @Override
    public void register(User user) {
        System.out.println("Registered with Hibernate. User name: " + user.getName() + " User surname:" + user.getSurName() );
    }

    @Override
    public void logIn(User user) {
        System.out.println("Logged in with Hibernate. User name: " + user.getName() + " User surname:" + user.getSurName() );

    }
}

