package com.avinash.SpringBootWeb;


//without using spring boot we need to extend HttpServlet class to create a Java Servlet
//but in SpringBoot we can directly create a Controller by an Annotation @Controller

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;
import org.springframework.boot.autoconfigure.jms.JmsProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Servlet {
    //in java servlet we will  create a service() method
    //but in SpringBoot we just create a method which returns the jsp files
    //in SpringBoot we can do multiple url mapping

    //url mapping by an annotation @RequestMapping
    @RequestMapping("/")
    public String home(){
        System.out.println("In home...!");
        //returns the jsp file
        //we should mention the jsp file name in return as String
        return "index";
    }

    //we can access the String queries(Info sent by the client) in two ways
    //1. by HttpServletRequest 2. SpringBoot
    //accessing the req data through HttpRequest
    //we will apply getParameter() method

    //for sending response, we can create HttpServletResponse
    //but inorder to share the data among different urls we will use HttpSession object
    //if we setAttribute() in one url, we can use it in other jsp files also
//    @RequestMapping("/submit")
//    public String submit(HttpServletRequest req,HttpSession session){
//        System.out.println("/submit");
//
//        //getParameters() method accepts name of Query as parameter
//        //getParameters() returns String
//        String fname = req.getParameter("fname");
//        String lname = req.getParameter("lname");
//
//        session.setAttribute("fname",fname);
//        session.setAttribute("lname",lname);
//        return "submit";
//    }

    //Now lets access the parameters, using SpringBoot also
    //by RequestParam() Annotation
    //RequestParam() accepts parameter name in brackets
//    @RequestMapping("/submit")
//    public String submit(@RequestParam("fname") String name, HttpSession session){
//        session.setAttribute("name",name);
//        return "submit";
//    }


    //using Model object

//    @RequestMapping("/submit")
//    public String submit(HttpServletRequest req, Model model){
//        System.out.println("/submit");
//
//        //getParameters() method accepts name of Query as parameter
//        //getParameters() returns String
//        String fname = req.getParameter("fname");
//        String lname = req.getParameter("lname");
//
//        model.addAttribute("fname",fname);
//        model.addAttribute("lname",lname);
//        return "submit";
//    }

    //Using ModelAndView
    @RequestMapping("/submit")
    public ModelAndView submit(@RequestParam("fname") String name,ModelAndView mv){
        mv.addObject("name",name);
        mv.setViewName("submit");
        return mv;
    }

    @RequestMapping("/result")
    public String result(){
        return "result";
    }
}
