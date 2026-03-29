  static <T> boolean allGood(T[] arr,Predicate<T> p){
        for(var e : arr) if (!p.test(e)) return false;
        return true;
    }

    static <T> boolean anyGood(T[] arr,Predicate<T> p){
        for (var e: arr) if(p.test(e)) return true;
        return false;
    }
void main(){
    String[] s = {"Eve","Mary","Juliet"};
    boolean a1 = allGood(s,e-> e.length() <6);
    boolean a2 = anyGood(s,e-> e.length() <6);
    IO.println("a -> " + a1 + "; a2 -> " + a2);
}
