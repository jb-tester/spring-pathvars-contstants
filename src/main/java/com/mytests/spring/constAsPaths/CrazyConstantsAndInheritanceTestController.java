package com.mytests.spring.constAsPaths;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * *
 * <p>Created by irina on 13.10.2020.</p>
 * <p>Project: spring-pathvars-contstants</p>
 * *
 */
@RestController
public class CrazyConstantsAndInheritanceTestController implements BaseMappingsService{


    public static final String VAR_1 = "{var1}";
    public static final String VAR_3 = "{var3:[a-Z]+}";
    public static final String VAR_4 = "/crazyconstants/test3/"+VAR_3;
    public static final String PV_2 = "{pv2:.[0-9A-z]}";
    public static final String VAR_2 = "/crazyconstants/test2/{var2}";


    @GetMapping(VAR_2)
    public String mappingWithConstant2(@PathVariable("var2") String v2) {
        
        
        return "got " + v2;
    }
    @Override
    public String mappingFromService1(@PathVariable("base_pv1") String pv1) {
        return "inheritance1: got "+pv1;
    }

    @Override
    public String mappingFromService2(@PathVariable String base_pv2) {
        return "inheritance2: got "+base_pv2;
    }

   

    @GetMapping("/crazyconstants/test1/" + VAR_1)
    public String mappingWithConstant1(@PathVariable("var1") String var1) {
        return "got "+var1;
    }
    
    @GetMapping(VAR_4)
    public String mappingWithConstant3(@PathVariable("var3") String var3) {
        return "got " + var3;
    }

    @GetMapping("/mappingWithFewPV/{pv1:\\d+[a-z]+}-" + PV_2 + "{pv3}/{pv4:.\\d{1,3}}")
    public String mappingWithFewPV(@PathVariable("pv1") String pv1, @PathVariable("pv2") String pv2, @PathVariable String pv3, @PathVariable String pv4) {
        return "got " + pv1+pv3+pv2;
    }
}
