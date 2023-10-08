package algorithm.programmers;

public class Prog147355 {

	public static int solution(String t, String p) {
		int answer = 0;
		
		int len = p.length();
		for(int i=0; i<t.length()-len+1; i++) {
			String sub = t.substring(i,i+len);
			if(Integer.parseInt(p) >= Integer.parseInt(sub)) {
				answer += 1;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("3141592", "271"));
		System.out.println(solution("10203", "15"));
		
	}

}
