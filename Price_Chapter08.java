package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		int prise = 3;
		
		System.out.println(prise);
		
		switch(prise) {
		 case 1:
			 System.out.println("10代の料金は1000円です");
		     break;
		 case 2:
			 System.out.println("20代の料金は2000円です");
		     break;
		 case 3:
			 System.out.println("30代の料金は3000円です");
			 break;
		 case 4:
			 System.out.println("40代の料金は3000円です");
			 break;
		 case 5:
			 System.out.println("50代の料金は4000円です");
			 break;
		 case 6:
			 System.out.println("60代の料金は4000円です");
			 break;
		 case 7:
			 System.out.println("70代の料金は4000円です");
			 break;
		 case 8:
			 System.out.println("80代の料金は5000円です");
			 break;
		 default:
			 System.out.println("料金は500円です");
			 break;
		}
	}

}
