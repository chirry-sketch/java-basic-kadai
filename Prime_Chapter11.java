package Prime_Chapter11;

public class Prime_Chapter11 {

	public static void main(String[] args) {
	
	for (int number = 2; number <= 100; number++ ) {
	    if (prime(number)) {
	    	System.out.println(number + "");
	    }
	  }	
	}

	
	public static boolean prime(int num) {
		if(num < 2 ) {
	
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
