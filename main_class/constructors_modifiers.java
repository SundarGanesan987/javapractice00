package main_class;
import sub_classes.sub_class012;
public class constructors_modifiers {
    public int num = 5;
    public static void main(String[] args){
        System.out.println("Hi");

        // creating the object out of main class
        constructors_modifiers obj1 = new constructors_modifiers();
        System.out.println(obj1.concate("Hello.. How are you?"));

        // creating an object out of a sub-class residing in a separate package.
        sub_class012 obj2 = new sub_class012();
        System.out.println(obj2.method1());

    }


    //Main class method. It doesn't use static, so can be called by the main class.
    public String concate(String argu){
        return argu + "Here we are at the method level in a class";
    }
}

