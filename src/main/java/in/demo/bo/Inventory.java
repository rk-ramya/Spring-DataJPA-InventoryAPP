package in.demo.bo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inventory implements Serializable
{
	@Id
	private Integer id;
	private String productName;
	private Integer itemsInStock;
	private Double price;
	private Integer user;
	public Integer getUserID() {
		return user;
	}
	public void setUserID(Integer userID) {
		this.user = userID;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getItemsInStock() {
		return itemsInStock;
	}
	public void setItemsInStock(Integer itemsInStock) {
		this.itemsInStock = itemsInStock;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Inventory [id=" + id + ", productName=" + productName + ", itemsInStock=" + itemsInStock + ", price="
				+ price + ", userID=" + user + "]";
	}
	

}
