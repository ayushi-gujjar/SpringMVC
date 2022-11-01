package com.love2code.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWordController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@RequestParam String studentName) {
        System.out.println("here :" + studentName);
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutOut(HttpServletRequest request, Model model) {
        String theName= request.getParameter("studentName");
        String result = "Yo! " + theName ;
        model.addAttribute("message" , result);
        System.out.println(result + " : Result");
        return  "helloworld";
    }


    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
        String result = "Hey! " + theName ;
        model.addAttribute("message" , result);
        System.out.println(result + " : Result");
        return  "helloworld";
    }

}
