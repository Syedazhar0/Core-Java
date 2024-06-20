package practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Arraylistex2 {
    public static void main(String [] args){
        // add the data into linked list
        List<ProductDetails1>product=new LinkedList<>();
        product.add(new ProductDetails1(101,"laptop",10000));
        product.add(new ProductDetails1(102,"tv",20000));
        product.add(new ProductDetails1(103,"mobile",15000));
        product.add(new ProductDetails1(104,"tab",25000));
        product.add(new ProductDetails1(105,"speakers",5000));

       // print the above details using java 8 forEach method
        product.forEach(p1 -> System.out.println(p1));
        System.out.println("*************");
        // product details sorted by name
        Collections.sort(product,new nameCompare());
        product.forEach(p-> System.out.println(p));
        System.out.println("*************");
        // product details sorted by id
        Collections.sort(product,new idCompare());
        product.forEach(id-> System.out.println(id));
        System.out.println("**************");
        //product details sorted by price
        Collections.sort(product, new priceCompare());
        product.forEach(p-> System.out.println(p));
    }
}
