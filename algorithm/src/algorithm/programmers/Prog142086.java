package algorithm.programmers;

import java.util.HashMap;

public class Prog142086 {
	
	public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
        	if(hm.keySet().contains(s.charAt(i)+"")) {
        		answer[i] = i - hm.get(s.charAt(i)+"");
        	}else {
        		answer[i] = -1;
        	}
        	hm.put(s.charAt(i)+"", i);
        }
        
        //hashMap->저장하는데 없는 경우 -1 -> 그 위치를 저장 -> 있으면 그 값을 result에 저장
        return answer;
    }

	public static void main(String[] args) {
		int[] result = solution("banana");
		for(int i: result) {
			System.out.println(i);
		}
	}

}
