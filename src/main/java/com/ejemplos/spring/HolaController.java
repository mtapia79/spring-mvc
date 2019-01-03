package com.ejemplos.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HolaController {

    @RequestMapping("irHola")
    public ModelAndView redireccion() {
        ModelAndView MV = new ModelAndView();
        MV.setViewName("hola");
        MV.addObject("mensaje","hola soy un mensaje desde un controller");
        return MV;
    }
}
