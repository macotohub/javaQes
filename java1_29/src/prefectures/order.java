package prefectures;

import java.util.Arrays;
import java.util.Collections;

public class order {
	String order;
	int[] n;
	Integer[] newIndex;
	
	public order() {
	}
	
	// 型変換された配列を昇順or降順に並び替え
	public Integer[] arrayOrder(int[] n , String order) {
		this.n = n;
		this.order = order;
		
		if(order.equals("昇順")) {
			newIndex = new Integer[n.length];
			for(int i = 0; i < n.length; i++) {
				newIndex[i] = Integer.valueOf(n[i]);
			}
			Arrays.sort(newIndex);
		}
		else if(order.equals("降順")) {
			newIndex = new Integer[n.length];
			for(int i = 0; i < n.length; i++) {
				newIndex[i] = Integer.valueOf(n[i]);
			}
			Arrays.sort(newIndex, Collections.reverseOrder());
		}
		return newIndex;
	}
}

// 自分用メモ
// 文字列比較の時は比較演算子ではなく、equals()メソッドを使うこと
