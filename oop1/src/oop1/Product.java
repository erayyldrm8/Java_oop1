package oop1;

// classlar PascalCase isimlendirilir(Product)
public class Product {

	// Class ın fieldları(alanları) camelCase yazılır

	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		//discount=discount+5;   sepette %5 indirim daha
		return discount;
	}

	public void setDiscount(double discount) { //bunu silersen bir daha atanamaz
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
