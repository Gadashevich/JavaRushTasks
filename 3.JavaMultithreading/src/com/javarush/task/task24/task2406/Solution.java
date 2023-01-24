package com.javarush.task.task24.task2406;

import java.math.BigDecimal;

/* 
Наследование от внутреннего класса
*/

public class Solution {
    public class Building {
        public class Hall {
            private BigDecimal square;

            public Hall(BigDecimal square) {
                this.square = square;
            }
        }

        public class Apartments {
        }
    }

    public static void main(String[] args) {
    }

    public class Apt3Bedroom extends Building.Apartments {

        Apt3Bedroom(Building builder) {
            builder.super();
        }


    }

    public class BigHall extends Building.Hall {
        public BigHall(Building building, BigDecimal square) {
            building.super(square);
        }
    }


}
