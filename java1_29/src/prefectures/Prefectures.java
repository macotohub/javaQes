package prefectures;

public class Prefectures {
	String[] num;
	int[] index;
	int no;
	
	public Prefectures() {
	}
	
	// 入力された数字を型変換
	public int[] index(String[] num) {
		this.num = num;
		index = new int[num.length];
		
		for(int i = 0;i < num.length; i++) {
			no = Integer.parseInt(num[i]);
			index[i] = no;
		}
		return index;
	}
}
