package java1_23question;

public class animalInfo {

	public static void main(String[] args) {
		info info = new info();
		
		// 変数に代入する値を引数に入れる
		info.setAnimalName("ライオン");
		info.setHeight(2.1);
		info.setSpeed(80);
		
		// getterを用いて出力
		System.out.println("動物名：" + info.getAnimalName());
		System.out.println("体長：" + info.getHeight() + "m");
		System.out.println("速度：" + info.getSpeed() + "km/h");
	}
}