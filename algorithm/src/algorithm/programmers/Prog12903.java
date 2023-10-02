package algorithm.programmers;

public class Prog12903 {
// a b c d e f
    public static String solution(String s) {
        String answer = "";
        
        if(s.length()%2==0) {
        	answer = s.substring(s.length()/2-1,s.length()/2+1);
        }else {
        	answer = s.substring(s.length()/2, s.length()/2+1);
        }
        return answer;
    }
    
    
	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "qwer";
		
		System.out.println(solution(s1));
		System.out.println(solution(s2));
		
	}

}
