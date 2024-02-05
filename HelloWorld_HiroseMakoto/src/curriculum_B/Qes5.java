package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 5 for文を使用して下記の通りに出力してください
		// 変数yはかけられる数、9まで繰り返す
		for(int y=1; y<10; y++) {
			// 変数xはかける数、*20まで繰り返す
			for(int x=1; x<21; x++) {
				// 数値それぞれ０パッティングする
				String y1 = String.format("%03d",y);
				String x1 = String.format("%03d",x);
				// 掛け算の結果を変数resultに代入し、０パッティングする
				int result = x * y;
				String result1 = String.format("%03d", result);
				// 計算式と結果を出力する
				System.out.print(x1+" * "+y1+" = "+result1);
					if(x<20) {
						// *19までは区切るために縦線を入れる
						System.out.print(" || ");
					};
			};
			// 段が変わるごとに改行する
			System.out.println("");
		};	
	};
};
