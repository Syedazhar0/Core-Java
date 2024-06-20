package Collections;

public class HeadOfCollections {
    public static void main(String [] args){

        // before collections and array how the multiples are stored
        // worst way of storing data
//        int a = 10;
//        int b = 20;
//        int c = 10;
//        int d = 20;
//        int e = 10;
//        int f = 20;

// array stores only homogeneous
        // but in array the size of array is
        // fixed if in future you want to store you cant it will give array index out of bound
//        int [] arr = new int[10];
//         arr[0]=1;// so on

        Student [] students = new Student[10];
        Book [] book = new Book[10];
        students[0]= new Student(101,"azhar",99.1);
        students[1]= new Student(102,"mazhar",88.0);
        book[1]= new Book(101,"Java",100);


        System.out.println(students[0].sid+" "+students[0].sname+" "+students[0].smarks);
        System.out.println(book[1].id+" "+book[1].bookName+" "+book[1].bookPrice);
    }
}
class Book{
   int id;
   String bookName;

   int bookPrice;

    public Book(int id, String bookName, int bookPrice) {
        this.id = id;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }
}
class Student{

    int sid;
    String sname;
    double smarks;

    public Student(int sid, String sname, double smarks) {
        this.sid = sid;
        this.sname = sname;
        this.smarks = smarks;
    }
}
// the above is the complete process we follow before collections