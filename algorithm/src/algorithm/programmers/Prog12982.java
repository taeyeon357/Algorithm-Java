package algorithm.programmers;

import java.util.*;

public class Prog12982 {

    public static int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        int sum = 0;
        for(int i=0; i<d.length; i++) {
        	sum += d[i];
        	if(sum <= budget) {
        		answer += 1;
        	}else {
        		break;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		System.out.println(solution(d,9));
	}

}
