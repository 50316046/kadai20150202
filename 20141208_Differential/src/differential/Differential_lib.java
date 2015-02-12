package differential;

public class Differential_lib  {
	
	private double a,h,rx,dx,fx;
	
	public Differential_lib(double a, double h){
		this.a=a;
		this.h=h;
	}
	
	public double getRx(){
		rx=2*this.a;
		return rx;
	}
	
	public double getDx(){
		dx=(Math.pow(this.a+this.h,2)-Math.pow(this.a,2 ))/ h;
		return dx;
	}
	
	public double getFx(){
		fx=Math.abs(this.rx-this.dx)/this.rx*100;
		return fx;
	}
}
