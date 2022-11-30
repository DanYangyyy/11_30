package com.Arrays_;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class ArraysExercise1 {
    public static void main(String[] args) {
        Book books[]=new Book[4];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("金瓶梅新",90);
        books[2] = new Book("青年文摘20版",5);
        books[3] = new Book("Java从入门到放弃",300);
        //price
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1=(Book) o1;
                Book book2=(Book) o2;
                double price_=book2.getPrice()-book1.getPrice();
                if(price_>0)
                    return  -1;
                else if (price_<0)
                    return 1;
                else
                    return 0;
            }
        });
        System.out.println(Arrays.toString(books));

        //书名
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1=(Book) o1;
                Book book2=(Book) o2;
                return book1.getName().length()-book2.getName().length();
            }
        });
        System.out.println(Arrays.toString(books));
    }
}
class Book{
    private String name;
    private double price;
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
