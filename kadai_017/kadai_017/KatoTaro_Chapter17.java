package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	public void setGivenName() {
		givenName = "太郎";
	}
	
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
	
	public void execIntroduce() {
	System.out.println("名前は" + famiryName + givenName + "です");
	System.out.println("住所は" + address + "です");
	eachIntroduce();
	System.out.println();

	}
	
	
}
