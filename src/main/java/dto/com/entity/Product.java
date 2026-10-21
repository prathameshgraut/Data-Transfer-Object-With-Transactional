package dto.com.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private float price;
	private int userId;
	
	@CreationTimestamp
	private LocalDate deliveryDate;
	@CreationTimestamp
	private LocalTime bookingTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public LocalTime getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(LocalTime bookingTime) {
		this.bookingTime = bookingTime;
	}
}