package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 下記9個をローカル変数として宣言のみしてください
		// それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		// 初期化をしたそれぞれの変数に下記の値を代入してください
		
		// バイト型
			byte i;
			i = 0;
			i = 10;
		
		// 短整数型
			short i1;
			i1 = 0;
			i1 = 100;
		
		// 整数型
			int i2;
			i2 = 0;
			i2 = 1000;
		
		// 長整数型
			long i3;
			i3 = 0;
			i3 = 10000;
		
		// 単精度浮動小数点数型
			float i4;
			i4 = 0.0f;
			i4 = 9.5f;
		
		// 倍精度浮動小数点数型
			double i5;
			i5 = 0.0d;
			i5 = 10.5d;
			
		// 文字型
			char i6;
			i6 = '\u0000';
			i6 = 'a';
		
		// 文字列型
			String i7;
			i7 = null;
			i7 = "ハロー";
			
		// ブーリアン型
			boolean i8;
			i8 = false;
			i8 = true;
		
		
		// 下記の通りにコンソール出力されるようにしてください
		// 上記で作成した変数を必ず使用すること
			// 11110
			System.out.println(i3 + i2 + i1 + i);
			// 20
			System.out.println(i * 2);
			// a ハロー true
			System.out.println(i6 + i7 + i8);
			// 11130　数字を全て足す
			System.out.println(i + i1 + i2 + i3 + i4 + i5);
			// 10000000000　小数点以外の数字を全てかける
			System.out.println(i * i1 * i2 * i3);
			// 0.015　10.5割る100をする
			System.out.println(i5 / i1);
			// -90　10引く100をする
			System.out.println(i - i1);
			
			// 改行
			System.out.println();
			
			
		// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		// 「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
			String num="20";
			int num1=23;
			// Stringクラスをint型に変換する
			int number = Integer.parseInt(num);
			// 「ハローJAVA43」の表示
			System.out.println("ハローJAVA"+(number+num1));
			
			// 改行
			System.out.println();
			
		
		// 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		// ローカル変数に代入し○○に入れてください
		// 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		
			// ↓↓format↓↓
			// 「初めまして○○です」
			// 「年齢は○○歳です」
			// 「身長は○○cmです」
			// 「体重は○○kgです」
			// 「好きな食べ物は○○です」
		
			String name = "山田太郎";
			int age = 18;
			double height = 170.5;
			double weight = 62.2;
			String food = "寿司";
			
			// 初めまして山田太郎です
			System.out.println("初めまして" + name + "です");
			// 年齢は18歳です
			System.out.println("年齢は" + age + "歳です");
			// 身長は170.5cmです
			System.out.println("身長は" + height + "cmです");
			// 体重は62.2kgです
			System.out.println("体重は" + weight + "kgです");
			// 好きな食べ物は寿司です
			System.out.println("好きな食べ物は" + food + "です");
			
			// 改行
			System.out.println();
			
		
		// 6で作成した自己紹介に続いてBMIが出力されるようにしてください
		// 「BMIは○○です」
		// ただし計算は数値を直書きせず、全て変数を使ってすること
			// 身長の値をcmからmにする
			double m = height/100;
			// BMIの計算
			double result = weight / (m * m);
			// 小数第二位で四捨五入する
			double bmi = ((double)Math.round(result * 10))/10;
			// BMIは21.4です
			System.out.println("BMIは" + bmi +"です");
			
			// 改行
			System.out.println();
			
		
		// 6で宣言した変数に再代入し下記の通りコンソールに出力してください
			// 再代入
			name = "鈴木一郎";
			age = 24;
			height = 168.5;
			weight = 64.2;
			food = "オムライス";
			m = height/100;
			result = weight / (m * m);
			bmi = ((double)Math.round(result * 10))/10;
			
			// 初めまして鈴木一郎です
			System.out.println("初めまして" + name + "です");
			// 年齢は24歳です
			System.out.println("年齢は" + age + "歳です");
			// 身長は168.5cmです
			System.out.println("身長は" + height + "cmです");
			// 体重は64.2kgです
			System.out.println("体重は" + weight + "kgです");
			// 好きな食べ物はオムライスです
			System.out.println("好きな食べ物は" + food + "です");
			// BMIは22.6です
			System.out.println("BMIは" + bmi + "です");
			
			// 改行
			System.out.println();
			
		
		// 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
			// 和算で自己代入
			age += 24;
			height += 168.5;
			weight += 64.2;
			m = height/100;
			result = weight / (m * m);
			bmi = ((double)Math.round(result * 100))/100;
			
			// 初めまして鈴木一郎です
			System.out.println("初めまして" + name + "です");
			// 年齢は48歳です
			System.out.println("年齢は" + age + "歳です");
			// 身長は337.0cmです
			System.out.println("身長は" + height + "cmです");
			// 体重は128.4kgです
			System.out.println("体重は" + weight + "kgです");
			// 好きな食べ物はオムライスです
			System.out.println("好きな食べ物は" + food + "です");
			// BMIは11.31です
			System.out.println("BMIは" + bmi + "です");
			
			// 改行
			System.out.println();
			
	
		// 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
			//　再定義
			age = 24;
			height = 168.5;
			weight = 64.2;
			food = "オムライス";
			m = height/100;
			result = weight / (m * m);
			bmi = ((double)Math.round(result * 10))/10;
					
			// 年齢が25歳以上ならtrue
			System.out.println(age >= 25);
			
			// 改行
			System.out.println();
			
		
		// 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
			// 数値型を文字列型に変換
			String age2 = String.valueOf(age);
			String height2 = String.valueOf(height);
			String weight2 = String.valueOf(weight);
			
			// 繋げて出力
			System.out.println(age2 + height2 + weight2);
			
			// 改行
			System.out.println();
			
		
		// 11で変換した【年齢・身長】を整数型に変換して出力してください
			// 整数型に変換
			int age3 = Integer.parseInt(age2);
			// 倍精度浮動小数点数型に変換
			double height3 = Double.parseDouble(height2);
			// 小数点型から整数型に変換
			int height4 = (int)height3;
			
			// 出力
			System.out.println(age3);
			System.out.println(height4);
			
			// 改行
			System.out.println();
			
		
		// 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		// ただしif文は使わないでください
			// 年齢が25もしくは身長が160以上 であればtrue
			System.out.println(age3 >= 25 || height4 >= 160);
	}
}
