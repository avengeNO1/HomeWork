package com.allhomework.oophomework.transform;

/**
 * @author HuAng
 *
 *向下转型和向上转型
 */
public class Person {
    public void run(){
        System.out.println("person run");
    }
    public void eat(){
        System.out.println("person eat");
    }
}
class Student extends Person{
    @Override
    public void run() {
        System.out.println("student run");
    }

    @Override
    public void eat() {
        System.out.println("student eat");
    }


}

   