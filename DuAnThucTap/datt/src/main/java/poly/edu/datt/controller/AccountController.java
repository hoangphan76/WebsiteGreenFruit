package poly.edu.datt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AccountController {
    @RequestMapping("security/Forgot_password")
    public String home(){
        return "security/Forgot_password";
    }
}
