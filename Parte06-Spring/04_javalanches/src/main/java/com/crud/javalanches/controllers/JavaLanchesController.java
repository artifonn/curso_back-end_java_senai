package com.crud.javalanches.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JavaLanchesController {
   @Autowired
    //TODO: Criar obejto da interface


    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/novaCategoria", method = RequestMethod.GET)
    public String novaCategoria(){
        return "nova_categoria";

    }

    @RequestMapping(value = "/novaCategoria", method = RequestMethod.POST)
    public String novaCategoria(Categoria){
        // TODO: TERMINAR O Metódo

    }


}
