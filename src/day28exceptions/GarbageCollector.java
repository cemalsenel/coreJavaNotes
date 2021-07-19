package day28exceptions;

public class GarbageCollector {
	
	/*
	 Final keyword usage:
	a) if you use it for methods: no update in body, no overriding;
	b) if you use it for classes it means no inheritance or no child classes;
	c) If you use final for variables ==> you can not change its value;
	d) when you put final for a variables you have to initialize it;
	e) if you want a value to be constant make it final:
	f) Final class is called final class because of the final keyword, and this class can not be extended (inherited);
	g) Finals can not be overridden; can not change the body;

	FINALLY ==> is a code block;
	a) Why do we use it? ==> To end connections with cloud, to end connection with database;
	b) How do we use it? ==> "in a try-catch-finally block" and "with a try block regardless of whether a catch block is present"
	c) What is finally keyword? ==> finally defines a block of code we use along with the try keyword. It defines code that's always run after the try and any catch block, before the method is completed.
	
	
	To destroy an object ==> make it ready with finalize method then it will be destroyed by Garbage Collector;
	1)Garbage collector destroys the "finalized" objects;
	2) To finalize an object Java uses "finalize" method;
	3) If you want you can call finalize method among your code, but Java decides when and how to use finalized method;
	 */
	
	/*
 	1)Garbage Collector deatroys the "finalized" objects
 	2)To finalize an object Java uses "finalize()" method
 	3)If you want you can call "finalize()" method among your code but
 	  Java decides when and how to use finalize() method.
*/

/*
 	Explain "final", "finally", and "finalize"?
 	
 	1)"final" is a keyword, "finally" is a code block, "finalize" is a method
 	2)"final" ==> a)final variables:
 						i)Final variables must be initialized
 						ii)Final variable values cannot be modified
 						ii)Final variables should be named by using uppercases
 	              b)final methods:
 	              		i)Final methods cannot be overridden but can be overloaded
 	              c)final classes:
 	              		i)Final classes cannot have child classes. No inheritance, no extends.
 	              		
   3)"finally" ==> a)It is used with try block or try-catch block  
                   b)It is executed when the exception is thrown or the exception is not thrown
                   c)It is used to end connections with database, or cloud or it is used to 
                     close a file.
   
   4)"finalize" ==> a)It is executed before Garbage Collector destroys the objects
*/
	 
	 

}
