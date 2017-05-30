/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation.controller;

import java.util.List;
import static org.aspectj.weaver.MemberImpl.method;
import static org.aspectj.weaver.MemberImpl.method;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.RequestEntity.method;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import reservation.entity.Hotel;
import reservation.service.HotelServiceCrud;

/**
 *
 * @author formation
 */
@Controller
@RequestMapping(value="/hotel")
public class HotelController {
    
    @Autowired
    private HotelServiceCrud service;
    
    
    
    @RequestMapping(value ="modifier/{id}")
    public String  modifier(Model model ,@PathVariable("id") long idHotel){
        
        Hotel h = service.findOne(idHotel);
        
        model.addAttribute("hotel", h);
        return "hotel/modifier.jsp";  
       
    }
    
    @RequestMapping(value = "/ajouter", method = RequestMethod.GET)
    public String ajouterGet(Model model){
        
        model.addAttribute("hotel", new Hotel());
        
        return "/hotel/ajouter.jsp";
        
    }
    
      @RequestMapping(value = "/ajouter", method = RequestMethod.POST)
    public String ajouterPOST(@model.addAttribute Hotel h){
        
        ();
        
        return "/hotel/ajouter.jsp";
        
    }
    
    @RequestMapping(value = "/supprimer/{idHotel}")
    public String supprimer(@PathVariable(value = "idHotel") long id){
        
       this.service.delete(id);
        return "redirect:/hotel/lister";
        
   
    }

     @RequestMapping(value ="/lister")
     public String LisrerHoterl(Model model){
        // recupere liste hotels et la passe en attribue a la vue 
        List<Hotel>  hotels = (List<Hotel>) service.findAll();
        model.addAttribute("listeHotels", hotels);
         
        // renvoie a la vue
        return"hotel/lister.jsp";
        
    }    
}
