package curriculum_New_question;

public class Curriculum_New_1_18 {
	
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void Hello(String java , int num) {
		System.out.println(java + num);
	}
	
		// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		public static void times(int x , int y) {
			System.out.println(x * y);
		}
		
		// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
		public static void array(int[] arr) {
			for(int list:arr) {
				System.out.println(list);
			}
		}
		
		// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
			
		
		// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。

		// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。
		
		// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String java = "Hello JavaSE ";
		int num = 11;
		Hello(java,num);
		
		int x = 3;
		int y = 4;
		times(x,y);
		
		int[] arr = {1,3,5,7,9,11};
		array(arr);
		
	}
}
