package algorithm.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Prog42862 {

	public static void main(String[] args) {
		int n = 8;
		int[] lost = new int[] {5,6,7,8};
		int[] reserve = new int[] {4,7};
		
		List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
		List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
		
		List<Integer> students = new ArrayList<>();
		students.add(0);
		for(int i = 1; i<= n; i++) {
			int cnt = 0;
			if(lostList.contains(i)) {
				cnt -=  1;
			} else if(reserveList.contains(i)) {
				cnt += 1;
			}
			students.add(cnt);
		}
		System.out.println("students ÃÊ±â");
		System.out.println(students);

		for(int i=1; i<n; i++) {
			if (students.get(i) == -1) {
				if (students.get(i-1) == 1) {
					students.set(i, 0);
					students.set(i-1, 0);
				} else if (students.get(i+1) == 1) {
					students.set(i, 0);
					students.set(i+1, 0);
				}
			}
		}
		if (students.get(n)==-1 && students.get(n-1)==1) {
			students.set(n, 0);
			students.set(n-1, 0);
		}
		
		System.out.println(n-Collections.frequency(students, -1));
	
	}

}
