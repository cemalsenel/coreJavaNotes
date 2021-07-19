package practiseclass;

public class InstanceLocalClassVariables {
	
	 /*
    ====Instance(Object) Variables=======
    ->We create instance variables inside the class but outside of the methods
    ->If you don't initialize, (assigning value) an instance variable, Java will assign them
    default values.
    ->Instance variables are not static
    ->To access instance variables you need to create an object
      You can not access  instance variables by class name
        Default values:
        For byte, short, int, long default value is 0
        For char default value is ''
        For boolean default value is false
        For float, double default value is 0.0
        For String default value is null
        
    ====Class Variables===========
    ->We create class variables inside the class but outside of the methods
    ->Class variables are 'static' 
    ->You can access class variables by using class name 
    
    Note: The main differences between static(class) variables and instance (object) variables is that
         a)All updates on a static variable is visible by all objects which are created from class but all 
         updates  on an instance variables is visible just by only object
         
         b)static variables are common for all objects but instance variables are specified for an object
         
         
         =====Local Variable=====
         If you create a variable inside a method it is called "local variable"
         We have to initialize local variables 
         There is no default value for local variables
    
    Note: Local variables which are created in static methods are static automatically.
    */

	
	
	
	
	int num1 =5;//Instance Variable
	int num3;   //Instance Variable (no need to assign,it will be assigned by default)
	String str; //Instance Variable (no need to assign,it will be assigned by default)
	double d;   //Instance Variable (no need to assign,it will be assigned by default)
	char c;     //Instance Variable (no need to assign,it will be assigned by default)

	public static void main(String[] args) {
		
		

	}
	
	
	int num2 =5;//Instance Variable
	public static int add(int a ,int b) {
		
		return a+b;
	}

}
