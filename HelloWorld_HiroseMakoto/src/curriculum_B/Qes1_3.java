package curriculum_B;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 1 ログイン時の入力チェックシステム作成
		
		// do-while文の中身、入力チェック用
		boolean check = false;
		
		// 正しいユーザー名が入力されるまで繰り返す
		do {
		// コンソール入力された文字を読み込む
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		// 正規表現チェック用、半角英数字のみ
		Pattern p = Pattern.compile("^[A-Za-z0-9]+$");
		Matcher m = p.matcher(line);
		
			// もし値がないor0文字だった場合、入力してくださいというエラーを出す
			if(line == null || line.length() == 0) {
				System.out.println("名前を入力してください");
				check = false;
			}
			// 10文字以上だった場合は10文字以内にしてくださいというエラーを出す
			else if(line.length() > 10) {
				System.out.println("名前を10文字以内にしてください");
				check = false;
			}
			// 2
			// ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
			else if(m.find() == false) {
				System.out.println("半角英数字のみで名前を入力してください");
				check = false;
			}
			// 正しく登録されたら登録しましたと出してdo-while文から抜ける
			else {
				check = true;
				System.out.println("ユーザー名「" + line + "」を登録しました");
				break;
			}
			scanner.close();
		// tureになったら抜ける
		}while(!check);

		// 勝ち負け判定用
		boolean judge = false;
		// 勝つまでにかかった合計回数カウントアップ用
		int count = 0;
		
		// 3 じゃんけんシステムの作成
		// 勝つまでループする
		while(!judge) {
			// ユーザーの手、getUserメソッドから取得
			int user = getUser();
			// 相手PCの手、getPcメソッドから取得
			int pc = getPc();
			// じゃんけん結果、jankenJudgeメソッドから取得
			String result = jankenJudge(user,pc);
			// 両者の手と結果出力、showResultメソッドから取得
			showResult(user,pc,result);
			
			// 自分ユーザーが勝った場合繰り返しから抜けてカウント1回足す
			if((user==0 && pc==1)||(user==1 && pc==2)||(user==2 && pc==1)){
				judge = true;
				count ++;
				break;
			} else {
				// 負けかあいこは繰り返す、カウント1回足す
				judge = false;
				count ++;
			};
		};
		// 勝つまでにかかった回数の出力
		System.out.println("");
		System.out.println("勝つまでにかかった合計回数は"+count+"回です。");
	};
		
	// 自分ユーザーの手を取得したい
	public static int getUser() {
		// コンソールに入力されたものを取得→userHand
		Scanner userHand = new Scanner(System.in);
		
		// 正しく入力されるまで繰り返す
		while(true) {
			// じゃんけんの手入力ルール出力
			System.out.println("");
			System.out.println("あなたのじゃんけんの手を入力してください。");
			System.out.println("0はグー、1：チョキ、2：パー");
			
			// userHandに入力されたものを判定する
			if(userHand.hasNextInt()) {
				// 整数
				int number = userHand.nextInt();
				// 0~2以外の整数が入力された場合エラー出力、正しく入力されるまで繰り返す
				if(number<=-1||number>=3) {
					System.out.println("【エラー】入力できるのは0~2のみです");
					continue;
				} else {
					// 正しかったらその値をnumberに返す
					return number;
				}
			} else {
				// 整数以外が入力された場合エラー出力、正しく入力されるまで繰り返す
				System.out.println("【エラー】入力できるのは整数のみです");
			};
			userHand.close();
		}
	};
		
	// 相手の手をランダムに出力させる
	public static int getPc() {
		Random rand = new Random();
		// 0~2でランダムに出た値を返す
		return rand.nextInt(3);
	};
		
	// じゃんけんの結果によって出力される文言を変えたい
	public static String jankenJudge(int user ,int pc) {
		// 結果別に文言を入れるための変数を用意
		String result = "";
		// もし自分が勝ったらやるやんメッセージを入れる
		if((user==0 && pc==1)||(user==1 && pc==2)||(user==2 && pc==1)){
			result = "やるやん。\n次は俺にリベンジさせて";
		} else if(user==1 && pc==0) {
			// 自分がグーに負けた時のメッセージを入れる
			result = "俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ！";
		} else if(user==2 && pc==1) {
			// 自分がチョキに負けた時のメッセージを入れる
			result = "俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ";
		} else if(user==0 && pc==2) {
			// 自分がパーに負けた時のメッセージを入れる
			result = "俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです";
		} else {
			// あいこだった時のメッセージを入れる
			result = "DRAW あいこ もう一回しましょう！";
		}
		// 結果別のメッセージを入れて返す
		return result;
	};
	
	// 両者の手と結果を出力する場所
	public static void showResult(int user,int pc,String result) {
		String[] janken = {"グー","チョキ","パー"};
		// 自分の手、相手の手を表示
		System.out.println("あなたの手は「"+janken[user]+"」");
		System.out.println("相手の手は「"+janken[pc]+"」");
		System.out.println("");
		// じゃんけん結果によるメッセージを出力
		System.out.println(result);
	}
};
