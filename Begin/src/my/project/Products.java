package my.project;

import javax.swing.ImageIcon;

public class Products {
	private String products_Name;
	private int products_Price;
	private ImageIcon products_Img;

	public Products() {
		
	}
	
	public Products(String products_Name, int products_Price,
			ImageIcon products_Img) {
		this.products_Name = products_Name;
		this.products_Price = products_Price;
		this.products_Img = products_Img;
	}
}
