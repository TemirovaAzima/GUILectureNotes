static <T,R> void trans(T[] s, R[] t, Function<T,R> f){
    for (int i =0; i < s.length; ++i){
        t[i] = f.apply(s[i]);
    }
}
void main(){
    String[] s = {"Cathy","Eve","Mary","Juliet"};
    Integer[] t = new Integer[s.length];
    trans(s,t,new Function<>(){
        @Override
         public Integer apply(String s){
            return s.length();
        }});
//    trans(s,t,e-> e.length());

    IO.println(Arrays.toString(t));
}