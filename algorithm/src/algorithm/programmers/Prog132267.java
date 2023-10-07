package algorithm.programmers;

public class Prog132267 {

    public static int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n>=a) {
        	int exchange = n/a; //지금 바꿀 콜라병
        	n -= (a * exchange); 
        	n += (b * exchange);
        	answer += b * exchange;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(2,1,20));
	}

}
