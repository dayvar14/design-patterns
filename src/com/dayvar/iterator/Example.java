package com.dayvar.iterator;


import com.dayvar.iterator.example.Iterator;
import com.dayvar.iterator.example.Product;
import com.dayvar.iterator.example.ProductCollection;

public class Example{
    public static void main(String[] args){
        //Original Class uses a list to store data
        ProductCollection pc = new ProductCollection();
        pc.add(new Product(0,"Hair Brush"));
        pc.add(new Product(1,"Nintendo Switch"));
        pc.add(new Product(2,"Naked Smoothie"));



        Iterator<Product> iterator = pc.createIterator();
        while (iterator.hasNext()){
            Product product = iterator.current();
            System.out.println(product);
            iterator.next();
        }
    }
}
