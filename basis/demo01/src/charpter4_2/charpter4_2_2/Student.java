package charpter4_2.charpter4_2_2;

public class Student {
    public void learn(){
        System.out.println("学习");
        Dog dog = new Dog();
        dog.wang();
        Cat cat = new Cat();
        cat.miao();
    }
}

class Dog{
    public void wang(){
        System.out.println("汪汪");
    }
}

class Cat{
    public void miao(){
        System.out.println("喵喵");
    }
}

