package special_classes;

public class StringBuilderClass02 {
	public static void main(String[] args) {
	/*
	 * Some useful methods from StringBuilder
	 * insert, replace, delete, reverse
	 * 
	 * */
		StringBuilder sb1 = new StringBuilder("Learning is fun");
											 //012345678910111213
		System.out.println(sb1);
		System.out.println("	-------------------");
		sb1.insert(9,"Java "); // use index value starts from zero
		System.out.println(sb1);
		System.out.println("	-------------------");
		sb1.replace(9, 13, "Coding");
		//Starting index and last index+1 
		System.out.println(sb1);
		System.out.println("	-------------------");
		String sv = "ddMdodhdidtdd";
		System.out.println(sv);
		System.out.println(sv.replace("d", ""));
		System.out.println("	-------------------");
		System.out.println(sb1);
		sb1.delete(0, 9);
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		
}
}
