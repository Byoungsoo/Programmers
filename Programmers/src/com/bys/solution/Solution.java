package com.bys.solution;

class Solution {

	public int solution(String numbers) {
		int answer = 0;
		boolean flag = false; 
		char[] number = new char[numbers.length()];
		for (int i = 0; i < numbers.length(); i++) {
			number[i] = numbers.charAt(i);
		}
		
		
		return answer;
	}

	boolean primeNum(int num1) {
		boolean flag = true;

		if (num1 == 2 || num1 == 3) {
			flag = true; 
		}
		else {
			for (int i = 2; i <= num1 / 2; i++) {
				if (num1 % i == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;

	}

	public static void main(String args[]) {

		String numbers;
		Solution s = new Solution();

		numbers = "123";
		s.solution(numbers);

	}

}

/*
 * 한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다. 각 종이 조각에
 * 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution
 * 함수를 완성해주세요. 제한사항 numbers는 길이 1 이상 7 이하인 문자열입니다. numbers는 0~9까지 숫자만으로 이루어져
 * 있습니다. 013은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
 ** 
 * 제한사항 numbers는 길이 1 이상 7 이하인 문자열입니다. numbers는 0~9까지 숫자만으로 이루어져 있습니다. 
 * 013은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
 * 
 */
