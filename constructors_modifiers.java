public class constructors_modifiers {
    public int num = 5;
    public static void main(String[] args){
        System.out.println("Hi");
        constructors_modifiers obj1 = new constructors_modifiers();
        System.out.println(obj1.concate("Hello.. How are you?"));
    }

    public String concate(String argu){
        return argu + "Here we are at the method level in a class";
    }
}
