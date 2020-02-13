package com.mytests.spring.constAsPaths;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IDEA_121150_Controller {
    public static final String CONST = "/const";
    public static final String EXPLICIT = "/testExplicitConst/{arg}";

    @RequestMapping("/testExplicit/{arg}") // works
    public String testExplicit(@PathVariable("arg") final String arg) {
        return arg;
    }

    @RequestMapping("/testImplied/{arg}") // works
    public String testImplied(@PathVariable final String arg) {
        return arg;
    }

    @RequestMapping("/shouldGiveWaring") // no warning (and should give one)
    public String shouldGiveWaring(@PathVariable final String arg) {
        return arg;
    }

    @RequestMapping(EXPLICIT) // Cannot resolve path variable 'arg' in @RequestMapping
    public String testExplicitConst(@PathVariable("arg") final String arg) {
        return arg;
    }

    @RequestMapping(CONST + "/{arg}") // Cannot resolve path variable 'arg' in @RequestMapping
    public String testFrontConst(@PathVariable("arg") final String arg) {
        return arg;
    }

    @RequestMapping("/{arg}" + CONST) // Cannot resolve path variable 'arg' in @RequestMapping
    public String testTailConst(@PathVariable("arg") final String arg) {
        return arg;
    }

}