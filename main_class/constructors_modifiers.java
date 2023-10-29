package main_class;
import sub_classes.sub_class012;
import abstract_class.extend_abstract_class;
public class constructors_modifiers {
    public int num = 5;
    String var1;
    public static void main(String[] args){
        System.out.println("Hi");

        // creating the object out of main class
        constructors_modifiers obj1 = new constructors_modifiers();
        System.out.println(obj1.concate("Hello.. How are you?"));
        System.out.println(obj1.concate1("Private modifier method. Hello.. How are you?"));
        System.out.println(concate2());

        //Printing out the constructor content.
        System.out.println(obj1.var1);

        // creating an object out of a sub-class residing in a separate package.
        sub_class012 obj2 = new sub_class012();
        System.out.println(obj2.method1());

        // calling out the constructor values from the sub_class012
        System.out.println(obj2.x);

        //Creating an inherited object.
        extend_abstract_class ext_obj = new extend_abstract_class();
        System.out.println(ext_obj.vari1);
        System.out.println(ext_obj.abs_method());

    }


    //Main class method. It doesn't use static, so can be called by the main class.
    public String concate(String argu){
        return argu + "Here we are at the method level in a class";
    }

    // can only be called with in the class.
    private String concate1(String argu){
        return argu + "Here we are at the method level in a class";
    }

    // can be called without initializing object.
    static String concate2(){
        return "Hello, from Static Method";
    }


    //Constructor.. When an object is created out of a class, a default constructor is
    //created by Java. This one below is to overwrite that default constructor.
    // Constructor does not have any return type and it should have the class name as its name..
    public constructors_modifiers(){
        var1 = "Constructor being created and automatically called upon";
    }

}


