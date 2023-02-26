package com.javarush.task.sql.task09.task0902;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/*
Entity
*/
//напишите тут ваш код
@Entity
@Table(name = "animal_table", schema = "test")
public class Animal {
        @Id
        @Column(name = "id")
        private  Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "age")
        private  Integer age;

        @Column(name = "family")
        private String family;

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public String getFamily() {
                return family;
        }

        public void setFamily(String family) {
                this.family = family;
        }
}