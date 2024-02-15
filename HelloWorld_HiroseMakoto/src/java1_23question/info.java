package java1_23question;

public class info {
	// フィールドに宣言
	private String animalName;
	private Double height;
	private Integer speed;
	// setter
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// getter
	public String getAnimalName() {
		return animalName;
	}
	public Double getHeight() {
		return height;
	}
	public Integer getSpeed() {
		return speed;
	}
}