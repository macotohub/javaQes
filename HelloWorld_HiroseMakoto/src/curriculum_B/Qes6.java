package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// テレビとディスプレイ用の変数宣言と値の初期化
		int tv = -1;
		
		// コンソールに文字を入力
		Scanner scanner = new Scanner(System.in);
		// 入力した文字を「、」区切りでarray配列に格納
		String[] array = scanner.next().split("、");
		// 在庫残数用、変数remainingに0-11までのランダムな数値を入れる
		Random rand = new Random();
		int remaining = rand.nextInt(12);
		
		// 入力した文字を変数str１つずつ代入、配列内の個数分繰り返す
		for(String str:array) {
			switch(str) {
				// これらの家電だったら残数を表示
				case "パソコン","冷蔵庫","扇風機","洗濯機","加湿器":
					System.out.println(str + "の残り台数は" + remaining + "台です\n");
					break;
					
				// 	テレビかディスプレイだった場合
				case "テレビ","ディスプレイ":
					// 変数tvが-1だったらランダムな変数を代入そうでなかったら11からtvを引く
					tv = tv == -1 ? remaining : 11 - tv;
					System.out.println(str + "の残り台数は" + tv + "台です\n");
					break;
					
				// 指定の家電以外が入力されたらエラー文を表示させる	
				default:
					System.out.println("『" + str + "』は指定の商品ではありません\n");
			}
		}
		scanner.close();
	}
}
