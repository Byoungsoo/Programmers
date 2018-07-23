package com.bys.level2;

class Solution {
	int solution(int[][] land) {
        int answer = 0;

        // {실행} 버튼을 누르면 출력 값을 볼 수 있습니다.
        int max1 = 0;
        int max2 = 0;
        int max1Col =0;
        int selectedCol1 =0;
        int selectedCol2 =0;
        int max2Col =0;
        
        int sum1 =0;
        int sum2 =0;
        

        //Find Max at rows
        for (int i = 0; i < land.length; i++) {
        	max1 = 0;
        	max2 = 0;
        	for (int j = 0; j < land[i].length; j++) {
        		System.out.print("value: " + land[i][j] + "  ///   ");
        		if(max1 < land[i][j]) {
        			max2 = max1;
        			max1 = land[i][j];
        			max2Col = max1Col;
        			max1Col = j;
        		}
        		else if(max2 < land[i][j]) {
        			max2 = land[i][j];
        			max2Col = j;
        		}
			}
        	if(i==0) {
        		sum1+= max1;
        		selectedCol1 = max1Col;
        	}        	
        	else if(max1Col == selectedCol1) {
        		sum1 += max2;
        		selectedCol1 = max2Col;
        	}
        	else if(max1Col != selectedCol1){
        		sum1 += max1;
        		selectedCol1 = max1Col;
        	}
        	
        	if(i==0) {
        		sum2+= max2;
        		selectedCol2 = max2Col;
        	}        	
        	else if(max1Col != selectedCol2) {
        		sum2 += max1;
        		selectedCol2 = max1Col;
        	}
        	else if(max1Col == selectedCol2){
        		sum2 += max2;
        		selectedCol2 = max2Col;
        	}
        	
            System.out.println("max1: " + max1 + "     max2: " + max2 + "    ///  max1Col: " + max1Col + "  max2Col: " + max2Col );
            System.out.println("sum1: " + sum1);
            System.out.println("sum2: " + sum2);
		}
        
        if(sum1 > sum2) {
        	answer = sum1;
        }
        else {
        	answer = sum2;
        }
        
        System.out.println("Answer: " + answer);
        return answer;
    }

	public static void main(String[] args) {

		int[][] land = { { 1, 5, 3, 9 }, {20, 3, 10, 100}, { 50, 7, 3, 6 }, { 1, 5, 7, 8 } , { 2, 4, 6, 8 }};
		// { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };

		Solution s = new Solution();
		s.solution(land);
		
	}

}