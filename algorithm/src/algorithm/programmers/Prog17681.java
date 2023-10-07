package algorithm.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prog17681 {
	
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        List<String> answerList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++) {
        	//"%0nd"�̷��� �ȵǳ�
        	String[] binaryStr1 = leftPadding(Integer.toBinaryString(arr1[i]), "0", n).split("");
        	String[] binaryStr2 = leftPadding(Integer.toBinaryString(arr2[i]), "0", n).split("");
        			
        	
        	for(int j=0; j<n; j++) {
        		if("1".equals(binaryStr1[j]) | "1".equals(binaryStr2[j])) {
        			sb.append("#");
        		}else {
        			sb.append(" ");
        		}
        	}
        	
        	answerList.add(sb.toString());
        	sb.setLength(0);
        }
        
        answer = answerList.toArray(new String[answerList.size()]);
        return answer;
    }
    
    public static String leftPadding(String str, String rep, int len) {
        	StringBuilder sb = new StringBuilder();
        	
        	if(str.length()<len) {
        		int n = len - str.length();
        		for(int i=0; i<n; i++) {
        			sb.append(rep);
        		}
        		sb.append(str);
        		str = sb.toString();
        	}
        	
        	return str;
        }
        
	public static void main(String[] args) {
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] s = solution(5,arr1,arr2);
		
		for(String str: s) {
			System.out.println(str);
		}
	}
}
