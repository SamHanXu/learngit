package cn.tarena.ht.pojo;

public class Food {
	

	private String id;//菜品id
	private FoodType foodType; //菜品类型
	private String name;  //菜名
	private Integer price;  //价格
	private String picture; //图片地址
	private String des; //菜品详细信息
	private String orderNo;//菜品的序号
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public FoodType getFoodType() {
		return foodType;
	}
	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	 

}
