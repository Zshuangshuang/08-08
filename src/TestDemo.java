/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-07
 * Time:10:00
 **/
class Animal{
    public String name;
    public Animal(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println(this.name+"Animal:正在吃!");
    }
}
//子类继承了父类除构造方法之外的所有东西
class Cat extends  Animal{
    public Cat(String name){
        super(name);
    }
    public String bread;
    public void eat(){
        System.out.println(this.name+"Cat:正在吃");
    }


}
class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

}
public class TestDemo {
    public static void func(Animal animal){

    }
    public static Animal func(){
        Cat cat = new Cat("嘻嘻");
        return cat;
    }

    public static void main(String[] args) {
        /*Cat cat = new Cat("淼淼");
        cat.eat();
        Bird bird = new Bird("八哥");
        bird.eat();*/
       /* Animal animal = new Cat("妙妙");
        animal.eat();*/
      /* Cat cat = new Cat("妙妙");
       func(cat);
       cat.eat();*/
      Animal animal = func();
      animal.eat();
    }
}
