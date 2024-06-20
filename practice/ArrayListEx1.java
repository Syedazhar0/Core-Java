package practice;

import java.util.*;

public class ArrayListEx1 {
    //add product details into array list
    // tostring and constructor is automatically when object is created
        public static void main(String[] args) {
            List<productDetails> product = new ArrayList<>();
            product.add(new productDetails(105,"laptop",12000));
            product.add(new productDetails(103,"mobile",7000));
            product.add(new productDetails(101,"tab",22000));
            product.add(new productDetails(102,"speakers",2500));
            product.add(new productDetails(104,"tv",11000));

            //print the data step 1
//            System.out.println(product);
            //step2 using foreach loop
//            for(productDetails pro :product){
//                System.out.println(pro);
//            }
            //step 3 using for loop natural order
            Collections.sort(product);
//            for(int i=0; i<product.size();i++){
//                System.out.println(product.get(i));
//            }
                // reverse order
//            for(int i=product.size()-1;i>=0;i--){
//                System.out.println(product.get(i));
//           }
            //update product price to 20000 where pro name == tv
//            for(productDetails pro :product){
//                if(pro.getProName().equals("tv")){
//                    pro.setProPrice(20000);
//                    System.out.println(pro);
//                }
//            }
              // add the expensive products in to new arraylist price>10000
//            List<productDetails>expensiveproduct=new ArrayList<productDetails>();
//            for(productDetails expensive :product){
//                if(expensive.getProPrice()>10000){
//                    expensiveproduct.add(expensive);
//                }
//            }
//            for (productDetails p1 : expensiveproduct){
//                System.out.println(p1);
//            }

            // read the highest price product
//            double heighestprice=0; productDetails highestPricePro=null;
//            for(productDetails pro3 :product){
//                if(pro3.getProPrice()>heighestprice){
//                    heighestprice=pro3.getProPrice();
//                    highestPricePro=pro3;
//                }
//            }
//            System.out.println(highestPricePro);

            // read the lowest price product
//            productDetails lowestprice=product.get(0); productDetails lowestPricePro=null;
//            for(productDetails pro3 :product){
//                if(pro3.getProPrice()<lowestprice.getProPrice()){
//                    lowestprice=pro3;
//                }
//            }
//            System.out.println(lowestprice);

// print the product details whose name starts with t
//            for (productDetails pro4 : product){
//                if(pro4.getProName().charAt(0)=='t'){
//                    System.out.println(pro4);
//                }
//            }
            // get first product details of list
//            System.out.println(product.getLast());
//            System.out.println("****************");
            // get last product details of list
//            System.out.println(product.getFirst());
//            System.out.println("****************");
            // get middle product details of list
//            System.out.println(product.get(product.size()/2));

           // print the product details whose name ends with e
//           for (productDetails pro4 : product){
//                if(pro4.getProName().charAt(pro4.getProName().length()-1)=='e'){
//                    System.out.println(pro4);
//                }
//            }
            // find the size of arraylist size() method is used to find the length
            // System.out.println(product.size());

            // to get specific element form a arralist use get method
           // System.out.println(product.get(0));

            //to remove the specific element from arraylist use remove method
            //System.out.println(product.remove(1));

            //to remove all we use removeall method
            //System.out.println(product.removeAll(product));

            // get the index of specific element
               // but it will work for only homogeneous data present the arraylist contains different data type like int string
            // System.out.println(product.indexOf(111));


            // to add the element at specific index position use add method
          // product.add(5, new productDetails(20,"hell",200000));
//           for (productDetails  p6 : product){
//               System.out.println(p6);
//            }

             // use isempty method to check list is empty or not
              //System.out.println(product.isEmpty());

            // display the product details using iterator interface used only for forward direction
//              Iterator<productDetails> list =product.iterator();
//              while (list.hasNext()){
//                System.out.println(list.next());
//            }
              //display the product details using list iterator interface used for both forward and backward
              // forward direction
           ListIterator<productDetails> list2= product.listIterator(2);
           while (list2.hasNext()){
               System.out.println(list2.next());
           }
///// backward direction if you want the elements form  the specific index pass the index number into parenthesis above
            while (list2.hasPrevious()){
                System.out.println(list2.previous());
            }
        }
    }

