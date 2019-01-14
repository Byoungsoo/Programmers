package com.bys.level2;

public class Parenthesis {

	boolean solution(String s) {
		boolean answer = true;
		// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		int countLeft = 0;
		int countRight = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if("(".equals(s.substring(i, i+1))) {
				countLeft++;
			}
			else {
				countRight++;
			}
			
			if(countRight > countLeft) {
				answer = false;
				return answer;
			}
		}
		
		if(countRight != countLeft) {
			answer = false;
		}

		System.out.println(answer);

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(())";
		Parenthesis p = new Parenthesis();
		p.solution(str);

	}

}
