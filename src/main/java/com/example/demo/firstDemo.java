package com.example.demo;

public class firstDemo {
	public static void main(String args[]) {
		double score = 80.0;
		if (score < 60.0) {
			System.out.println("小白的成绩");
		} else if(score >=60 && score < 80) {
			System.out.println("及格的成绩");
		} else if(score >=80 && score <=100) {
			System.out.println("优秀的成绩");
		} else {
			System.out.println("你的成绩真流弊");
		}
	}
}