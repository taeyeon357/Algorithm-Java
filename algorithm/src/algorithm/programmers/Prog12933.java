package algorithm.programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Prog12933 {

	public static void main(String[] args) {
        long n = 101010;
        long answer = 0;

        ArrayList<Long> numList = new ArrayList<>();
        
        while(n>0){
            numList.add(n%10);
            n = n/10;
        }
        Collections.sort(numList);
        
        for(int i=0; i<numList.size(); i++) {
        	answer += Math.pow(10, i) * numList.get(i);
        }
        
        System.out.println(answer);

	}

}