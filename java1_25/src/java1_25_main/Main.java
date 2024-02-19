package java1_25_main;

import java.util.Random;
import java.util.Scanner;

import java1_25_sub.SubClass;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		Random rand = new Random();
		int[] numbers = new int[5];
		
		SubClass sub = new SubClass();
		//status status = new status();
		sub.setName(name);
		
		
		for(int i = 0 ; i < numbers.length ; i++) {
			int number = rand.nextInt(1000);
			numbers[i] = number;
		}
		
		sub.user();
		//status.statusInfo();
	}

}

		

/*
名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
*/