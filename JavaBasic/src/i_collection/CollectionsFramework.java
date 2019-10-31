package i_collection;

import java.util.ArrayList;

public class CollectionsFramework {

	public static void main(String[] args) {
		/*
		 * << CollectionsFramework >>
		 * - Collections	: 다수의 데이터
		 * - Framework		: 표준화된 프로그래밍 방식
		 * 
		 * << List >>
		 * - Vector		: ArrayList의 구버전
		 * - ArrayList	: 저장순서 유지, 중복 허용 //추가삭제는 느림 그렇지만 사용할 일이 잘 없어서 사용을 자주함 
		 * - LinkedList	: 데이터 추가 및 삭제시간 단축
		 * - Stack		: LIFO(Last In First Out)
		 * - Queue		: FIFO(First In First Out)
		 * 
		 * << Set >>
		 * - HashSet	: 중복 허용 안함, 저장순서 유지 안함
		 * - TreeSet	: 정렬, 검색 기능 향상
		 * 
		 * << Map >>
		 * - HashTable	: HashMap의 구버전
		 * - HashMap	: 키(key)와 값(Value)을 한쌍으로 저장 //자주사용
		 * - TreeMap	: 정렬, 검색 기능 향상
		 */
		
		/*
		 * 우리반 모두의 Java, Oracle, HTML, JQuery, JSP 점수를
		 * 50 ~ 100까지 랜덤으로 생성시켜주시고,
		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		 * 
		 * 석차	이름		Java	Oracle	HTML	JQuery	JSP		총점		평균
		 * 1	오동규	100		100		100		100		100		100		100
		 * 1	오동규	100		100		100		100		100		100		100
		 * 1	오동규	100		100		100		100		100		100		100
		 * 1	오동규	100		100		100		100		100		100		100
		 * 1	오동규	100		100		100		100		100		100		100
		 * 1	오동규	100		100		100		100		100		100		100
		 * 1	오동규	100		100		100		100		100		100		100
		 */
		
		String[] students = {
				"오동규", "박재욱", "오제민", "전보영", "유지상",
				"박신규", "진주호", "지원희", "한승희", "안정현",
				"이이슬", "이정은", "이선욱", "조건희", "최효은",
				"김혜정", "김명성", "신유진", "조윤호", "조아라",
				"백운영", "최도혁", "김영호", "박희제", "현솔비"};
		String[] subjects = {"Java", "Oracle", "HTML", "JQuery", "JSP"};
			

		int subjectscore = 0;
		
		ArrayList<Object>score = new ArrayList<Object>();
		
		for (int i = 0; i < score.size(); i++){
			subjectscore = (int)(Math.random() * 51) + 50;
		}
			System.out.println(subjectscore);
		
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < score.size(); i++){
			sum += score.get(i);
		}		
			avg += (double)sum / score.size();
		
		System.out.println("합계 : " + sum + " 평균 : " + avg);
		
		
		ArrayList<Object>student = new ArrayList<Object>();
		for (int i =0; i < student.size(); i++){
			
		}
		
		ArrayList<Object>subject = new ArrayList<Object>();
		for (int i = 0; i < subject.size(); i++){
			subject = 
			
		}
		
	}
}
