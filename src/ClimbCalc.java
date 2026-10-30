import java.util.HashMap;
import java.util.Map;

public class ClimbCalc {

    private Map<Integer, Integer> map = new HashMap<>();

    public ClimbCalc(int n){
        int stair = StairRecursao(n);
        System.out.printf("\nPara chegar ao degrau %d existem %d possibilidades\n",n, stair);
    }

    private int StairRecursao(int n){

        if(map.containsKey(n)){
            return map.get(n);
        }

        if(n<=2){
            return n;
        }

        int result = StairRecursao(n-1)+StairRecursao(n-2);

        map.put(n,result);

        return result;
    }
}
