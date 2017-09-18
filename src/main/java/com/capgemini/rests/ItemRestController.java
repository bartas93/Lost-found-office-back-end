package com.capgemini.rests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.service.ItemService;
import com.capgemini.to.ItemCardTo;
import com.capgemini.to.ItemTableTo;
import com.capgemini.to.ItemTo;

@CrossOrigin
@RestController
@RequestMapping("/item")
public class ItemRestController {

	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "/cards", method = RequestMethod.GET)
	public List<ItemCardTo> getItemCardsTo() {
		return itemService.getItemsCardTo();
	}

	@RequestMapping(value = "/table-lost", method = RequestMethod.GET)
	public List<ItemTableTo> getItemTableToLost() {
		return itemService.getItemsTableToLost();
	}

	@RequestMapping(value = "/table-found", method = RequestMethod.GET)
	public List<ItemTableTo> getItemTableToFound() {
		return itemService.getItemsTableToFound();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ItemTo getItemById(@PathVariable("id") Long id) {
		return itemService.getItemById(id);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public @ResponseBody ItemTo saveItemTo(@RequestBody ItemTo itemTo) {
		return itemService.save(itemTo);
	}

}
