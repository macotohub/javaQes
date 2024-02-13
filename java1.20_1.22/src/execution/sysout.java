package execution;

import process.process;

public class sysout {
	public static void main(String[] args) {
		// 挨拶メソッドの呼び出し、引数を代入し結果を出力
		// 自分用メモ、これにより引数に異なるワードを入れて出力することもできる！
		process p = new process("日本","寿司","和食");
		p.greet();
	}
}