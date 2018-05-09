package adapter.objectAdapter;

/**
 * @author wangchen
 * @date 2018/5/9 13:44
 */
public class Main {
    public static void main(String[] args){
        Print print = new PrintBanner("hello");
        print.printWeak();
        print.printStrong();
    }
}
