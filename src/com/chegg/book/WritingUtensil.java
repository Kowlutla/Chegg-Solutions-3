package com.chegg.book;
public class WritingUtensil extends SchoolSupplies {

      private String color;

     

      public WritingUtensil(String name, double cost, String col) {

            super(name, cost);

            color = col;

      }

      @Override

      public String toString() {

            return "WritingUtensil, color=" + color;

      }

}