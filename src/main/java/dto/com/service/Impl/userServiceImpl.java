package dto.com.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.com.Repository.feedbackRepo;
import dto.com.Repository.productRepo;
import dto.com.Repository.userRepo;
import dto.com.dtoEntity.dtoHandler;
import dto.com.entity.FeedBack;
import dto.com.entity.Product;
import dto.com.entity.User;
import dto.com.service.addRecordService;
import dto.com.trxfeedback.feedbacktrxService;
import jakarta.transaction.Transactional;

@Service
public class userServiceImpl implements addRecordService {

	@Autowired
	userRepo userRepo;

	@Autowired
	feedbacktrxService feedbacktrxService;

	@Autowired
	productRepo productRepo;

	@Transactional
	@Override
	public void addOrder(dtoHandler dtoHandler) {

		User user = CreatedUser(dtoHandler);
		userRepo.save(user);

		Product product = CreatedProduct(dtoHandler, user);
		productRepo.save(product);
		
		feedbacktrxService.feedback(dtoHandler, user);

	}

	private Product CreatedProduct(dtoHandler dtoHandler, User user) {
		Product product = new Product();
		product.setName(dtoHandler.getProductName());
		product.setPrice(dtoHandler.getProductPrice());
		product.setUserId(user.getId());
		product.setBookingTime(dtoHandler.getProductBookingTime());
		product.setDeliveryDate(dtoHandler.getProductDeliveryDate());
//		System.out.println(10/0);
		return product;
	}

	private User CreatedUser(dtoHandler dtoHandler) {
		User user = new User();
		user.setName(dtoHandler.getProductName());
		user.setAddress(dtoHandler.getUserAddress());
		user.setEmail(dtoHandler.getUserEmail());
		user.setMobileNo(dtoHandler.getUserMobileNo());
		user.setAge(dtoHandler.getUserAge());
		user.setGender(dtoHandler.getUserGender());
		return user;
	}
}