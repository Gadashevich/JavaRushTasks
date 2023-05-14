package com.javarush.task.sql.task10.task1009;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/* 
task1009
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println("Salary fund: $" + getSalaryFund());
        System.out.println("Agerage age: " + getAverageAge());
    }

    public static Long getSalaryFund() {
       try( SessionFactory sessionFactory = MySessionFactory.getSessionFactory()){
           Session session = sessionFactory.openSession();
        //   Transaction transaction = session.beginTransaction();
           Query<Long> query = session.createQuery("select sum(salary) from Employee", Long.class);
           //transaction.commit();
           return query.uniqueResult();
       }

    }

    public static Double getAverageAge() {
        try(SessionFactory sessionFactory = MySessionFactory.getSessionFactory()){
            Session session = sessionFactory.openSession();
          //  Transaction transaction = session.beginTransaction();
            Query<Double> query = session.createQuery("select avg(age) from Employee", Double.class);
          //  transaction.commit();
            return query.uniqueResult();
        }

    }
}