package com.javarush.task.sql.task10.task1008;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.Collections;
import java.util.List;

/* 
task1008
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getSorted(3, 5).forEach(System.out::println);
    }

    public static List<Employee> getSorted(int offset, int limit) {
       try( SessionFactory sessionFactory = MySessionFactory.getSessionFactory()){
           Session session = sessionFactory.openSession();
           Query<Employee> query = session.createQuery("from Employee order by age", Employee.class);
           query.setFirstResult(offset);
           query.setMaxResults(limit);
           return query.list();
       }

    }
}