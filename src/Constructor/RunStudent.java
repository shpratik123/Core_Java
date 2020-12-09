package Constructor;

import Classwork.Arraylist;

import java.util.ArrayList;

public class RunStudent {
    public static void main(String[] args) {
       /* Student s1=new Student(1,"john","Dallas");
        Student s2=new Student(2,"jack","California");
        Student s3=new Student(3,"johny","Florida");
        Arraylist studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        //;....
        System.out.println("Original List");
        for(Object s:studentList){
            System.out.println(s.toString());
        }
        studentList.remove(0);
        System.out.println("After removing");

        for(Object s:studentList){
            System.out.println(s.toString());
    }*/
        Student s1 = new Student(1, "john", "Dallas");
        Student s2 = new Student(2, "Jack", "California");
        Student s3 = new Student(3, "johny", "Florida");
        ArrayList studentList = new ArrayList<Student>();//arraylist banauna ko lagi yo lekhnu parcha

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        //Note, to use the toString() and print the student info, must override the
        //toString() in Student class
        // System.out.println(s1.toString()); // Student@6acbcfc0
        //System.out.println(s2.toString());
        System.out.println("Orignial List");
        for (Object s : studentList) {
            System.out.println(s.toString());
        }
        studentList.remove(0);
        System.out.println("After Removing");
        for (Object s : studentList) {
            System.out.println(s.toString());
        }

    }
}
