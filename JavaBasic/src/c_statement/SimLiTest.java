package c_statement;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
		
		String A = "스페셜티 카페라떼 프리미엄 타입 : 서로에 대한 신뢰감이 깊고 존중해주는 어른스러운 연애를 하는 타입";
		String B = "스페셜티 카페라떼 타입 : 구속을 하는것도 받는것도 싫은 자유로운 연애를 하는 타입";
		String C = "아침에주스 오렌지 타입 : 이것은 의리인가 사랑인가 친구같이 편안한 연애를 하는 타입";
		String D = "아침에 주스 유기농 타입 : 무조건 잘해주고 무조건 맞춰주는 다 퍼주는 연애를 하는 타입";
		
		System.out.println("나는 금사빠다 : Y나 N를 입력하시오");
		String input1 = s.nextLine();
			if(input1 == "Y"){
				System.out.println("연애할 때 끌려다니는 타입이다 ");		
			String input2 = s.nextLine();
			if (input2 == "Y") {
				System.out.println("감정 표현에 솔직한 편이다 ");
				String input3 = s.nextLine();
				if(input3 == "Y"){
					System.out.println("이성친구는 존재할 수 없다");
					String input4 = s.nextLine();
					if (input4 == "Y"){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
							String input5 = s.nextLine();
							if(input5 == "Y"){
								System.out.println("D");
						}else if(input5 == "N"){
								System.out.println("C");					
							}
					}else if(input4 == "N"){
							System.out.println("B");				
						}
				}else if(input3 == "N"){
					System.out.println("활동적인 데이트가 좋다");	
					String input6 = s.nextLine();
					if (input6 == "Y"){
						System.out.println("이성친구는 존재할 수 없다");	
					}else if(input6 == "N")
						System.out.println("B");	
				}	
			}else if(input2 == "N") {
				System.out.println("데이트 코스는 미리 짜는게 편하다");	
				String input8 = s.nextLine();
				if (input8 == "Y"){
					System.out.println("활동적인 데이트가 좋다");	
			}else if(input8 == "N"){
				System.out.println("감정 표현에 솔직한 편이다");	
			}
			}
		}else if(input1 == "N") {
			System.out.println("감정기복이 크지않다");	
			String input7 = s.nextLine();
			if (input7 == "Y"){
				System.out.println("연락이 없어도 믿고 기다리는 편이다");
				String input9 = s.nextLine();
				if (input9 == "Y"){
					System.out.println("A");	
				}else if(input9 == "N"){
					System.out.println("이성친구는 존재할 수 없다");
					String input10 = s.nextLine();
					if (input10 == "Y"){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");	
					}else if(input10 == "N"){
						System.out.println("C");
					}
				}
			}else if(input7 == "N"){
				System.out.println("감정 표현에 솔직한 편이다");	
			}
		}
		}
		}