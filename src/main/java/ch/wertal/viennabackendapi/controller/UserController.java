package ch.wertal.viennabackendapi.controller;

import java.util.List;

import ch.wertal.viennabackendapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/test/", method = RequestMethod.GET)
    @ResponseBody
    public String postFoos() {
        return "Post some Foos";
    }
    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    @ResponseBody
    public String getUser() {
        return "Here is your new User";
    }


}
