package algorithm.programmers;

public class Prog12950 {
	
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i=0; i<arr1.length; i++) {
        	for(int j=0; j<arr1[i].length; j++) {
        		answer[i][j] = arr1[i][j]+arr2[i][j];
        	}
        }
        return answer;
    }

	public static void main(String[] args) {
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{1,2},{2,3}};
		
		solution(arr1,arr2);
	}

}
