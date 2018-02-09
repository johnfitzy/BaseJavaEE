package controllers;

import beans.NavBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;



@Named
@RequestScoped
public class NavController {

    @Inject
    NavBean navBean;

    private static final String SUCCESS = "success";

    public void test(){

    }

    public String navigateToPage() {
        if(SUCCESS.equals(navBean.getMessage())) {
            return SUCCESS;
        }else {
            return "error";
        }
    }
}
