package com.mytests.spring.constAsPaths;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * *
 * <p>Created by irina on 13.10.2020.</p>
 * <p>Project: spring-pathvars-contstants</p>
 * *
 */
public interface BaseMappingsService {

    @RequestMapping("/inheritance_test1/{base_pv1}")
    public String mappingFromService1(@PathVariable String base_pv1);
    @RequestMapping("/inheritance_test2/{base_pv2}")
    public String mappingFromService2(String pv2);
    
}
