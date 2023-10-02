package algorithm.programmers;

public class Prog140108 {

	public static void main(String[] args) {
		String s = "banana";
		
		char x = s.charAt(0);
		int xCnt = 1;
		int otherCnt = 0;
		int sep = 0;
		for (int i = 1; i<s.length(); i++) {
			if(xCnt == otherCnt) {
				sep += 1;
				x = s.charAt(i);
				xCnt = 1;
				otherCnt = 0;
			}else if (s.charAt(i)==x) {
				xCnt += 1;
			} else {
				otherCnt += 1;
			}
		}
		
		System.out.println(sep);
	}

}
