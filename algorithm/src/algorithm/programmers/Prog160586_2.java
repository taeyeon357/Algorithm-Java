package algorithm.programmers;

public class Prog160586_2 {

	public static void main(String[] args) {
		String[] keymap = new String[] { "ABACD", "BCEFD" };
		String[] target = new String[] { "ABCD", "AABB" };
		
		int[] result = new int[target.length];
		for (int i =0; i<target.length; i++) {
			for (int j =0; i<target[i].length(); j++) {
				int minValue = 101;
				for (int k=0; k<keymap.length; k++) {
					if (keymap[k].indexOf(target[i].charAt(j))>0 && minValue > keymap[k].indexOf(target[i].charAt(j))) {
						minValue = keymap[k].indexOf(target[i].charAt(j));
					}
				}
				if (minValue == 101) {
					result[i] = -1;
					break;
				} else {
					result[i] += minValue;
				}
			}
		}
		
		for(int r : result) {
			System.out.println(r);
		}
	}

}
