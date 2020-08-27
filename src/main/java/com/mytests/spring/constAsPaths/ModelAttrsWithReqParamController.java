package com.mytests.spring.constAsPaths;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * *
 * <p>Created by irina on 06.07.2020.</p>
 * <p>Project: spring-pathvars-contstants</p>
 * *
 */
@Controller
public class ModelAttrsWithReqParamController {
    
    
    @ModelAttribute("mattr2")
    public String mattr2(@RequestParam(name = "rp1", defaultValue = "dummy parameter") String rp1, 
                         @RequestParam String rp2){
        return "model attr "+rp1+rp2;
    }
    
    @GetMapping("/mapv/m2")
    public String m2(@ModelAttribute("mattr2") String mattr2){
        System.out.println("**********************************");
        System.out.println(mattr2);
        System.out.println("**********************************");
        return "m2";
    }
    
    @GetMapping("/mapv/m3")
    public String m3(){
        
        return "m2";
    }
    
    
    
}
