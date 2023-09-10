package br.com.adaltonjunior.DemoSheen.products.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product {
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(Long id, String type, String img, String description, Integer rating, Double price, Double oldPrice,
			Boolean isNew, Boolean isOutOfStock, Boolean isSale) {
		super();
		this.id = id;
		this.type = type;
		this.img = img;
		this.description = description;
		this.rating = rating;
		this.price = price;
		this.oldPrice = oldPrice;
		this.isNew = isNew;
		this.isOutOfStock = isOutOfStock;
		this.isSale = isSale;
	}

	@Id
	@Column(name = "ID")
	Long id;
	
	@Column(name = "TYPE")
	String type;
	
	@Column(name = "IMG")
	String img;
	
	@Column(name = "DESCRIPTION")
	String description;
	
	@Column(name = "RATING")
    Integer rating;
	
	@Column(name = "PRICE")
    Double price;
	
	@Column(name = "OLD_PRICE")
    Double oldPrice;
    
	@Column(name = "NEW")
    Boolean isNew;
	
	@Column(name = "OUT_OF_STOCK")
    Boolean isOutOfStock;
	
	@Column(name = "SALE")
	Boolean isSale;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getOldPrice() {
		return oldPrice;
	}

	public void setOldPrice(Double oldPrice) {
		this.oldPrice = oldPrice;
	}

	public Boolean getIsNew() {
		return isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	public Boolean getIsOutOfStock() {
		return isOutOfStock;
	}

	public void setIsOutOfStock(Boolean isOutOfStock) {
		this.isOutOfStock = isOutOfStock;
	}

	public Boolean getIsSale() {
		return isSale;
	}

	public void setIsSale(Boolean isSale) {
		this.isSale = isSale;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", description=" + description + ", price=" + price + ", oldPrice=" + oldPrice + "]";
	}
	
}
