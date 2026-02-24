package special_classes;

public class MathClass {
/*
 * Math Class is provided in java, lang package. java.lang pacakge provides
 * 
 * Math.min, Math.max. Math.E, Math.PI
 * Math.pow, Math.sqrt, Math.cbrt
 * Math.cell, Math.floor, Math.round
 * Math.sin, Math.cos, Math.tan, Mth.log10
 * Math.random
 * */
	public static void main(String[] args) {
		
		int num1 =10;
		int num2=20;
		
		System.out.println("Min : "+Math.min(num1, num2));
		System.out.println("Max : "+Math.max(num1, num2));
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println("	-------------------------");
		System.out.println(Math.pow(2,4));
		System.out.println(Math.sqrt(100));
		System.out.println(Math.cbrt(125));
		System.out.println("	-------------------------");
		double n = 45.84;
		System.out.println("Ceilling for "+n +"	: "+Math.ceil(n));
		System.out.println("Floor for "+n +"		: "+Math.floor(n));
		System.out.println("Round up for "+n +"	: "+Math.round(n));
		System.out.println("	-------------------------");
		System.out.println(Math.random()); //0-1
		
	}
	
	
	
	
	
	
	
	
	
}
