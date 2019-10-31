package LECT;

public class ExtraLect05 {

	public static void main(String[] args) {
		//1~10까지의 합
		//변수를 먼저 생각해야함(변수 i와 sum 두 개가 필요)
		
		int sum = 0; //sum은 지역변수 - 사용(참조)하기 전 초기화, 얼마든지 참조가 가능하다
		//sum = sum+10;
		//sum = 5*10; //배정 되어 지는것이므로 오류가 아니다
		
		int i = 0;
		for(i = 1; i < 11; i++){
			sum += i ;
		}
		System.out.println(i+","+sum);

	}

}
