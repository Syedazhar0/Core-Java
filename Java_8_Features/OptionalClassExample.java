package Java_8_Features;

import java.util.Optional;

public class OptionalClassExample {

    //3
    public static Optional<String> getName(){
        String name = "Syed Azhar";
        return Optional.ofNullable(name);
    }


    public static void main(String[] args) {

        System.out.println("*******************");
        // before optional class 1
        String str=null;

        if(str==null){
            System.out.println("this is null object");
        }else {
            System.out.println(str.length());
        }

        System.out.println("*********************");
         //with optional class 2

        String str1 = null;

        Optional<String> optionalS = Optional.ofNullable(str1);
        System.out.println(optionalS.isPresent());
//        System.out.println(optionalS.get());
        System.out.println(optionalS.orElse("No Value In This Object"));

//3
        System.out.println("******************");
        Optional<String> nameOptional = getName();
        System.out.println(nameOptional.orElse("null return"));


    }
}
