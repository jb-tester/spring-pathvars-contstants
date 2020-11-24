package com.mytests.spring.constAsPaths;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * *
 * <p>Created by ${USER} on ${DATE}.</p>
 * <p>Project: ${PROJECT_NAME}</p>
 * *
 */
@Controller
public class ModelAttrsAsMethods {
    @ModelAttribute("style1_method_return_value")
    public String controller1ModelAttr1(){
        return "model attr, added to model  via @ModelAttribute-annotated method return value";
    }

    @ModelAttribute
    public void controller1ModelAttr2(Model model){
        model.addAttribute("style2_void_method_body", "model attr, added to model in @ModelAttribute-annotated void method body" );

    }
    @ModelAttribute("mixed_style_return_value")
    public String controller1ModelAttr3(Model model){
        model.addAttribute("mixed_style_method_body","model attr, added to model in non-void @ModelAttribute-annotated method body" ); // this ma is not resolved
        return "model attr, added to model via @ModelAttribute-annotated method return value too";
    }

    @RequestMapping("/checkModelAttributeMethods")
    public String checkModelAttributeMethods(ModelMap model) {
        model.addAttribute("checkModelAttributeMethods_attr1", "checkModelAttributeMethods_attr1");
        return "m3";
    }
}
