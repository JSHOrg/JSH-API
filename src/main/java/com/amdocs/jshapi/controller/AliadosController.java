package com.amdocs.jshapi.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AliadosController {

	 @RequestMapping(method = RequestMethod.GET, value = "/aliados")
	    @ResponseBody
	    public List<String> getAliados(/*@PathVariable String TipoAliado*/) {
		  
	        return  Arrays.asList("sup1", "sup2", "sup3");
	    }
}
