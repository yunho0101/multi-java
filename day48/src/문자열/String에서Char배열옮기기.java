package 문자열;

public class String에서Char배열옮기기 {

	public static void main(String[] args) {
		String s="s205621";
		char c=s.charAt(0);
		String answer="개발부서가아닙니다";
		if(c=='s') {
			answer="개발부서입니다";
		}
		System.out.println(answer);
	}

}
