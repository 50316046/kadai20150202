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
		//System.out.println(s+"ÌKæF"+mms.getFactorial(s));
		//System.out.print(s+"C"+r);
		//System.out.println("="+mms.getConbination(s,r));
		
		//System.out.print("P0Ìl"+mms.getP0());
		
		System.out.println("p¦Ï:"+mms.getRho());
		System.out.println("½ÏÒ¿lLq:"+mms.getLq());
		System.out.println("½Ïnàl"+mms.getL());
		System.out.println("½ÏÒ¿Ô"+mms.getWq());
		System.out.println("½ÏnàÔ"+mms.getW());
	}

}
