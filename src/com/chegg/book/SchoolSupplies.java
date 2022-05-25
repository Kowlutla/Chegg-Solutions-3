package com.chegg.book;
public class SchoolSupplies {

      private String name;

      private double cost;

     

      public SchoolSupplies() {

            name = "Generic";

            cost = 0.0;

      }

      public SchoolSupplies (String n, double c)      {

            name = n;

            cost = c;

      }

      @Override

      public String toString() {

            return "SchoolSupplies, name=" + name + ", cost=" + cost;

      }

}