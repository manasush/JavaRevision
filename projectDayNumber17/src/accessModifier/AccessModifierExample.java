package accessModifier;

public class AccessModifierExample {
	
	//public: The code is accessible for all classes
	
	//private: The code is only accessible within the class
	
	//default: The code is only accessible in the same package. It is used when we do not specify a modifier
	
	//Protected: The code is accessible in the same package and subclasses
	
	
	//===========================================================
	//		Package 1					||		Package 2
	//===========================================================
	// Class B		||	Class A			||		Class C
	//===========================================================	
	//				N	Private			N
	//				
	//		    	Y	Public			Y	
	//				
	//				Y	Protected		N		Y(only using subclass)
	//				
	//				Y	Default			N
	//				
	//===========================================================				
					

}
