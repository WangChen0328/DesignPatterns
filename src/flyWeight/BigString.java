package flyWeight;

/**
 * @author wangchen
 * @date 2018/5/25 15:06
 */
public class BigString {
    private BigChar[] bigChars;

    public BigString(String string) {
        this.bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
