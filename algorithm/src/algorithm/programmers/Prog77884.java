package algorithm.programmers;

import java.util.HashSet;

public class Prog77884 {

    public static int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<=right; i++) {
        	if(divisor(i)%2==0) {
        		answer += i; 
        	}else {
        		answer -= i;
        	}
        }
        return answer;
    }
    
    public static int divisor(int n){
        HashSet<Integer> d = new HashSet<>();
        
        int i = 1;
        while(i<=n) {
        	if(n%i==0) {
        		d.add(i);
        		d.add(n/i);
        	}
        	i++;
        }
        return d.size();
    }
	
	public static void main(String[] args) {
		System.out.println(solution(1,2));
	}

}
