package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		
//		LocalDate now = LocalDate.now();
//		System.out.println(now);
//		// DateTimeFormatter: static (객체화 필요없음)
//		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
//		// 4일 이라고 쓰면 안됨, 04일로 해야 함
//		System.out.println(LocalDate.parse("1900년 12월 04일", DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
		
		
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
//		Calendar calendar = Calendar.getInstance();
//		System.out.println(calendar);
//		
//		System.out.println(simpleDateFormat.format(calendar.getTime()));
//		try {
//			simpleDateFormat.parse("yyyy/MM/dd");
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		
		
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
//		Date date = new Date();
//		
//		System.out.println(simpleDateFormat.format(date));
	}
}
