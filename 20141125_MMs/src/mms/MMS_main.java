package mms;

import java.util.Scanner;

public class MMS_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Input Lambda>");
		double lambda=Double.parseDouble(scan.next());
		System.out.print("Input Mu>");
		double mu=Double.parseDouble(scan.next());
		System.out.print("Input s>");
		int s=Integer.parseInt(scan.next());
		//System.out.print("Input r>");
		//int r=Integer.parseInt(scan.next());
		
		MMS_lib mms=new MMS_lib(lambda,mu,s);
		//System.out.println(s+"の階乗："+mms.getFactorial(s));
		//System.out.print(s+"C"+r);
		//System.out.println("="+mms.getConbination(s,r));
		
		//System.out.print("P0の値"+mms.getP0());
		
		System.out.println("利用率ρ:"+mms.getRho());
		System.out.println("平均待ち人数Lq:"+mms.getLq());
		System.out.println("平均系内人数"+mms.getL());
		System.out.println("平均待ち時間"+mms.getWq());
		System.out.println("平均系内時間"+mms.getW());
	}

}
