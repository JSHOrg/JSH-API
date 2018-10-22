package com.amdocs.jshapi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class FamiliasController {
	@RequestMapping(method = RequestMethod.GET, value = "/familias")
	@ResponseBody
	public List<String> getAliados(/*@PathVariable String TipoAliado*/) {
		  
        return  Arrays.asList("sup1", "sup2", "sup3");
    } 
}
