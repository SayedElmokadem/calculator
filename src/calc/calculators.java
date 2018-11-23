package calc;


public class calculators {
	void add(int x ,int y){
		System.out.println(x+y);	
	}
	
	void subtract(int x,int y){
		System.out.println(x-y);		
	}
	
	void multiplication(int x,int y){
		System.out.println(x*y);
	}
	void divison(int x,int y){
		if(y!=0){
		System.out.println(x/y);
		}else{
			System.out.println("not allow to divide by zero");
		}
	}
	public static void main(String[] args) {

		System.out.println(" hello calculator");
		System.out.println(" hello s");
		calculators calc=new calculators();
		calc.subtract(23,34);
		calc.add(234, 67);
                calc.divison(234, 67);

	}

}
