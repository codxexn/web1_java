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
//		// DateTimeFormatter: static (��üȭ �ʿ����)
//		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy�� MM�� dd��")));
//		// 4�� �̶�� ���� �ȵ�, 04�Ϸ� �ؾ� ��
//		System.out.println(LocalDate.parse("1900�� 12�� 04��", DateTimeFormatter.ofPattern("yyyy�� MM�� dd��")));
		
		
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
		
		
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy�� MM�� dd��");
//		Date date = new Date();
//		
//		System.out.println(simpleDateFormat.format(date));
	}
}
