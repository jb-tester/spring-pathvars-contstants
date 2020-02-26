package com.mytests.spring.constAsPaths;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class  IDEA_121150_Controller {
    public static final String MYCONST = "/const";
    public static final String EXPLICIT = "/testExplicitConst/{arg}";

    @RequestMapping("/testExplicit/{arg}")
    public String testExplicit(@PathVariable("arg") final String arg) {
        return arg;
    }

    @RequestMapping("/testImplied/{arg}")
    public String testImplied(@PathVariable final String arg) {
        return arg;
    }

    @RequestMapping("/shouldGiveWaring")
    public String shouldGiveWaring(@PathVariable final String arg) {
        return arg;
    }

    @RequestMapping(EXPLICIT)
    public String testExplicitConst(@PathVariable("arg") final String arg) {
        return arg;
    }

    @RequestMapping(MYCONST + "/{arg}")
    public String testFrontConst(@PathVariable("arg") final String arg) {
        return arg;
    }

    @RequestMapping("/{arg}" + MYCONST)
    public String testTailConst(@PathVariable("arg") final String arg) {
        return arg;
    }

}
