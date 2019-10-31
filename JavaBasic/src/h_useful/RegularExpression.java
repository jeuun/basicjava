package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		 /*
		  * 정규 표현식 : 문자열의 패턴을 검사하는 표현식
		  * 
		  * ^	뒷 문자로 시작
		  * $	앞 문자로 종료
		  * .	임의의 문자(줄바꿈 제외)
		  * *	앞 문자가 0개 이상
		  * +	앞 문자가 1개 이상
		  * ?	앞 문자가 없거나 1개
		  * []	문자의 집합이나 범위([a-z] : a부터 z까지, [^a-z] : a부터 z가 아닌것)
		  * {}	앞 문자의 개수({2} : 2개, {2,4} : 2개 이상 4개 이하)
		  * ()	그룹화(1개의 문자처럼 인식)
		  * |	OR 연산
		  * /s	공백, 탭, 줄바꿈
		  * /S	공백, 탭, 줄바꿈이 아닌 문자
		  * /w	알파벳이나 숫자
		  * /W	알파벳이나 숫자가 아닌 문자	
		  * /d	숫자
		  * /D	숫자가 아닌 문자
		  *(?!)	뒷 문자의 대소문자 구분 안함
		  * \	정규표현식에서 사용되는 특수문자 표현
		  */
		
		String str = "abc123";
		//String regex = "[a-z]{3}[0-9]{1,3}"; 이렇게 최대한 범위를 좁게 만드는것이 좋다.
		//String regex = "[a-z0-9]+";
		//String regex = "\\w*";
		String regex = ".*";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(str);
		
		System.out.println(m.matches()); //true
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어 주세요.
		
		String id = "abcde123";
		String phone = "01012345678";
		String email = "zxcvb@naver.com";
		
		String regexid = "(\\w)+";
		String regexphone = "[0-9]{11}+";
		String regexemail = "[a-zA-Z0-9]+@+.+[a-zA-Z0-9]";
		
		Pattern i = Pattern.compile(regexid);
		Pattern ph = Pattern.compile(regexphone);
		Pattern e = Pattern.compile(regexemail);
		
		Matcher a = i.matcher(id);
		Matcher s = ph.matcher(phone);
		Matcher d = e.matcher(email);
		
		System.out.println(a.matches());
		System.out.println(s.matches());
		System.out.println(d.matches());
	}

}
