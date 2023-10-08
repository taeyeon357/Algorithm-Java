package algorithm.programmers;

import java.util.HashMap;

public class Prog176963 {

	public static int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];

		HashMap<String, Integer> scoreMap = new HashMap<>();
		for (int i = 0; i < name.length; i++) {
			scoreMap.put(name[i], yearning[i]);
		}

		int sum = 0;
		for (int i = 0; i < photo.length; i++) {
			sum = 0;
			for (String p : photo[i]) {
				if (scoreMap.keySet().contains(p)) {
					sum += scoreMap.get(p);
				}
			}
			answer[i] = sum;
		}
		return answer;
	}

	public static void main(String[] args) {

		String[] name = { "may", "kein", "kain", "radi" };
		int[] yearning = { 5, 10, 1, 3 };
		String[][] photo = { { "may", "kein", "kain", "radi" }, { "may", "kein", "brin", "deny" },
				{ "kon", "kain", "may", "coni" } };

		int[] result = solution(name, yearning, photo);

		for (int r : result) {
			System.out.println(r);
		}
	}

}
