package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	
	//自分の手
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		String s = "";
		
	   while(true) {
	     System.out.println("自分のじゃんけんの手を入力しましょう");
	     System.out.println("グーはrockのrを入力しましょう");
	     System.out.println("チョキはscissorsのsを入力しましょう");
	     System.out.println("パーはpaperのpを入力しましょう");
	
	
	     s = scanner.next();
	     
	     //確認
	     if(s.equals("r") || s.equals("s") || s.equals("p")) {
	    	 break;
	     } else {
	    	 System.out.println("エラーです。再度入力してください");
	     }
	   }
	   
	   scanner.close();
	   return s;

  }
	
	//相手の手
	public String getRandom() {
		String[] pcHands = { "r", "s", "p"};
		String h = pcHands[(int)Math.round(Math.random() * 3)];
		
		return h;
	}
	
	//じゃんけん
	public void playGame() {
		String c = getMyChoice();
		String r = getRandom();
		HashMap<String,String> play = new HashMap<String,String>();
		play.put("r", "グー");
		play.put("s", "チョキ");
		play.put("p", "パー");
		
		System.out.println("自分の手は" + play.get(c) + "対戦相手の手は" + play.get(r));
		
		
		if((c.equals("r") && r.equals("r")) || (c.equals("s") && r.equals("s")) || (c.equals("p") && r.equals("p"))) {
			System.out.println("あいこです");
		} 
		if((c.equals("r") && r.equals("s")) || (c.equals("s") && r.equals("p")) || (c.equals("p") && r.equals("r"))) {
			System.out.println("あなたの勝ちです");
		}
		if((c.equals("r") && r.equals("p")) || (c.equals("s") && r.equals("r")) || (c.equals("p") && r.equals("s"))) {
			System.out.println("あなたの負けです");
		}
	}

}
