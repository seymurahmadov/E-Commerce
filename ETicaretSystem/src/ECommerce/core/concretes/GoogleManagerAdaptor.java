package ECommerce.core.concretes;

import ECommerce.JGoogle.JGoogleManager;
import ECommerce.core.abstracts.GoogleService;
import ECommerce.entities.concretes.User;

public class GoogleManagerAdaptor implements GoogleService {


    @Override
    public void withGoogle(User user) {
        JGoogleManager jGoogleManager = new JGoogleManager();
        jGoogleManager.registerWithGoogle(user);
    }
}

