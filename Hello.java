public class Hello {
    public static void main(String[] args) {
        Hello str = new Hello();
        System.out.println(str.helloName("Shaimaa"));
        System.out.println(str.helloName("Balqees"));
        System.out.println(str.helloName("Noura"));
        System.out.println(str.helloName("Afnan"));
        System.out.println(str.helloName("Taibaa"));
    }
    public String helloName(String input) {
        return "Hello " + input + "!";
    }
}