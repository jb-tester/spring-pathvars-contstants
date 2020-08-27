package com.mytests.spring.constAsPaths;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * *
 * <p>Created by irina on 06.07.2020.</p>
 * <p>Project: spring-pathvars-contstants</p>
 * *
 */
@Controller
public class ModelAttrsWithPathVarsController {
    
    @ModelAttribute("mattr1")
    public String mattr1(@PathVariable("pv1") String pv1, @PathVariable String pv2){
        return "model attr "+pv1+pv2;
    }
    
    @GetMapping("/mapv/m1/{pv1}/{pv2}")
    public String m1(@ModelAttribute String mattr1){
        
        return "m1";
    }
    
}
