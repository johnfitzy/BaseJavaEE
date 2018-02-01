package controllers;

import beans.NameBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class NameController {

    @Inject
    NameBean nameBean;

    public String getSayName() {
        return "".equals(nameBean.getName()) || nameBean.getName() == null ? "" : "Welcome: " + nameBean.getName() + " !!!";
    }
}
