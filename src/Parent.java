public abstract class Parent {
    int level;

    String ops;

    // there are constructors involed now.
    public Parent(int level){
        this.level=level;
    }
    public Parent(String ops){
        this.ops=ops;
    }

    public void someMethod(){
        System.out.println("Parent method to be called ");
    }
}
