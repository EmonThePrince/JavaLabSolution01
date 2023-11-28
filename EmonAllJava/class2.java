package EmonAllJava;
class class21{
    public String a;
    private String b;
    protected String c;
    String d;
    public class21(){
        a="Public string of class21";
        b="Private string of class21";
        c="Prptected string of class21";
        d="Default string of class21";
    }
    public void meth(){
        System.out.println("This is from class21");
    }
}

public class class2 {
    public String a; //available to every where
    private String b; // available only to this class
    protected String c; //available to everywhere(same package) except subclasses(excluding same package)
    String d; // available to same package. 

    public class2(){
        a="Public string of class2";
        b="Private string of class2";
        c="Prptected string of class2";
        d="Default string of class2";
    }
    public void meth(){
        System.out.println("This is from class2");
    }
}
