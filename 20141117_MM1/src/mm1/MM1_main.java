package mm1;

import java.util.Scanner;

public class MM1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Input Lambda > ");
		double lambda=Double.parseDouble(scan.next());
		
		System.out.print("Input Mu > ");
		double mu=Double.parseDouble(scan.next());
		
		
			MM1_lib mlib= new MM1_lib(lambda,mu);
			System.out.println("p="+mlib.getRho());
			System.out.println("p="+mlib.getLength());
			System.out.println("p="+mlib.getTime());
			System.out.println("p="+mlib.getQueue());
			System.out.println("p="+mlib.getWtime());
		}
}

	


