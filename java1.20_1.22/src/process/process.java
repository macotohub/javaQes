package process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class process {
	// フィールド→このクラスで扱う情報・変数
	// 今回の問題なら寿司や日本など、指定によっては変化しそうな部分を変数宣言する
	String greeting;
	String country;
	String food;
	String cuisine;
	String formatNowDate;
	
	// コンストラクタ
	// 出力の際に引数に入れられた文字列を反映させる
	// 自分用メモ
	// thisはフィールドの変数、右辺は出力時引数に代入された文字列のことを指す
	public process(String country,String food,String cuisine){
		this.greeting = "こんにちは！ここは" + country + "です！";
		this.country = country;
		this.food = food;
		this.cuisine = cuisine;
		LocalDateTime nowDate = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		formatNowDate = dtf.format(nowDate);
	}
	
	// 出力用の挨拶メソッド
	public void greet() {
		System.out.println(greeting);
		System.out.println("この" + food + "はうまい");
		System.out.println(food + "は" + country + "です");
		System.out.println("現在日時は" + formatNowDate + "です");
	}
}