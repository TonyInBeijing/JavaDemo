package charpter4_2.test;

import charpter4_2.Father;
import charpter4_2.charpter4_2_2.Person;
import charpter4_2.charpter4_2_2.Student;

public class MainTest extends Father {
    public static void main(String[] args) {
        System.out.println("我是MainTest");
//        MainTest mainTest = new MainTest();
//        mainTest.test2();
//        Person person = new Person();
//        person.printName();
        Student student = new Student();
        student.learn();
    }
}
