package prefectures;

public class PreList{
	Integer[] list;
	
	public PreList(){	
	}
	
	String[][] Prefectures = {{"0","北海道","札幌市","83424"},
			{"1","青森県","青森市","9646"},
			{"2","岩手県","盛岡市","15275"},
			{"3","宮城県","仙台市","7282"},
			{"4","秋田県","秋田市","11638"},
			{"5","山形県","山形市","9323"},
			{"6","福島県","福島市","13784"},
			{"7","茨城県","水戸市","6097"},
			{"8","栃木県","宇都宮市","6408"},
			{"9","群馬県","前橋市","6362"},
			{"10","埼玉県","さいたま市","3798"}
	};
	
	// 並び替えされた配列から都道府県情報を出力
	public void result(Integer[] list) {
		this.list = list;
		for(int i = 0;i < list.length; i++) {
			System.out.println("都道府県名：" + Prefectures[list[i]][1]);
			System.out.println("県庁所在地：" + Prefectures[list[i]][2]);
			System.out.println("面積：" + Prefectures[list[i]][3] + "km2\n");
		}
	}
}