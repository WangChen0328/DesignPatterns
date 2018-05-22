package chainOfResponsibility;

/**
 * @author wangchen
 * @date 2018/5/22 15:06
 */
public class Main {
    public static void main(String[] args){
        Support no = new NoSupport("no");
        Support limit = new LimitSupport("limit");

        no.setNext(limit);

        no.support(new Trouble(1));

    }
}
