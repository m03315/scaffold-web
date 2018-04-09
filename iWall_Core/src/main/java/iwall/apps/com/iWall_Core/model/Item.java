package iwall.apps.com.iWall_Core.model;

public class Item {
	
	private long id;
	private String name;
	private String description;
	private double price;
	private double discountPrice;
	private String imgURL;
	
	public Item(long id, String name, String description, double price, double discountPrice, String imgURL) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.discountPrice = discountPrice;
		this.imgURL = imgURL;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
}
