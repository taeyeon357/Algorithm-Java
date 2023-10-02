package algorithm.programmers;

import java.util.Arrays;
import java.util.List;

public class Prog12918 {

    public static boolean solution(String s) {
        boolean answer = true;
        
        List<Character> number = Arrays.asList('1','2','3','4','5','6','7','8','9','0');
        
        if (s.length()==4 | s.length() == 6) {
        	for(int i=0; i<s.length(); i++) {
        		if(number.contains(s.charAt(i))) {
        			continue;
        		}else {
        			answer = false;
        			break;
        		}
        	}
        } else {
        	answer = false;
        }
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("12354"));
	}

}
