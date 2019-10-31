package LECT;

public class ExtraLect08 {

	public static void main(String[] args) {
		int ppv = 1; //전전수
		int pv = 1; //전수
		int cv = 0; //현재수
		
		System.out.print(ppv+", "+pv+", ");
		for(int i = 0; i <100; i++){
			cv=pv+ppv;
			if(cv > 50){
				break;
			}else{
				System.out.print(cv+", ");
				ppv=pv;
				pv=cv;
			}
		}

	}

}
