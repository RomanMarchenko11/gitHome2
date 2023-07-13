public class Cherry extends Tree {
    static {
        System.out.println("Code static small: 3");
    }
    {
        System.out.println("Code block small: 7");
    }
    public Cherry() {
        System.out.println("Code Constructor small: 8");
    }

    public static String nameTree = nameTree();

    public static String nameTree() {
        System.out.println("Code method samall: 4");
        return "Cherry";
    }
}
