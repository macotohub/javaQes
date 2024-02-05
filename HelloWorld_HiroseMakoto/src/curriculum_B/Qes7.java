package curriculum_B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 生徒の人数を入力する
		Scanner scanner = new Scanner(System.in);
		System.out.print("生徒の人数を入力してください(2以上) : ");
		int count = scanner.nextInt();
		
		// 各教科の名前を配列に格納
		String[] subject = {"英語","数学","理科","社会"};
		// 各教科の点数と生徒の平均点を格納するための変数宣言
		double enP = -1,mathP = -1,sienceP = -1,socialP = -1,ave = -1;
		// 生徒1人ずつの平均点を格納するためのリスト
		List<Double> average = new ArrayList<Double>();
		
		// 各教科の点数を格納するためのリスト
		List<Double> enAverage = new ArrayList<Double>();
		List<Double> mathAverage = new ArrayList<Double>();
		List<Double> sienceAverage = new ArrayList<Double>();
		List<Double> socialAverage = new ArrayList<Double>();
		
		// 生徒の人数分、各教科の点数を入れてもらうためのfor文
		for(int i = 1;i <= count; i++) {
			for(String sub:subject) {
				System.out.print(i + "人目の『" + sub + "』の点数を入力してください : ");
				Scanner point = new Scanner(System.in);

				// 各教科の点数を読み込む
				switch(sub) {
					case "英語":
						enP = point.nextDouble();
						break;
					case "数学":
						mathP = point.nextDouble();
						break;
					case "理科":
						sienceP = point.nextDouble();
						break;
					case "社会":
						socialP = point.nextDouble();
				}
			}
			
			// 改行
			System.out.println("");
			// 生徒ごとに平均点を変数aveに代入し、averageリストに格納する
			ave = (enP + mathP + sienceP + socialP) / 4;
			average.add(ave);
			
			// 各教科の点数もそれぞれのリストに格納
			enAverage.add(enP);
			mathAverage.add(mathP);
			sienceAverage.add(sienceP);
			socialAverage.add(socialP);
		}
		
		// 生徒の人数分for文を回し、平均点を小数第二位まで表示
		for(int i = 1,j = 0; j < average.size() ;i++,j++) {
			System.out.println(i+"人目の平均点は"+ String.format("%.2f", average.get(j)) +"点です。");
		}
		
		// 改行
		System.out.println();
		
		// 各教科リスト内の数値を合計してそれぞれの変数へ代入
		double enSum = enAverage.stream().mapToInt(Double::intValue).sum();
		double mathSum = mathAverage.stream().mapToInt(Double::intValue).sum();
		double sienceSum = sienceAverage.stream().mapToInt(Double::intValue).sum();
		double socialSum = socialAverage.stream().mapToInt(Double::intValue).sum();
		
		// 生徒の人数で割って各教科の平均点をそれぞれの変数へ代入
		double enAve = enSum/count;
		double mathAve = mathSum/count;
		double sienceAve = sienceSum/count;
		double socialAve = socialSum/count;

		// 各教科の平均点を小数第二位まで表示
		System.out.println("英語の平均点は"+ String.format("%.2f", enAve) + "点です。");
		System.out.println("数学の平均点は"+ String.format("%.2f", mathAve) + "点です。");
		System.out.println("理科の平均点は"+ String.format("%.2f", sienceAve) + "点です。");
		System.out.println("社会の平均点は"+ String.format("%.2f", socialAve) + "点です。");
		
		// 全体の平均点を計算し変数allに代入
		double all = 0;
		all = (enAve + mathAve + sienceAve + socialAve) / 4;
		
		// 全体の平均点を小数第二位まで表示
		System.out.println("全体の平均点は"+ String.format("%.2f", all) + "点です。");
		
		scanner.close();
	}
}
