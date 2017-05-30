/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author formation
 */
@Controller
@RequestMapping(value = "/test", method = RequestMethod.GET)
public class TestController {

    @RequestMapping(value = "/hello")
    public String holloter() {

        return "existepoint.jsp";
    }

    @RequestMapping(value = "/hello/{numSerie}")
    public String holloter2(@PathVariable("numSerie") long ns) {

        System.out.print("*******" + ns);
        return "nada.jsp";
    }
    
    @RequestMapping(value="/coucou/{a}/{b}")
    public String holloter3(@PathVariable("b") int monB,@PathVariable("a") int monA){
        
        System.out.print(String.format("%s %s", monB ,monA));
        
        return "Cacaouette.jsp";
        
    }
}
