package flyweight;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    private static BigCharFactory instance = new BigCharFactory();
    private Map<Character, BigChar> pool = new HashMap<>(); 

    private BigCharFactory() {
      pool.put('-', new BigChar('-'));
      pool.put('0', new BigChar('0'));
      pool.put('1', new BigChar('1'));
      pool.put('2', new BigChar('2'));
      pool.put('3', new BigChar('3'));
      pool.put('4', new BigChar('4'));
      pool.put('5', new BigChar('5'));
      pool.put('6', new BigChar('6'));
      pool.put('7', new BigChar('7'));
      pool.put('8', new BigChar('8'));
      pool.put('9', new BigChar('9'));
    }


    public BigChar getBigChar(char c) {
        if (pool.containsKey(c)) {
          return pool.get(c);
        }
        else {
          pool.put(c, new BigChar(c, '?'));
          return pool.get(c);
        }
    }

    static public BigCharFactory getInstance() {
      return instance;
    }
  
}
