package com.ektha.app.restapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
	
	@RequestMapping(value="/")
	public String list() {
		return "list";
	}
	

}
