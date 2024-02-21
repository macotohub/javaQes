package java1_25_sub;

public class SubClass extends Status{
	private int hp;
	private int mp;
	private int power;
	private int speed;
	private int defence;
	
	public SubClass() {
	}
	
	public SubClass(String name) {
		super(name);
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
		
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
		
		
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	public int getPower() {
		return power;
	}
	public int getSpeed() {
		return speed;
	}
	public int getDefence() {
		return defence;
	}

}
