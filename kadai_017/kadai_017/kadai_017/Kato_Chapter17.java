package kadai_017;

public class Kato_Chapter17 {

	public String  famiryName = "加藤"; //苗字
	public String givenName = ""; //名前
	public String address = "東京都中野区〇×"; //住所
	
	
	public void commonIntroduce() {
		System.out.println("名前は" + famiryName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	public void eachIntroduce() {
	}
	
	public void execIntroduce() {
			commonIntroduce();
			eachIntroduce();
			System.out.println();
	}
	
	
}
