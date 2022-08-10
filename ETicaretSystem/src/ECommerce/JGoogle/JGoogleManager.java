package ECommerce.JGoogle;

import ECommerce.entities.concretes.User;

public class JGoogleManager {
    public void registerWithGoogle(User user){
        System.out.println("Register with Google " + user.getName() + " " + user.getSurName() );

    }

}
