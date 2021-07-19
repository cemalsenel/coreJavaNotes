package day30interfaces;

/*
  1) "Interface" is not a class
  2) "Interface" can contain just "abstract" methods
     "Abstract" classes can contain both "concrete" and "abstract" methods
  3) "Abstract class" is a class, but interface is not a class.
  4) "Interface" provides "fully abstraction" but "abstract classes" does not.
  5) Why do we need "interfaces" while we have "abstract classes"?
     ==> Java does not support "multiple inheritance". 
         It means a class cannot have multiple parents.
         But sometimes we need multiple parents because of that Java created "interfaces"
  6) When do we use "interfaces"?
    i) when we need to create "multiple parents" for a class ,we use interfaces
    ii) interfaces are "to-do list", if you want a child class to do something, put them into an interface
  7) Concrete Class  =====>> Interface use "implements" keyword. ( extends => in classes. implements=> in interface, ==> multiple inheritance can be done by using "comma")
          Interface  =====>> Interface use "extends" keyword
          Interface  =====>> Concrete Class is impossible, because a Concrete Class cannot be the parent of an interface
                        
  8)When a concrete class  has multiple parent interfaces, the parent interfaces may have
    methods whose signatures are same and return types are same. It is allowed.
    
  Note : If you use different return types with same signature, it creates problem, you will get Compile Time Error
  
  9) When you make an interface child of an another interface, no need to override abstract methods.( use method directly)
 */

public interface i01 {

}
