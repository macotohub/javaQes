package curriculum_New_question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッド
	public static String Hello(String java , int num) {
		return java + num;
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッド
	public static int times(int x , int y) {
		return x * y;
	}
	
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッド
	public static void array(int[] arr) {
		for(int list:arr) {
			System.out.println(list);
		}
	}
	
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力
	public static double times(double x1 , double y1) {
		return x1 + y1;
	}
	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッド ※0は出力＆格納しない
	public static List<Integer> random(int r) {
		// Listのnumbersにランダムで作成された数字を引数分格納していく
		List<Integer> numbers = new ArrayList<Integer>();
		Random rand = new Random();
		
		for(int i = 1;i <= r;i++) {
			// +1することで0-99→1-100と両辺プラスされる
			// repeat変数にランダム数値を入れて、リストに格納する
			int repeat = rand.nextInt(100) + 1;
			System.out.println(repeat);
			numbers.add(repeat);
		}
		return numbers;
	}
	
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッド
	// ※小数点以下も表示されるように
	public static double average(List<Integer> numbers){
		double sum = 0;
		// 受け取ったリストの値を変数sumへ順に追加していく
		for(double number : numbers) {
			sum += number;
		}
		// 合計値をリストの要素数で割って平均値を出す
		double ave = sum / numbers.size();
		return ave;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力
	public static boolean judge(double ave) {
		// 50以上ならtrue,それ以外はfalseを出力
		if(ave >= 50) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// それぞれの問題メソッド呼び出し
		// Q1
		System.out.println(Hello("Hello JavaSE",11) + "\n");
		// Q2
		System.out.println(times(3,4) + "\n");
		// Q3
		int[] arr = {1,3,5,7,9,11};
		array(arr);
		// Q4
		System.out.println("\n" + times(3.14,6.72) + "\n");
		// Q5,Q6
		double mean = average(random(3));
		System.out.println("\n" + (Math.floor(mean * 100)) / 100 + "\n");
		// Q7
		judge(mean);
	}
}
