package e_oop;

public class AirConditioner {

	public static void main(String[] args) {
		AirConditioner aircon = new AirConditioner(); //객체생성
		
		aircon.tempratureUp();
		System.out.println(aircon.temperature);
		aircon.power();
		aircon.tempratureUp();
		System.out.println(aircon.temperature);
		aircon.tempratureDown();
		aircon.tempratureDown();
		System.out.println(aircon.temperature);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
		System.out.println(aircon.airVolume);
		System.out.println(aircon.airVolume);
		System.out.println(aircon.airVolume);
		System.out.println(aircon.airVolume);
		System.out.println(aircon.airVolume);
		System.out.println(aircon.airVolume);
		System.out.println(aircon.airVolume);		
				
	}
	
	//온도가 18~30 까지만 변경할 수 있게 해주시고
	//전원을 켰을때만 버튼들이 작동되도록 메서드들을 변경해주세요
	
	boolean power; //전원
	int temperature; //온도
	int airVolume; //풍량
	
	AirConditioner(){ //생성자생성
		power = false;
		temperature = 24;
		airVolume = 1;
	}
	
	//전원 버튼
	void power(){
		power = !power;
	}
	//온도 + 버튼
	void tempratureUp(){
		if(power){
		if(temperature < 30){
			temperature++;
		}
		}
	}
	//온도 -버튼
	void tempratureDown(){
		if(power && temperature > 18){
			temperature--;
		}
	}
	//풍량버튼
	void airVolume(){
		if(power && 3 < ++airVolume){
			airVolume = 1;
		}
	}
}
