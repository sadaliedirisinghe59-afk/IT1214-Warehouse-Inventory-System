class Calculator{
	public int add (int a, int b){
		System.out.print("Int Add: ");
		return a+b;
	}
	public double add(double a, double b){
		System.out.print("Double Add: ");
		return a+b;
	}
	public int add(int a, int b, int c){
		System.out.print("Three param Add: ");
		return a+b+c;
	}
}


public class Main4{
	public static void main(String args[]){
		Calculator Calc = new Calculator();
		System.out.println(Calc.add(5 ,10));
		System.out.println(Calc.add(5.5 ,5.2));
		System.out.println(Calc.add(5 ,10,15));
		System.out.println(Calc.add(5 ,10.0));
		
	}
}