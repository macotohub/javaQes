package java1_23question;

public class animalInfo {

	public static void main(String[] args) {
		info info = new info("ライオン",2.1,80);
		System.out.println(info.toStirng());
	}
}

/*
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
	体長：2.1m
	速度：80km/h
*/