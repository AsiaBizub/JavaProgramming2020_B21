package day42_Inheritance.AnimalTask;

public class Animal {

    public String breed, color, name, size;
    public char gender;
    public int age;

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drinks){
        System.out.println(name+" is drinking "+drinks);
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

}
