package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17 {
		public void setGivenName() {
			givenName = "花子";
		}
		
		public void eachIntroduce() {
			System.out.println("趣味は読書です");
		}
		
		public void execIntroduce() {
			System.out.println("名前は" + famiryName + givenName + "です");
			System.out.println("住所は" + address + "です");
			eachIntroduce();
			System.out.println();
		
		}

}
