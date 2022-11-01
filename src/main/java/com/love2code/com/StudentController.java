package com.love2code.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Binding;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/studentForm")
    public String showStudentForm(Model theModel) {
        Student theStudent = new Student();
        System.out.println(theStudent.getCountryOptions());
        theModel.addAttribute("student", theStudent);
        System.out.println("here");
        return "student-form";
    }

    @RequestMapping("/viewStudent")
    public  String studentNewForm(@ModelAttribute("student") Student theStudent) {
        System.out.println("the Student first name" + theStudent.getFirstName());
        return "student-confirmation";
    }
}
