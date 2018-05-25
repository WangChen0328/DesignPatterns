package flyWeight;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author wangchen
 * @date 2018/5/25 14:34
 */
public class BigChar {
    private char charName;
    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("big" + charName + ".txt"));
            String line;
            StringBuffer buffer = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
                buffer.append("\n");
            }
            reader.close();
            this.fontData = buffer.toString();
        } catch (Exception e) {
            this.fontData = charName + "?";
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println(fontData);
    }
}
