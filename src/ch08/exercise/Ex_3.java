package ch08.exercise;

import java.util.Calendar;

public class Ex_3 {

	public static void main(String[] args) {
		String[] weekName = { "일", "월", "화", "수", "목", "금", "토" };
		String[] noonName = { "오전", "오후" };
		Calendar c = Calendar.getInstance();

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);

		System.out.println(year + "년 " + month + "월 " + day + "일 ");

		String week = weekName[c.get(Calendar.DAY_OF_WEEK) - 1];
		String noon = noonName[c.get(Calendar.AM_PM)];

		System.out.println(week + "요일 " + noon);

		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(hour + "시 " + minute + "분 " + second + "초 ");
	}

}
