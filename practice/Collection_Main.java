package practice;

import java.util.ArrayList;
import java.util.List;

public class Collection_Main {
    public static void main(String [] args){
        List<CollectionPojoClass> players= new ArrayList<CollectionPojoClass>();
        players.add(new CollectionPojoClass(101,"dhoni",31,"csk"));
        players.add(new CollectionPojoClass(102,"virat",28,"rcb"));
        players.add(new CollectionPojoClass(103,"rahul",22,"csk"));
        players.add(new CollectionPojoClass(104,"rashid khan",25,"kkr"));
        players.add(new CollectionPojoClass(105,"raina",21,"kkr"));
        players.add(new CollectionPojoClass(106,"andrerussel",35,"csk"));

        for (CollectionPojoClass player :players){
            if(player.getPlayername().equals("virat")){
                System.out.println(player);
            }
        }

        for (CollectionPojoClass player :players){
            if(player.getPlayerage()<30){
                System.out.println(player);
            }
        }

        for (CollectionPojoClass player :players){
            if(player.getPlayername().equals("dhoni")){
                player.setPlayername("msdhoni");
                player.setPlayerage(33);
                System.out.println(player);
            }
        }

        CollectionPojoClass player1 =null;
        int highestage =0;
        for (CollectionPojoClass player :players){
            if(player.getPlayerage()>highestage){
                highestage= player.getPlayerage();
                player1=player;
            }
        }
        System.out.println(player1);

//        CollectionPojoClass player1 =null;
//        int highestage =0;
//        for (CollectionPojoClass player :players){
//            if(player.getPlayerage()>highestage){
//                highestage= player.getPlayerage();
//                player1=player;
//            }
//        }
        players.remove(player1);
        for (CollectionPojoClass player :players){
            System.out.println(player);
        }
    }
}
