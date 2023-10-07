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
        
        //hashMap->�����ϴµ� ���� ��� -1 -> �� ��ġ�� ���� -> ������ �� ���� result�� ����
        return answer;
    }

	public static void main(String[] args) {
		int[] result = solution("banana");
		for(int i: result) {
			System.out.println(i);
		}
	}

}
