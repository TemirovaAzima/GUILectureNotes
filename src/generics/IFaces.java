package generics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IFaces {
    public static void main(String[] args) {
        // Integer operation: Addition
        Operat<Integer> operInt = new Operat<Integer>() {
            @Override
            public Integer oper(Integer lhs, Integer rhs) {
                return lhs + rhs;
            }
        };

        // String operation: Concatenation
        Operat<String> operStr = new Operat<String>() {
            @Override
            public String oper(String lhs, String rhs) {
                return lhs + rhs;
            }
        };

        // Integer combining and folding
        List<Integer> listInt1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> listInt2 = Arrays.asList(5, 6, 7, 8);
        List<Integer> intRes = Tools.combine(operInt, listInt1, listInt2);
        System.out.println("intRes = " + intRes);

        int intFold = Tools.fold1(operInt, intRes, 0);
        System.out.println("intFold = " + intFold);

        // String combining and folding
        List<String> listStr1 = Arrays.asList("a", "b", "c");
        List<String> listStr2 = Arrays.asList("1", "2", "3");
        List<String> strRes = Tools.combine(operStr, listStr1, listStr2);
        System.out.println("strRes = " + strRes);

        String strFold = Tools.fold1(operStr, strRes, "");
        System.out.println("strFold = " + strFold);
    }
}
