package algorithm.programmers;

import java.util.HashMap;

//완주하지 못한 선수
public class Prog42576 {

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		HashMap<String, Integer> result = new HashMap<>();
		for (String p: participant) {
			if (result.containsKey(p)) {
				result.put(p, result.get(p)+1);
			} else {
				result.put(p, 1);
			}
		}
		
		for(String c: completion) {
			result.put(c, result.get(c)-1);
		}
		
		for (String key : result.keySet()) {
			if (result.get(key) > 0) {
				System.out.println(key);
			}
		}

	}

}
