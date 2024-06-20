package practice;

import java.util.Comparator;

// using comparator for custom sorting
public class ProductDetails1 {

    private int proId;
    private String proName;
    private double proPrice;

    public ProductDetails1(int proId, String proName, double proPrice) {
        this.proId = proId;
        this.proName = proName;
        this.proPrice = proPrice;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public double getProPrice() {
        return proPrice;
    }

    public void setProPrice(double proPrice) {
        this.proPrice = proPrice;
    }

    @Override
    public String toString() {
        return "ProductDetails1{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", proPrice=" + proPrice +
                '}';
    }
}

    // here you have to create the class for sorting here im going to sort the date using proname
//you have to create multiple class as per your sorting requirement ex: classes for name sort id sort price sort
    class nameCompare implements Comparator<ProductDetails1> {


        @Override
        public int compare(ProductDetails1 p1, ProductDetails1 p2) {
            return p1.getProName().compareTo(p2.getProName());
        }
    }

class priceCompare implements Comparator<ProductDetails1> {


    @Override
    public int compare(ProductDetails1 p1, ProductDetails1 p2) {
        return (int) (p1.getProPrice()-p2.getProPrice());
    }
}

class idCompare implements Comparator<ProductDetails1> {


    @Override
    public int compare(ProductDetails1 p1, ProductDetails1 p2) {
        return p1.getProId()- p2.getProId();
    }
}


