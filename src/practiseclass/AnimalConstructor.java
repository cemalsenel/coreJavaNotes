package practiseclass;

public class AnimalConstructor {
    
    
    public int age = 15;
    public String name = "cat";
    public int weight = 25;
    
    public static void main(String[] args) {
    
        
        AnimalConstructor obj = new AnimalConstructor();
        
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.weight);
        
        obj.eat();
        obj.sound();
    
    }
    
    public static void eat() {
        System.out.println("Animals eat");
    }
    public static void sound() {
        System.out.println("Animals make sound");
    }
    
    
    
    
}
