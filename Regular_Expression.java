package journey;

import java.util.regex.Pattern;

public class Regular_Expression {
	public static void main(String[] args) {
		//	^	정규식의 시작		
		//	$	정규식의 끝
		
		//	.	임의의 한 문자
		
		//	*	문자가 0번 이상 발생 
		//	+	문자가 1번 이상 발생 
		//	?	문자가 0번 혹은 1번 발생 
		
		//	[]	문자의 집합 범위 
		//		[0-9]: 숫자 (0 ~ 9) 
		//		[a-z]: 알파벳(a ~ z)
		//		앞에 ^ 있으면 not 
		
		//	{}	횟수 또는 범위
		//		{n}		앞의 문자가 정확히 n번 나온다
		//		{n,}	앞의 문자가 적어도 n번 나온다 
		
		
		
		
		String a = "^[0-9]+$";
		String b = "123321";
		
		boolean result = Pattern.matches(a, b);
		System.out.println(result);
	}
}
