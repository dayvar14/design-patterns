package com.dayvar.iterator.example;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public Iterator<Product> createIterator(){
    return new ListIterator(this);
  }

  private class ListIterator implements Iterator<Product> {
    private int index;
    private ProductCollection pc;

    public ListIterator(ProductCollection pc) {
      this.pc = pc;
    }

    @Override
    public boolean hasNext() {
      return index < pc.products.size();
    }

    @Override
    public Product current() {
      return pc.products.get(index);
    }

    @Override
    public void next() {
      index++;
    }
  }
}
