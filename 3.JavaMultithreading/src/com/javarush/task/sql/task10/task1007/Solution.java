package com.javarush.task.sql.task10.task1007;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Collections;
import java.util.List;

/* 
task1007
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getIn(List.of("hr", "dev", "qa")).forEach(System.out::println);
    }

    public static List<Employee> getIn(List<String> in) {
        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory()) {
            Session session = sessionFactory.openSession();
            Query<Employee> query = session.createQuery("from Employee where smth in (:in) order by age", Employee.class);
            query.setParameter("in", in);
            return query.list();

        }
    }
}