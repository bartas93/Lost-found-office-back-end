package com.capgemini.rests;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.dataaccess.enums.Category;
import com.capgemini.dataaccess.enums.ItemStatus;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/enum")
public class EnumRestController {

	@RequestMapping(value = "/itemstatus", method = RequestMethod.GET)
	public List<String> getAllItemStatus() {
		return Stream.of(ItemStatus.values()).map(Enum::name).collect(Collectors.toList());
	}

	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	public List<String> getAllCategories() {
		return Stream.of(Category.values()).map(Enum::name).collect(Collectors.toList());
	}

}
