package ECommerce.business.concretes;

import ECommerce.business.abstracts.UserService;
import ECommerce.core.abstracts.GoogleService;
import ECommerce.core.concretes.GoogleManagerAdaptor;
import ECommerce.dataAcces.abstracts.UserDao;
import ECommerce.dataAcces.concretes.HibernateUserDao;
import ECommerce.entities.concretes.User;

import javax.xml.validation.Validator;
import java.util.List;

public class UserManager implements UserService {

    private UserDao userDao;
    private GoogleService googleService;

    public UserManager(){

    }

    public UserManager(UserDao userDao,GoogleService googleService){
        this.userDao=userDao;
        this.googleService=googleService;

    }

    @Override
    public void registered(User user) {
        if (    UserValidator.eMailValidator(user.geteMail()) &&
                UserValidator.passwordValidaor(user.getPassWord())&&
                 UserValidator.nameValidator(user.getName(), user.getSurName()) ){

            System.out.println("Verification code sent to your mail. Please check Mail adress: " + user.geteMail());
            System.out.println("Registered is Succesfully");
            userDao.register(user);
        }
        else {
            System.out.println("Invalid eMail, password. Please check again.");
        }

      googleService.withGoogle(user);

 }


    @Override
    public void logIn(User user, String email, String password) {
        if (UserValidator.eMailValidator(user.geteMail()) && UserValidator.passwordValidaor(user.getPassWord())){
            System.out.println("Succesfully login");
            userDao.logIn(user);
        }
        else {
            System.out.println("Email and Password aren't correct. Please check again");
        }
    }


    @Override
    public List<User> getAll() {
        return null;
    }
}
