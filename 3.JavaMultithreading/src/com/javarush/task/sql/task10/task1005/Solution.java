package com.javarush.task.sql.task10.task1005;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.javarush.task.sql.task10.task1005.entities.Book;

import java.util.List;

/* 
task1005
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Book> books = null;
       try( SessionFactory sessionFactory = MySessionFactory.getSessionFactory())
       {
           Session session = sessionFactory.openSession();
        //  Transaction transaction = session.beginTransaction();
           Query<Book> query = session.createQuery("from Book where author.fullName='Mark Twain' and publisher.name ='Фолио'", Book.class);
        //   transaction.commit();
           books = query.list();
       }


        books.forEach(System.out::println);
    }
}