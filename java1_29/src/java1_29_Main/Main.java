package java1_29_Main;

import java.util.Scanner;

import prefectures.PreList;
import prefectures.Prefectures;
import prefectures.order;

public class Main {
	public static void main(String[] args) {
		// 文字入力
		System.out.println("コンソールに入力してください");
		Scanner scanner = new Scanner(System.in);
		String number = scanner.next();
		String order = scanner.next();
		scanner.close();
		
		// 数字は配列に格納
		String[] num = number.split(",");
		
		Prefectures P = new Prefectures();
		order O = new order();
		PreList PL = new PreList();
		
		// メソッド呼び出し
		PL.result(O.arrayOrder(P.index(num),order));
	}
}