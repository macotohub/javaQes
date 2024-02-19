package java1_25_sub;

public class SubClass {

	private String name;
	
	public SubClass() {
	}
	
	public void user() {
		System.out.println("こんにちは「 " + name + " 」さん");
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

class status extends SubClass{
	private Integer hp;
	private Integer mp;
	private Integer power;
	private Integer speed;
	private Integer defence;
	
	public status() {	
	}
	
	public void statusInfo() {
		System.out.println("ステータス");
		System.out.println("HP：" + getHp());
		System.out.println("MP：" + getMp());
		System.out.println("攻撃力：" + getPower());
		System.out.println("素早さ：" + getSpeed());
		System.out.println("防御力：" + getDefence());
		System.out.println("\nさあ冒険に出かけよう！");
	}
		
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	public void setMp(Integer mp) {
		this.mp = mp;
	}
	public void setPower(Integer power) {
		this.power = power;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public void setDefence(Integer defence) {
		this.defence = defence;
	}
		
		
	public Integer getHp() {
		return hp;
	}
	public Integer getMp() {
		return mp;
	}
	public Integer getPower() {
		return power;
	}
	public Integer getSpeed() {
		return speed;
	}
	public Integer getDefence() {
		return defence;
	}
}


/*
名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
*/