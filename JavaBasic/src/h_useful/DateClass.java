package h_useful;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date today = new Date(); // 현재 날짜
		System.out.println(today); // Tue Oct 15 11:04:38 KST 2019
		
		//날짜 -> 포멧 -> 문자열
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.sss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		
		String format = sdf1.format(today);
		System.out.println(format);
		System.out.println(sdf2.format(today)); //11:17:33.033
		System.out.println(sdf3.format(today)); //2019-10-15 11:17:33.033
		System.out.println(sdf4.format(today)); //2019-10-15 11:17:59 오전
		
		//문자열 -> 포맷 -> 날짜
		String str = "2019년 10월 16일";
		SimpleDateFormat  sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		try {
			Date dateStr = sdf5.parse(str);
			
			System.out.println(dateStr);
		} catch (ParseException e) {			 
			e.printStackTrace();
		} //오류 발생하여 throw 예외 처리 Wed Oct 16 00:00:00 KST 2019
		
		Calendar cal = Calendar.getInstance(); 
		
		//날짜 셋팅
		cal.setTime(new Date());
		cal.set(2019, 9, 16); //2019/10/16(월은 0부터 시작)
		System.out.println(sdf3.format(cal.getTime()));
		
		//날짜 계산
		cal.add(Calendar.YEAR,1);
		cal.add(Calendar.MONTH,2);
		cal.add(Calendar.DAY_OF_MONTH,-3);
		cal.add(Calendar.HOUR,2);
		cal.add(Calendar.MINUTE,5);
		cal.add(Calendar.SECOND,-10);
		System.out.println(sdf3.format(cal.getTime()));
	}

}
