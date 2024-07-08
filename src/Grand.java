public interface Grand {

    public default void Test(){
        System.out.println("This works in default");

    }

    public static void some(){
        System.out.println("Some static methods being clalled");
    }
    
}
