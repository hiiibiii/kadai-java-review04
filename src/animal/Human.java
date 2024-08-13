package animal;

public class Human extends Animal {
	//趣味の情報を保管するフィールドを定義してください
	private String hobby;

	//コンストラクタで名前・年齢・趣味の情報を格納する引数を設定し、
	//処理内容として名前・年齢・趣味の各変数を引数の情報で初期化するようにしてください
	public Human() {
	}
	public Human(String name, int age, String hobby) {
		super(name, age);
		this.hobby = hobby;
	}

	public void think() {
		System.out.println("私は" + hobby + "について考えています。");
	}
}
