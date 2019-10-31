package e_oop;

public class TV {

	public static void main(String[] args) { 
		TV tv = new TV("삼성");
		
		tv.power();
		tv.channelUp();
		tv.changeChannel(99);
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.power();
		tv.volumeUp();
		tv.power();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
	}
	
	//TV를 대상으로 가능한 TV와 비슷하게 TV 클래스를 만들어주세요.
	
	boolean power; //전원
	int channel; //채널
	int volume; //음량
	String brand; //브랜드
	
	final int MIN_CHANNEL = 1;
	final int MAX_CHANNEL = 100;
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 10;
	
	TV(String brand){
		power = false;
		channel = MIN_CHANNEL;
		volume = 5;
		this.brand = brand;
	}
	
	void power(){
		power = !power;
		System.out.println(power ? "TV 켜짐" : "TV 꺼짐");
	}
	
	void changeChannel(int channel){
		if(power){
			if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL){
				this.channel = channel;
			}
			System.out.println("채널. " + this.channel);
		}
	}
	
	void channelUp(){
		changeChannel(channel + 1);
	}
	
	void channelDown(){
		changeChannel(channel - 1);
	}
	
	void volumeUp(){
		if(power){
			if(volume < MAX_VOLUME){
				volume++;
			}
			showVolume(volume);
		}
	}
	
	void volumeDown(){
		if(power){
			if(MIN_VOLUME < volume){
				volume--;
			}
			showVolume(volume);
		}
	}
	
	void showVolume(int volume){
		System.out.print("음량. ");
		for(int i = MIN_VOLUME + 1; i <= MAX_VOLUME; i++){
			if(i <= volume){
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
		System.out.println();
	}
	

}

//과제. 클래스 하나로 간단한 프로그램을 만들어 주세요 - 금요일까지
//발표 : 프로그램 주제, 기능, 메서드 구성, 시연 
//주제는 자유. 가능하면 콘솔로 사용자가 입력하면서 프로그램이 실행되도록

