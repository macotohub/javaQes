package java1_28loading;

public class Scientific extends Animal{
	public Scientific() {
	}
	
	// 動物名に応じて学名を決める
	public String settingScientificName(String animalName) {
		switch(animalName) {
		case "ライオン":
			return "パンテラ レオ";
		case "ゾウ":
			return "ロキソドンタ・サイクロティス";
		case "パンダ":
			return "アイルロポダ・メラノレウカ";
		case "チンパンジー":
			return "パン・トゥログロディテス";
		case "シマウマ":
			return "チャップマンシマウ";

		default:
			return "不明";
		}
	}
}
