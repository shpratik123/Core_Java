package Inheritence;

public class Test {
    public static void main(String[] args) {
        //Parent information
        System.out.println("Parent Info");
        Parent p = new Parent();
        System.out.println(p.toString());

        //Child information
        System.out.println("Child info");
        Child c = new Child(10);
        c.setId(2);
        c.setAge(17);
        c.setName("Child");
        c.setAddress("USA");
        System.out.println(c.toString());
        c.childTest();//child can access the child methods
        //
        //if parent is created from child, only parents method can be accessed

        Parent p1=new Child(2);
        //p1.childTest();//not accessible

        p1.testParent();//OK


    }
}
