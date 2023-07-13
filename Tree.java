public class Tree {
    static {
        System.out.println("Code static big: 1");
    }
    public static String name = name();

    public static String name () {
        System.out.println("Code method big: 2");
        return "Tree";
    }

    {
        System.out.println("Code block big: 5");
    }

    public Tree() {
        System.out.println("Code Constructor big: 6");
    }

}
