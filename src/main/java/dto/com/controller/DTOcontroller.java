package dto.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dto.com.dtoEntity.dtoHandler;
//import dto.com.entity.FeedBack;
//import dto.com.entity.Product;
//import dto.com.entity.User;
import dto.com.service.addRecordService;

@RestController
public class DTOcontroller {
	
	@Autowired
	addRecordService addRecordService;
	
	@PostMapping("/bookOrder")
	public String addOrder(@RequestBody dtoHandler dtoHandler) {
		addRecordService.addOrder(dtoHandler);
		return "Order Booked";
	}
}
