import java.io.*;
import java.util.*;

class UserMainCode{
    public int nonRepeatDigitsCount(int input1){
        HashMap<Character, Boolean> map = new HashMap<>();
        int count = 0;
        char[] str = Integer.toString(input1).toCharArray();
        for( char i: str){
            if(map.put(i, true) != null){
                map.put(i, false);    // can use replace method as well if compiled in Java 8 or above.
            }
        }
        Set<Map.Entry<Character, Boolean>> set = map.entrySet();
        for(Map.Entry<Character, Boolean> i:set){
            if(i.getValue() == true){
                count++;
            }
        }
        return count;
    }
}
