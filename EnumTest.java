package com.java.session17;

public class EnumTest {
	Week day;
	public void myDay(Week day){
		this.day = day;
	}
	public void daysILike(){
		switch(day){
		case MONDAY:
			System.out.println("Working day");
			break;
		case TUESDAY:
			System.out.println("I don't like tuesday");
			break;
		case THURSDAY:
			System.out.println("Working day");
			break;
		case FRIDAY:
			System.out.println("Party Day");
			break;
		case SATURDAY:
			System.out.println("I Like SATURDAY");
			break;
		case SUNDAY:
			System.out.println("Best Day of Week");	
			break;
		}
	}
	public static void main(String[] args){
		EnumTest et = new EnumTest();
		et.myDay(Week.MONDAY);
		et.daysILike();
		et.myDay(Week.SUNDAY);
		et.daysILike();
		
	}
}
