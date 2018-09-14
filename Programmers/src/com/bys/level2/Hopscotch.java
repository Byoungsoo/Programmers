package com.bys.level2;

class Hopscotch {
	int hopscotch(int[][] land) {
		int answer = 0;

		int[] tempRow = new int[4];
		
		for (int j = 0; j < land[0].length; j++) {
			tempRow[j] = land[0][j];
		}
		for (int i = 1; i < land.length; i++) {
			tempRow = sum(tempRow, land[i]);
		}
		for (int i = 0; i < tempRow.length; i++) {
			if(answer < tempRow[i]) {
				answer = tempRow[i];
			}
		}
		
		System.out.println("Answer: " + answer);
		return answer;
	}
	


	public static void main(String[] args) {

		int[][] land = 
		// { { 1, 5, 3, 9 }, { 20, 3, 10, 100 }, { 50, 7, 3, 6 }, { 1, 5, 7, 8 }, { 2, 4, 6, 8 } };
		 { { 1, 7, 2, 4 }, { 5, 2, 3, 1 }, { 10, 2, 1, 3 } };

		Hopscotch s = new Hopscotch();
		s.hopscotch(land);

	}
	
	
	public static int[] sum(int[] arr1, int[] arr2){
		int[][] temp = new int[4][4];
		int[] result = new int[4];
		int max = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(j != i ) {
					temp[i][j] = arr1[i] + arr2[j];
				}
				else {
					temp[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				if(max < temp[j][i]) {
					max = temp[j][i];
				}
			}
			result[i] = max;
			max = 0;
		}
		
		
		return result;
		
	}
	
	
	
}
