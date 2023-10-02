package algorithm.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog155652 {

	public static String solution(String s, String skip, int index) {
        String answer = "";
        
        List<String> alphabet = Arrays.asList(
        		"a","b","c","d",
        		"e","f","g","h",
        		"i","j","k","l",
        		"m","n","o","p",
        		"q","r","s","t",
        		"u","v","w","x",
        		"y","z"
        		);
        
        List<String> skipList = Arrays.asList(skip.split(""));
        List<String> removedList = new ArrayList<>();
//    	asList에는 remove가 먹히지 않는다...     
        for(String al : alphabet) {
        	if(skipList.contains(al)) {
        		continue;
        	}else {
        		removedList.add(al);
        	}
        }
//        
//        System.out.println("removedList");
//        for(String r : removedList) {
//        	System.out.print(r + " ");
//        }
//        System.out.println();
        
        for(int i=0; i<s.length(); i++) {
        	int a = (removedList.indexOf(Character.toString(s.charAt(i))) + index)%removedList.size();
//        	System.out.println(s.charAt(i));
//        	System.out.println(removedList.indexOf(s.charAt(i)));
//        	System.out.println(a);
        	answer += removedList.get(a);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
//		solution("abcd", "abcd", 5);
//		List<String> al = Arrays.asList("a","b","c","d");
//		al.remove(1);
//		for(String aa : al) {
//			System.out.println(aa);
		
		
//		}
		System.out.println(solution("aukks", "wbqd", 5));
	}

}
