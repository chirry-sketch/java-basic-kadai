package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	public void setGivenName() {
		givenName = "一郎";
	}
	
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
	
	public void execIntroduce() {
		System.out.println("名前は" + famiryName + givenName + "です");
		System.out.println("住所は" + address + "です");
		eachIntroduce();
		System.out.println();
	}

}