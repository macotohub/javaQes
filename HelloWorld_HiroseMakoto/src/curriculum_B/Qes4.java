package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 4 for文を使用して出力
		// 変数xは段数、９の段まで繰り返す
		for(int x=1; x<10; x++) {
			// 変数yはかける数、*９まで繰り返す
			for(int y=1; y<10; y++) {
				// 数値それぞれ０パッティングする
				String x1 = String.format("%02d",x);
				String y1 = String.format("%02d",y);
				// 掛け算の結果を変数resultに代入し、０パッティングする
				int result = x * y;
				String result1 = String.format("%02d", result);
				// 計算式と結果を出力する
				System.out.print(x1+" * "+y1+" = "+result1);
					if(y<9) {
						// *８までは区切るために縦線を入れる
						System.out.print(" || ");
					};
			};
			// 段が変わるごとに改行する
			System.out.println("");
		};
	};
};
