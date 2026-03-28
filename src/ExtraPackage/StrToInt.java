package ExtraPackage;

public class StrToInt implements Transform<String, Integer> {
    @Override
    public Integer apply(String st){
        return st.length();
    }
}
