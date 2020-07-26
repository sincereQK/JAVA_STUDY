import java.util.Scanner;

public class Fraction {
	int numerator;		//분자 필드
	int denominator;	//분모 필드
	public Fraction() {
		numerator = denominator = 1;
	} 		//분자와 분모를 1로 지정하는 생성자
	public Fraction(int d) {
		numerator = 1;
		denominator = d;
	}	//분자는 1로 지정, 분모는 d로 지정하는 생성자
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	} 	//분자는 n, 분모는 d로 지정하는 생성자
	
	public int getNumerator() {
		return numerator;
	}
	
	public void setNumerator(int n) {
		this.numerator = n;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void setDenominator(int d) {
		this.denominator = d;
	}
	
	public static Fraction addFraction(Fraction f1, Fraction f2) {
		int ntemp = (f1.numerator*f2.denominator) + (f2.numerator*f1.denominator);
		int dtemp = f1.denominator * f2.denominator;
		return new Fraction(ntemp,dtemp);
	}
	public static Fraction subFraction(Fraction f1, Fraction f2) {
		int ntemp = (f1.numerator*f2.denominator) - (f2.numerator*f1.denominator);
		int dtemp = f1.denominator * f2.denominator;
		return new Fraction(ntemp,dtemp);
		
	}
	public static Fraction mulFraction(Fraction f1, Fraction f2) {
		int ntemp = f1.numerator * f2.numerator;
		int dtemp = f1.denominator * f2.denominator;
		return new Fraction(ntemp,dtemp);
	}
	public static Fraction divFraction(Fraction f1, Fraction f2) {
		int ntemp = f1.numerator * f2.denominator;
		int dtemp = f1.denominator * f2.numerator;
		return new Fraction(ntemp,dtemp);
	}
	
	public void printFraction1(Fraction f1) {
		System.out.println(f1.numerator+" / "+f1.denominator);
	}
	
	public String printFraction() {
		String str1 = numerator+"/"+denominator;
		return str1;
	}
	
	public static void main(String[] args) {
		Fraction frac1 = new Fraction();
        Fraction frac2 = new Fraction();
        Fraction fracResult = new Fraction();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("분수 1(분자 분모) 입력: ");
		frac1.setNumerator(sc.nextInt());
		frac1.setDenominator(sc.nextInt());
		
		System.out.print("분수 2(분자 분모) 입력: ");
		frac2.setNumerator(sc.nextInt());
		frac2.setDenominator(sc.nextInt());
		
		fracResult = addFraction(frac1, frac2);
		System.out.println(frac1.printFraction()+"+"+frac2.printFraction()+"="+fracResult.printFraction());
		
		fracResult = subFraction(frac1, frac2);
		System.out.println(frac1.printFraction()+"-"+frac2.printFraction()+"="+fracResult.printFraction());
		
		fracResult = mulFraction(frac1, frac2);
		System.out.println(frac1.printFraction()+"*"+frac2.printFraction()+"="+fracResult.printFraction());
		
		fracResult = divFraction(frac1, frac2);
		System.out.println(frac1.printFraction()+"/"+frac2.printFraction()+"="+fracResult.printFraction());
			
        sc.close();
	}
}

	
	

