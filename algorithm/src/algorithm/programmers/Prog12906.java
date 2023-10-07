package algorithm.programmers;

import java.util.ArrayList;
import java.util.List;

public class Prog12906 {
	
    public static int[] solution(int []arr) {
        int[] answer = {};
        
        List<Integer> result = new ArrayList<>();
        
        result.add(arr[0]);
        int idx = 0;
        for(int i=0; i<arr.length; i++) {
        	if(result.get(idx).equals(arr[i])) {
        		continue;
        	}else {
        		result.add(arr[i]);
        		idx += 1;
        	}
        }
        answer = result.stream().mapToInt(a->a).toArray();

        return answer;
    }

	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		int[] arr2 = {4,4,4,3,3};
		
		for(int a : solution(arr)) {
			System.out.print(a);
		}
	}

}
