package algorithm.programmers;

import java.util.Arrays;
import java.util.HashSet;

public class Prog68644 {

    public static int[] solution(int[] numbers) {
        int[] answer = {};
        
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<numbers.length; i++) {
        	for(int j=0; j<numbers.length; j++) {
        		if(i!=j) {
        			hs.add(numbers[i] + numbers[j]);
        		}
        	}
        }
        answer = hs.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		int[] n = {2,1,3,4,1};
		int[] result = solution(n);
		
		for(int r : result) {
			System.out.println(r);
		}
	}

}
