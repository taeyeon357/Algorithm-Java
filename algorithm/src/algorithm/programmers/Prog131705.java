package algorithm.programmers;

public class Prog131705 {
	
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i=0; i<number.length-2; i++) {
        	for(int j=i+1; j<number.length-1; j++) {
        		for(int k=j+1; k<number.length; k++) {
        			if(number[i] + number[j] + number[k] == 0) {
        				answer += 1;
        			}
        		}
        	}
        }
        return answer;
    }

	public static void main(String[] args) {
		/*testcase
		 * 
		 * [-2, 3, 0, 2, -5]	2
		 * [-3, -2, -1, 0, 1, 2, 3]	  5
		 * [-1, 1, -1, 1]	0
		 * 
		 */
	}

}
