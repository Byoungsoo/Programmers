package com.bys.level2;

class Solution {
	int solution(int[][] land) {
		int answer = 0;

		// {실행} 버튼을 누르면 출력 값을 볼 수 있습니다.
		int[] temp = { 0, 0, 0, 0 };
		int[] result = { 0, 0, 0, 0 };
		int min1 = 0;
		int min2 = 0;
		int min1A = 0;
		int min2A = 0;
		int max = 0;

		for (int i = 0; i < land.length; i++) {
			for (int j = 0; j < land[i].length; j++) {
				if (j == 0) {
					min1 = land[i][j];
					min2 = land[i][j];
					min1A = j;
					min2A = j;
				} else if (min1 > land[i][j]) {
					min2 = min1;
					min2A = min1A;
					
					min1 = land[i][j];
					min1A = j;
				} 
				
				else if (min2 > land[i][j] || min2 <= min1) {
					min2 = land[i][j];
					min2A = j;
				}

			}
			land[i][min1A] = 0;
			land[i][min2A] = 0;
		}

		temp = land[0];

		for (int i = 0; i < land.length; i++) {
			for (int j = 0; j < land[i].length; j++) {
				System.out.print(land[i][j] + "  ");
			}
			System.out.println(" ");
		}

		for (int i = 0; i < land.length - 1; i++) {
			for (int t = 0; t < temp.length; t++) {
				for (int j = 0; j < 4; j++) {
					if (j != t) {
						if (temp[t] != 0) {
							if (land[i + 1][j] != 0) {
								if (result[j] < land[i + 1][j] + temp[t]) {
									result[j] = land[i + 1][j] + temp[t];
								}
							} else {
								result[j] = 0;
							}
						}
					}

				}
			}
			for (int j = 0; j < result.length; j++) {
				temp[j] = result[j];
			}
		}

		for (int i = 0; i < result.length; i++) {
			if (result[i] > max) {
				max = result[i];
			}
		}

		answer = max;

		System.out.println("Answer: " + answer);

		return answer;
	}

	public static void main(String[] args) {

		int[][] land = 
		 { { 1, 5, 3, 9 }, { 20, 3, 10, 100 }, { 50, 7, 3, 6 }, { 1, 5, 7, 8 }, { 2, 4, 6, 8 } };
		// { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };

		Solution s = new Solution();
		s.solution(land);

	}
}
