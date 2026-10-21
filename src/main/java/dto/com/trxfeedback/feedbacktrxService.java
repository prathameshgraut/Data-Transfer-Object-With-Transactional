package dto.com.trxfeedback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.com.Repository.feedbackRepo;
import dto.com.dtoEntity.dtoHandler;
import dto.com.entity.FeedBack;
import dto.com.entity.User;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class feedbacktrxService {
	
	@Autowired
	feedbackRepo feedbackRepo;
	
	@Transactional (value = TxType.REQUIRES_NEW)
	public void feedback(dtoHandler dtoHandler,User user) {
	FeedBack feedBack = new FeedBack();
	feedBack.setFeedback(dtoHandler.getFeedback());
	feedBack.setRating(dtoHandler.getFeedbackRating());
	feedBack.setUserId(user.getId());
	feedbackRepo.save(feedBack);
	}
}
