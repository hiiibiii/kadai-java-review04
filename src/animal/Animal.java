package animal;

public class Animal {

	//名前を格納するフィールドと年齢を格納するフィールドを定義してください
	//フィールド
	private String name;
	private int age;

	public Animal() {
	}

	//コンストラクタに名前・年齢の情報を格納する引数を設定し、
	//処理内容として名前・年齢の各フィールドを引数の情報で初期化するようにしてください
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	say という名前のpublicなメソッドを定義してください
	public void say() {
		System.out.println(this.name + "です。" + this.age + "歳です。");
	}
}
