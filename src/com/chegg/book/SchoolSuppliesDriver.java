package com.chegg.book;
public class SchoolSuppliesDriver {

      public static void main (String args[])   {

            SchoolSupplies bk = new Book("Data Structures", 150, "Main");

            Textbook tb = new Textbook();

            SchoolSupplies note = new Notebook("Staples", 2.50, "","spiral");

           

            System.out.println(tb);

            System.out.println(bk);

            System.out.println(note);

           

      }

}