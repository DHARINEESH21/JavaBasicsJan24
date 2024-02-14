package Jan24Assignment;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MapKeysValues {

public static void main(String[] args) {

       Map<String, Integer> MapKeys = new HashMap<>();
       MapKeys.put("Arun", 19);
       MapKeys.put("Arul", 21);
       MapKeys.put("Mathi", 22);

       Scanner input1 = new Scanner(System.in);
       System.out.print("Enter a name to check if it exists in the map: ");
       String inputKey = input1.nextLine();
       if (MapKeys.containsKey(inputKey)) {   
           int value = MapKeys.get(inputKey);
           System.out.println("Value for key '" + value);
       } else {

           System.out.println("Key" + inputKey + " not found in the map.");

       }

   }

}

