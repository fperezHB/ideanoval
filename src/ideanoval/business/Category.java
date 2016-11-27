package ideanoval.business;

public class Category {
	
	private String nameCat;
	private String descCat;
	public String getNameCat() {
		return nameCat;
	}
	public void setNameCat(String nameCat) {
		this.nameCat = nameCat;
	}
	public String getDescCat() {
		return descCat;
	}
	public void setDescCat(String descCat) {
		this.descCat = descCat;
	}
	@Override
	public String toString() {
		return "Category [nameCat=" + nameCat + ", descCat=" + descCat + "]";
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
