package com.capgemini.rests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.service.ItemService;
import com.capgemini.to.ItemCardTo;

@RestController
@RequestMapping("/item")
public class ItemRestController {

	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "/cards", method = RequestMethod.GET)
	public List<ItemCardTo> getItemCardsTo() {
		return itemService.getItemsCardTo();
	}

}
