package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {

	public void seacArray(String[] words) {
		HashMap<String,String> dictionary = new HashMap<String,String>();
		
		String fruit = "";
		
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウイ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
		
		
		
		for( int i =0; i < words.length ; i++) {
			fruit = dictionary.get(words[i]);
			if(dictionary.containsKey(words[i])) {
				System.out.println(words[i] + "の意味は" + fruit );
			} else {
				System.out.println(words[i] + "は辞書に存在しません");
			}
	}
  }

}
