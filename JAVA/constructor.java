//using opps

import java.util.Scanner;
 class Deposit{
	private long principal;
	private int time;
	private double rate;
	private double tot_amt;
	 
	 public Deposit()
	 {
		principal=12;
		time=5;
		rate=50;
		
		 
	 }
	 Deposit(long principal ,int time ,double rate)
	 {
		 this.principal=principal;
		 this.time=time;
		 this.rate=rate;
		 
	 }
	 Deposit(long pricipal,int time)
	 {
		 this.principal=principal;
		 this.time=time;
		 
	 }
	Deposit(long principal,double rate)
	{
		this.principal=principal;
		this.rate=rate;
		
	}
	public  void display(){
		System.out.println(principal+" "+time+" "+rate);
		
	}
	public  double cal_amt() {
		tot_amt=principal + (principal*rate*time)/100;
		return tot_amt;
	}
	
	
	
}
public class Q1 {

	public static void main(String[] args) {
		Deposit s=new Deposit(58,2.5);
		s.display();
		System.out.println(s.cal_amt());
	}

}
