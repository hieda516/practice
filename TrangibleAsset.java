public class TangibleAsset {

	private String name;
	private int price;
	private String color;
	private String isbn;

	public TangibleAsset(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	//	this.isbn = isbn;
	}

	public String getName() { return this.name; }
	public int getPrice() { return this.price; }
	public String getColor() { return this.color; }
	public String getIsbn() { return this.isbn; }
}
