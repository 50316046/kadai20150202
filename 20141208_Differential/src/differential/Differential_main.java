package differential;

import java.util.Scanner;

public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Input a>");
		double a = Double.parseDouble(scan.next());
		System.out.println("Input h>");
		double h = Double.parseDouble(scan.next());
		
		Differential_lib dlib= new Differential_lib(a,h);
		System.out.println("Input h>");
		System.out.println("f(x)=x^2のx="+a+ "における微分係数は"+dlib.getRx());
		System.out.println("f(x)=x^2のx="+a+ "における数値微分は"+dlib.getDx());
		System.out.println("理論値 ー 計算値　/ 理論値 ＊１００ ="+dlib.getFx());
	}
}
