package edu.peters;

public class PrintHellorec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long n=123456789;
long d=100000001;
printHello(n,d);
 //123456789
//12345678
//1234567
//123456
//12345
//1234
//123
//12
//1
	}
private static void printHello(long n,long d) {
	if(d !=0) {
		System.out.println(n);
		d=d/10;
		printHello(n,d);
	}
}
}
