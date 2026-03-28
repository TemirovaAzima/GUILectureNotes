package generics;

import java.util.Arrays;
import java.util.List;

public class IFacesLam {
    public static void main(String[] args){
        Operat<String> operStr = (lhs,rhs) -> lhs + rhs;
        List<Integer> listInt1 = Arrays.asList(1,2,3,4),
                      listInt2 = Arrays.asList(5,6,7,8);

        List<Integer> intRes = Tools.combine((lhs, rhs) -> lhs + rhs, listInt1,listInt2);
        System.out.println(intRes);

        List<String> listStr1 = Arrays.asList("a", "b", "c"),
                     listStr2 = Arrays.asList("1", "2", "3");
        List<String> strRes = Tools.combine(operStr,listStr1,listStr2);
        System.out.println(strRes);

        int intFold = Tools.fold1((lhs, rhs) -> lhs + rhs,intRes,0);
        System.out.println(intFold);

        String strFold = Tools.fold1((lhs,rhs)-> lhs + rhs,strRes,"");
        System.out.println(strFold);


    }
}
