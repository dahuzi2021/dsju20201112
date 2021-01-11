import java.util.ArrayList;
import java.util.List;

public class Listtest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hahah");
        list.add("xixixi");
        list.add("华哈呼呼");
        list.add(1);
        list.add(1);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
