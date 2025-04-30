package study.practice30;

public class TV {

	String company;
	int years;
	int inch;
	
	TV(String company, int years, int inch ){
		this.company = company;
		this.years = years;
		this.inch = inch;
		
	}
	
	void show () {
		System.out.printf("%s제품 %d년형 %d인치 TV\n", company, years, inch);
	}		
}
