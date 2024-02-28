package java1_28loading;

public class DataEntry {
	// 変数宣言
	private String text;
	private String[] animals;
	private String[] animalInfo;
	private String scientificName;
	// Scientificクラス呼び出し
	Scientific S = new Scientific();

	public DataEntry() {
	}

	// 入力された文字を出力するコーナー
	public DataEntry(String text){
		// このtextはMainクラスで入力された文字が代入されたtext変数を使う
		this.text = text;
		// textをカンマ区切りしてanimals配列に代入
		animals = text.split(",");
		// animals配列の個数分繰り返す
		for(String animal:animals) {
			// カンマ区切りされた中身を：区切りしてanimalInfo配列に代入
			animalInfo = animal.split(":");
			
			// 動物名表示
			System.out.println("動物名：" + animalInfo[0]);
			// 体長をdouble型に変換して出力
			S.setWidth(Double.parseDouble(animalInfo[1]));
			System.out.println("体長：" + S.getWidth() + "m");
			// 速度をint型に変換して出力
			S.setSpeed(Integer.parseInt(animalInfo[2]));
			System.out.println("速度：" + S.getSpeed() + "km/h");
			// settingScientificNameメソッドで学名を決め、scientific変数に代入
			scientificName = S.settingScientificName(animalInfo[0]);
			// animalInfo配列にaddScientificNameメソッドで返された配列を代入
			animalInfo = addScientificName();
			// 動物名に応じて学名を表示
			System.out.println("学名：" + scientificName + "\n");
		}
	}

	// animalInfo配列に学名を追加するためのメソッド
	public String[] addScientificName() {
		// 要素4つの配列を作成
		String[] newList = new String[4];
		// ３つめまでanimalInfo配列をコピー
		System.arraycopy(animalInfo, 0, newList, 0, 3);
		// 要素４つめに学名を代入
		newList[3] = scientificName;
		// addScientificNameメソッドが呼び出されたらここで作ったnewKList配列を返す
		return newList;
	}
}