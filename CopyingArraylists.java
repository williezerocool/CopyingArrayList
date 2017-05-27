/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyingarraylists;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class CopyingArraylists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> arrList = new ArrayList<>();
       
        
        do{
        
            Integer num = 1 + r.nextInt(99);
            arrList.add(num);
        }while(arrList.size() < 10); 
        
        ArrayList<Integer> arrList2 = new ArrayList<>(arrList);
        
        
        arrList.set(9, -7);
        System.out.println("ArrayList 1: "+ arrList);
        System.out.println("ArrayList 2: "+ arrList2);
        
    }
    
}
