package Collections;
import java.util.*;  
public class HashMapDemo{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
   map.put(1,"Harshitha");  //Put elements in Map  
   map.put(2,"Javeria");    
   map.put(2,"Divya");   
   map.put(3,"Kiran");   
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  