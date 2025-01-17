package com.aph.spring.proj1.springproj1.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.aph.spring.proj1.springproj1.model.Person;


@Controller
public class personController {
    
    private LinkedList<Person> personList = new LinkedList<>();

    @RequestMapping(value="/",method = RequestMethod.GET)
    public ModelAndView index(@ModelAttribute("personObj") Person person,ModelAndView mav){
        personList.forEach(System.out::println);
        mav.addObject("data", personList);
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping(value = "/add", method=RequestMethod.POST)
    public ModelAndView addNew(ModelAndView mav,@ModelAttribute("personObj") Person person) {
        // DateTime 
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY/MM/DD HH:mm");
        String createdDate = currentTime.format(dateTimeFormatter);
        // Person
        Person p = new Person();
        p.setId(personList.size()+1);
        p.setName(person.getName());
        p.setAge(person.getAge());
        p.setWork(person.getWork());
        p.setCreatedAt(createdDate);
        personList.add(p);
        mav.setViewName("redirect:/");
        return mav;
    }
    
}
