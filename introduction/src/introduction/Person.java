package introduction;

class Person{
	// クラスフィールドを定義
	public static int count = 0;
	// インスタンスフィールドを定義
	public String firstName , lastName;
	public int age;
	public double height , weight;
	public double bmi;
	
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String firstName,String lastName,int age,double height,double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count ++;
	}
	
	public String fullName(){
		return this.firstName + this.lastName;
	}
	
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "歳です");
		System.out.println("BMIは" + this.bmi(weight, height) + "です\n");
	}
	
	// bmi値を計算するメソッド、小数点第一位まで表示
	public String bmi(double weight,double height) {
		bmi = this.weight / this.height / this.height;
		return String.format("%.1f", bmi);
	}
	
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}