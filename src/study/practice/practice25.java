package study.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class practice25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  /*
		  엘리베이터

			스마트 엘리베이터 시스템을 제작하려고 합니다.
			해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
			해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
			(반복문, 조건문, 배열, 메소드를 최대한 사용하시면 됩니다. )

			- 기본 문제
			1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
			(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
			엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
			엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
			참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다. (오로지 한번에 100층까지 쭉)

			+ 탑승 인원을 입력받습니다.
			+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다


			학생 10명의 시험 점수가 다음과 같이 주어졌다고 가정합니다.
			이 점수들을 배열에 저장한 뒤, 다음 조건에 따라 통계를 계산하는 프로그램을 작성하세요.
			
			int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
			
			최고 점수와 최저 점수를 력하세요.
			평균 점수를 출력하세요.
			80점 이상인 학생의 수를 출력하세요.
			
			출력 예)
			
			최고 점수: 100
			최저 점수: 63
			평균 점수: 82.5
			80점 이상 학생 수: 6명
		    */
			
			int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
			
			/*
			int max = scores[0];	//최대 값
			for(int i=0; i<scores.length; i++) {
				if(scores[i] > max)	 { 
					//지금까지의 최대값인 max보다 배열에 있는 값이 더 크다
					//더 큰 값 찾음
					max = scores[i];
				}
			}
			
			int min = scores[0];	//최소 값
			for(int i=0; i<scores.length; i++) {
				if(scores[i] < min)	 {
					min = scores[i];
				}
			}
			
			int sum = 0;	//평균 값
			for(int i=0; i<scores.length; i++) {
				sum = sum + scores[i];
			}
			double avg = (double)sum/scores.length;
			
			int count = 0;	//80점 이상 학생 수
			for(int i=0; i<scores.length; i++) {
				if(scores[i] >= 80) {
					count += 1;
				}
			}
			
			System.out.printf("최고 점수 : %d\n", max);
			System.out.printf("최저 점수 : %d\n", min);
			System.out.printf("평균 점수 : %.2f\n", avg);
			System.out.printf("80점 이상 학생수 : %d명\n", count);
			*/
			
			int max = scores[0];
			int min = scores[0];
			int sum = 0;
			int count = 0;
			
			for(int i=0; i<scores.length; i++) {
				if(scores[i] > max)	 { 
					max = scores[i];
				}			
				if(scores[i] < min)	 {
					min = scores[i];
				}
				sum = sum + scores[i];
						
				if(scores[i] >= 80) {
					count += 1;
				}
			}
			
			double avg = (double)sum/scores.length;
			
			System.out.printf("최고 점수 : %d\n", max);
			System.out.printf("최저 점수 : %d\n", min);
			System.out.printf("평균 점수 : %.2f\n", avg);
			System.out.printf("80점 이상 학생수 : %d명\n", count);
		}
				
	}	























