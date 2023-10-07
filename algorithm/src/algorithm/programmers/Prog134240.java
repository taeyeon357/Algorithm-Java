package algorithm.programmers;

public class Prog134240 {

	public static String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<food.length; i++) {
        	for(int j=0; j<food[i]/2; j++) {
        		sb.append(i);
        	}
        }
        
        String half = sb.toString();
        sb.append(0);
        for(int i=half.length()-1; i>-1; i--) {
        	sb.append(half.charAt(i));
        }
        
        answer = sb.toString();
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,3,4,6};
		System.out.println(solution(arr));
	}

}
