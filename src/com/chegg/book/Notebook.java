package com.chegg.book;
public class Notebook extends Book {

      private String type;

     

      public Notebook(String name, double cost, String auth, String tp) {

            super(name, cost, auth);

            type = tp;

      }

      @Override

      public String toString() {

            return "Notebook, type=" + type;

      }

}