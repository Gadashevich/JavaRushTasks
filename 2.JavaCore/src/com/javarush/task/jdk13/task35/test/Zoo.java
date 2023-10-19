package com.javarush.task.jdk13.task35.test;

public class Zoo<T > {
    public Dog dog;
    public Cat cat;
    public Snake snake;
    public Horse horse;

public void eat(T t){
    System.out.println( t.toString() + "Спит");
}

public void sleep(){

}


}
