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
		System.out.println(s.solution(numbers));

	}

}

/*
 * ���ڸ� ���ڰ� ���� ���� ������ ������ֽ��ϴ�. ����� ���� ������ �ٿ� �Ҽ��� �� �� ���� �� �ִ��� �˾Ƴ��� �մϴ�. �� ���� ������
 * ���� ���ڰ� ���� ���ڿ� numbers�� �־����� ��, ���� �������� ���� �� �ִ� �Ҽ��� �� ������ return �ϵ��� solution
 * �Լ��� �ϼ����ּ���. ���ѻ��� numbers�� ���� 1 �̻� 7 ������ ���ڿ��Դϴ�. numbers�� 0~9���� ���ڸ����� �̷����
 * �ֽ��ϴ�. 013�� 0, 1, 3 ���ڰ� ���� ���� ������ ������ִٴ� �ǹ��Դϴ�.
 ** 
 * ���ѻ��� numbers�� ���� 1 �̻� 7 ������ ���ڿ��Դϴ�. numbers�� 0~9���� ���ڸ����� �̷���� �ֽ��ϴ�. 
 * 013�� 0, 1, 3 ���ڰ� ���� ���� ������ ������ִٴ� �ǹ��Դϴ�.
 * 
 */
