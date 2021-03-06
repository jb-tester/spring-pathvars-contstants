package com.mytests.spring.constAsPaths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    private static final Logger log = LoggerFactory.getLogger(MyRestController.class);

    @GetMapping(MyConstants.CONSTWITHCONCAT)
    public void problematic(@PathVariable String myvar) {
        log.info(myvar);
    }
    
    @GetMapping(MyConstants.FOO+ MyConstants.BAR+"/boo{dummy:"+ MyConstants.REGEX+"}")
    public void fooBar(@PathVariable String foo, @PathVariable String dummy, @PathVariable("bar") String b){
        log.info(foo+b+dummy);
    }

    @RequestMapping("/aaa/{pv1}_{pv2}{pv3}/ccc")
    public String aaa(@PathVariable String pv1, @PathVariable String pv2, @PathVariable String pv3) {
        return "aaa";
    }
}
