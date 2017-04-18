package com.apex.db.order.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="`order`")
public class OrderEntity {

	private int orderId;
	private int itemCount;
	private double orderTotal;
	private String card;
	private String personName;
	private String shippingAddress;
	
	
	public OrderEntity() {
	super();
	}
	public OrderEntity(int itemCount, double orderTotal, String card, String personName, String shippingAddress) {
		super();
		this.itemCount = itemCount;
		this.orderTotal = orderTotal;
		this.card = card;
		this.personName = personName;
		this.shippingAddress = shippingAddress;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_id" , unique= true, nullable = false)
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	@Column(name="itemcount")
	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	@Column(name="order_total")
	public double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}
	@Column(name="card")
	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}
	@Column(name="person_name")
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Column(name="shipping_address")
	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}



}
