package 프로그래머스;

import java.util.Arrays;

public class 배열의연산2 {
	//{1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 	27
	//{1, 2, 3, 4, 5, 9, 10} 			24
	//{-20,-30,3,4,5,9,10}				600
	//세수를 더했을 때 가장 큰 숫자를 구해보세요.
	//배열이 오름차순으로 정렬이 되어 있는 상태!
	
	public static void main(String[] args) {
		Solution11 sol = new Solution11();
		//int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] numbers = {-20,-30,3,4,5,9,10};
		int answer = sol.solution(numbers); // int[]
		System.out.println(answer);
	}
}

class Solution11 {
	public int solution(int[] numbers) {
		
		int post = numbers[numbers.length - 2] * numbers[numbers.length-1];
		int pre=numbers[0]*numbers[1];
		int answer=0;
		if(post>pre) {
			answer=post;
		}else {
			answer=pre;
		}
			
		return answer;
	}
}