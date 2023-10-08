package algorithm.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog12930 {
	
    public static String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int cnt = 0;
        for(int i=0; i<s.length(); i++) {
        	if(" ".equals(Character.toString(s.charAt(i)))) {
        		cnt = 0;
        		sb.append(" ");
        	}else {
        		if(cnt % 2 == 0) {
        			sb.append(Character.toUpperCase(s.charAt(i)));
        		}else {
        			sb.append(Character.toLowerCase(s.charAt(i)));
        		}
        		cnt += 1;
        	}
        }
        
        answer = sb.toString();
        
        return answer;
    }

	public static void main(String[] args) {
		String s = "AA aa ZZ zz";
		System.out.println(solution(s));
		
	}

}
