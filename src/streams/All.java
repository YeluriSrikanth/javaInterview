package streams;

import java.util.HashMap;

public class All {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(12,"ss");
        map.put(13,"mm");
        map.put(14,"bb");
        map.put(15,"yy");
        map.entrySet().stream().
                filter(t->t.getValue().startsWith("m")).
                forEach(v->System.out.println(v));
    }
}
