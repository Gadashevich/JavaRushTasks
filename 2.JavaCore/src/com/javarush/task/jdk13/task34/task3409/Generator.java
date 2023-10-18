package com.javarush.task.jdk13.task34.task3409;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Generator<T> {

    private Class<T> aClass;

    public Generator(Class<T> aClass) {
        this.aClass = aClass;
    }

    T newInstance() throws Exception {
        Constructor<T> declaredConstructor = (Constructor<T>) aClass.getDeclaredConstructors()[0];
        int parameterCount = declaredConstructor.getParameterCount();
        Object[] objects = new Object[parameterCount];
        return declaredConstructor.newInstance(objects);

    }

  public   T  m() throws Exception  {
        Constructor<T> declaredConstructor = (Constructor<T>) Event.class.getDeclaredConstructors()[0];
        int parameterCount = declaredConstructor.getParameterCount();
      Class<?>[] types = declaredConstructor.getParameterTypes();
      System.out.println(Arrays.toString(types));
      Object[] objects = new Object[parameterCount];
        objects[0] = "name";
        objects[1] = false;
    return declaredConstructor.newInstance(objects);
    }

    public static void main(String[] args) throws Exception{
        Generator<Event> generator = new Generator<Event>(Event.class);
        System.out.println(generator.m().toString());

    }
}
