package java1_25_sub;

public class Status extends SubClass{
	private Integer hp;
	private Integer mp;
	private Integer power;
	private Integer speed;
	private Integer defence;
	
	public Status() {	
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
