package oop1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Product product1 = new Product();//class PascalCase, değişken camelCase
		/*product1.name = "Delonghi Kahve Makinesi"; // set value
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;
		product1.imageUrl = "photo1.jpg";*/
		
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageUrl("photo1.jpg");
		
		// System.out.println(product1.name); //get
		
		//------------------------------------------------------------------------
		Product product2 = new Product();
		/*product2.name = "Smeg Kahve Makinesi";
		product2.unitPrice = 6500;
		product2.discount = 8;
		product2.unitsInStock = 2;
		product2.imageUrl = "photo2.jpg";*/
		
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(6500);
		product2.setDiscount(8);
		product2.setUnitsInStock(2);
		product2.setImageUrl("photo2.jpg");
		//------------------------------------------------------------------------
		Product product3 = new Product();
		/*product3.name = "Kitchen Aid Kahve Makinesi";
		product3.unitPrice = 4500;
		product3.discount = 9;
		product3.unitsInStock = 4;
		product3.imageUrl = "photo3.jpg";*/
		
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrice(4500);
		product3.setDiscount(9);
		product3.setUnitsInStock(4);
		product3.setImageUrl("photo3.jpg");
		//------------------------------------------------------------------------
		//Product[] products=new Product[] {product1,product2,product3};
		
		/*
		Product[] products=new Product[3];  
		products[1]=product1; 
		products[2]=product2;
		products[3]=product3;
		*/
		
		Product[] products={product1,product2,product3};
		
		System.out.println("<ul>");//unordered list   HTML
		for(Product productLoop:products) {
			//System.out.println("<li>" + productLoop.name + "</li>");//list item 
			System.out.println("<li>" + productLoop.getName() + "</li>");//list item, set/get yapınca
		}
		System.out.println("</ul>");
		//------------------------------------------------------------------------
		IndividualCustomer individualCustomer1=new IndividualCustomer();
		individualCustomer1.setId(1);
		individualCustomer1.setPhone("0532 *** 1414");
		individualCustomer1.setCustomerNumber("12345");
		individualCustomer1.setFisrtName("Engin");
		individualCustomer1.setFisrtName("Demiroğ");
		
		//------------------------------------------------------------------------
		CorporateCustomer corporateCustomer1=new CorporateCustomer();
		corporateCustomer1.setId(2);
		corporateCustomer1.setPhone("0532 *** 2022");
		corporateCustomer1.setCustomerNumber("99999");
		corporateCustomer1.setCompanyName("KOdlama.io");
		corporateCustomer1.setTaxNumber("51648534261");
		
		Customer[] customers=new Customer[]{individualCustomer1,corporateCustomer1}; //çünkü bunlar Customer classını içerir
		
		
	}

}
