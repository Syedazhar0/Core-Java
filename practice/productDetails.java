package practice;

public class productDetails implements Comparable<productDetails> {
    //pojo class always private and class is public
    private int proId;
    private String proName;
    private double proPrice;

    public productDetails(int proId, String proName, double proPrice) {

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
        return "productDetails{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", proPrice=" + proPrice +
                '}';
    }

    @Override
    //here the comparable is used to for natural sorting it means we can sort the data by using proid but not with name
    // to sort with name or price go for comparator which is used for customized sorting
    public int compareTo(productDetails o) {
//        return this.proId-o.proId;// natural sorting or ascending order
        return -this.proId-o.proId;// natural sorting or descending order use - symbol to print in descending order

    }
}
