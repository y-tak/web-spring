package com.example.webspring.controllers;

import com.example.webspring.entity.AppUser;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class UserController {

    @RequestMapping(value = "/user/add", method = RequestMethod.GET)
    public String showForm(AppUser appUser) {
        return "registration";
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public String submitForm(@ModelAttribute @Valid AppUser appUser, BindingResult result) {
        if (result.hasErrors()) //если ошибка
        {
            return "registration";
        }
        System.out.println("пользователь зарегистрирован = " + appUser);
        //добавить в БД
        //отобращить страничку

        return "registration";
    }
}
