package controllers;

import beans.MessageBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class MessageController {

    @Inject
    MessageBean messageBean;

    public String getSayName() {
        return "".equals(messageBean.getName()) || messageBean.getName() == null ? "" : "Welcome: " + messageBean.getName() + " !!!";
    }
}
