package com.love2code.com;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

//import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

        @InitBinder
        public void initBinder(WebDataBinder dataBinder){
                StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
                dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
        }

        @RequestMapping("/customerForm")
        public String getCustomerForm(Model theModel) {
                theModel.addAttribute("customer", new Customer());
                return "customer-form";
        }
        @RequestMapping("/viewCustomer")
        public String getCustomerView(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) {
                System.out.println(theBindingResult.hasErrors());
//                System.out.println(errors.hasErrors());
                System.out.println("Last name: |" + theCustomer.getLastName() + "|");
                System.out.println("here in customer controller");
                if(theBindingResult.hasErrors()){
                        return "customer-form";
                } else {
                        return  "customer-view";
                }
        }
}
