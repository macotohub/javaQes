package java1_23question;

public class info {
	// フィールドに宣言
	private String animalName;
	private Double height;
	private Integer speed;
	
	// コンストラクタ
	public info(String animalName,Double height,Integer speed){
		// nullチェック
		if((animalName != null) || (height != null) || (speed != null)) {
			this.animalName = animalName;
			this.height = height;
			this.speed = speed;			
		}
	}
	
	// getterとsetter
	public String getAnimalName() {
		return animalName;
	}
	
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	
	public Double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Integer getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// 文字列を返す、animalInfoで出力する用
	public String toStirng() {
		return "動物名：" + animalName + "\n" 
				+ "体長：" + height + "m" + "\n" 
				+ "速度：" + speed + "km/h";
	}
}