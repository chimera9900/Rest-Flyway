package com.developer.storesws.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.BasicLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/doc")
public class ServiceDocumentController {
	

	@GetMapping(produces  = "application/hal+json;charset=UTF-8")
	public Resource<String> getServiceDocument(){
		 Resource<String> result = new Resource<>("test",
				 BasicLinkBuilder.linkToCurrentMapping().withSelfRel(),
				 BasicLinkBuilder.linkToCurrentMapping().slash("/store").withRel("stores")
				);
		 
		 return result;
	}

}
