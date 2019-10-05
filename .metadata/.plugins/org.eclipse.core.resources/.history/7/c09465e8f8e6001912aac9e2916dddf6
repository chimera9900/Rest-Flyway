package com.developer.storesws.ui.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.developer.storesws.model.Store;
import com.developer.storesws.service.StoreService;

@Controller
@RequestMapping("/api/stores")
public class StoresUiController {
	@Autowired
	StoreService storeService;
	
	@RequestMapping
	public String allStores(Model model) {
		Collection<Store> stores = storeService.findAll();
		model.addAttribute("stores", stores);
		return "stores/list";
	}

}
