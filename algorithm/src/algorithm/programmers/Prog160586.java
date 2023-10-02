package algorithm.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Prog160586 {

	public static void main(String[] args) {
		String[] keymap = new String[] { "ABACD", "BCEFD" };
		String[] target = new String[] { "ABCD", "AABB" };

		int[] answer = {};


		// target �ߺ� ����
		HashSet<Character> targetKeys = new HashSet<>();

		for (int i = 0; i < target.length; i++) {
			for (int j = 0; j < target[i].length(); j++) {
				targetKeys.add(target[i].charAt(j));
			}
		}
		System.out.println(targetKeys);
//		List<Integer> minList = new ArrayList<Integer>(); 

		// �� key�� ���� �ּ� �� ����
		HashMap<Character, Integer> map = new HashMap<>();
		for (Character t : targetKeys) {
			int minValue = 101; // keymap�� �ִ� ������ 100�̹Ƿ� 101�� �ʱ�ȭ
			for (int i = 0; i < keymap.length; i++) {
				if (keymap[i].indexOf(t) > -1 && keymap[i].indexOf(t) < minValue) {
					System.out.println(keymap[i].indexOf(t));
					minValue = keymap[i].indexOf(t.charValue());
				}
			}
			if (minValue == 101) {
				map.put(t, -1);
			} else {
				map.put(t, minValue);
			}
		}
		System.out.println(map);
		answer = new int[target.length];
		for (int i = 0; i < target.length; i++) {
			for (int j = 0; j < target[i].length(); j++) {
				if (map.containsKey(target[i].charAt(j))) {
					answer[i] += map.get(target[i].charAt(j));
				}
			}
		}

		for (int a : answer) {
			System.out.println(a);
		}
	}

}
