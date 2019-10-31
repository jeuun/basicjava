package LECT;

public class ExtraLect06 {

	public static void main(String[] args) {
		int sum=0;
		int amt=100; //저금할 액수
		int i = 1; //날수 
		
		for(i=1; i<=100; i++){
			sum=sum+amt;
			if(sum>=1000000)
				break;
			amt=amt*2;
				}
		System.out.println(i+"일 소요 저축액 :"+sum);

	}

}
