package algorithm.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prog42748 {
	
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        List<Integer> aList = new ArrayList<>();
        
        
        for(int i=0; i<commands.length; i++) {
        	List<Integer> list = new ArrayList<>();
        	for(int j=commands[i][0]-1; j<=commands[i][1]-1; j++) {
        		list.add(array[j]);
        	}
        	Collections.sort(list); //오름차순 정렬
        	aList.add(list.get(commands[i][2]-1));
        }
        
        answer = aList.stream().mapToInt(a->a).toArray();
        
        return answer;
    }

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] cmd = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
		
		int[] result = solution(array, cmd);
		
		for(int i: result) {
			System.out.println(i);
		}
	}

}
