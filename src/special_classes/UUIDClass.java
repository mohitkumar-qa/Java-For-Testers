package special_classes;

import java.util.UUID;

public class UUIDClass {
	
	/*UUID - Universally Unique Identifier
	 * UUID is 128-bit unique value used to -> 
	 * uniquely identify, objects, records, sessions,
	 * trasactions,etc.
	 * */
public static void main(String[] args) {
	
	for(int i=1;i<=5;i++) {
		
		System.out.println(UUID.randomUUID());
	}

	
}
}
