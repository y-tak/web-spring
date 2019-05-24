package com.example.webspring.controllers;

import com.example.webspring.entity.University;
import com.example.webspring.repositories.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


///обработка запросов

@Controller
public class UniversityController {
    //автоматически создан
    @Autowired
    private UniversityRepository universityRepository;


    @RequestMapping(value = "/university/add",method = RequestMethod.GET)
    public String showForm(@ModelAttribute University university, Model model)
    {
        model.addAttribute("university",new University());
        return "add_university";

    }

    @RequestMapping(value = "/university/add",method = RequestMethod.POST)
    public String submitForm(@ModelAttribute University university, Model model)
    {
        universityRepository.save(university);
        model.addAttribute("addInfo",university.getUneversityName());
        return "add_university";
    }

}
