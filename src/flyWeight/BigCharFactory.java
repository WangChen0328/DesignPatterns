package flyWeight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wangchen
 * @date 2018/5/25 14:45
 */
public class BigCharFactory {

    private Map<Character, BigChar> pool = new ConcurrentHashMap<>();

    private static volatile BigCharFactory factory;

    private static Object obj;


    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        if (factory == null) {
            synchronized (BigCharFactory.class) {
                if (factory == null) {
                    factory = new BigCharFactory();
                }
            }
        }
        return factory;
    }

    public BigChar getBigChar(char charName) {
        /**
         * 由于 ConcurrentHashMap 中存储的Key 为 volatile 每次必为最新
         */
        BigChar bigChar = pool.get(charName);
        if (bigChar == null) {
            synchronized (obj) {
                if (bigChar == null) {
                    bigChar = new BigChar(charName);
                    pool.put(charName, bigChar);
                }
            }
        }
        return bigChar;
    }
}
