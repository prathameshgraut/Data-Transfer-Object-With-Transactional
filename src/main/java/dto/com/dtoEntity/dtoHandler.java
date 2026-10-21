package dto.com.dtoEntity;

import java.time.LocalDate;
import java.time.LocalTime;

public class dtoHandler {
	
	private String userName;
	private String userEmail;
	private String userAddress;
	private long userMobileNo;
	private short userAge;
	private char userGender;
	private String productName;
	private float productPrice;
	private LocalDate productDeliveryDate;
	private LocalTime productBookingTime;
	private String feedback;
	private short feedbackRating;
	
	 
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public long getUserMobileNo() {
		return userMobileNo;
	}
	public void setUserMobileNo(long userMobileNo) {
		this.userMobileNo = userMobileNo;
	}
	public short getUserAge() {
		return userAge;
	}
	public void setUserAge(short userAge) {
		this.userAge = userAge;
	}
	public char getUserGender() {
		return userGender;
	}
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public LocalDate getProductDeliveryDate() {
		return productDeliveryDate;
	}
	public void setProductDeliveryDate(LocalDate productDeliveryDate) {
		this.productDeliveryDate = productDeliveryDate;
	}
	public LocalTime getProductBookingTime() {
		return productBookingTime;
	}
	public void setProductBookingTime(LocalTime productBookingTime) {
		this.productBookingTime = productBookingTime;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public short getFeedbackRating() {
		return feedbackRating;
	}
	public void setFeedbackRating(short feedbackRating) {
		this.feedbackRating = feedbackRating;
	}	
}