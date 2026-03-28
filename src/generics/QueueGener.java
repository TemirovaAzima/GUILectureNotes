package generics;

public class QueueGener {

    public static void main (String[] args){
    Myqueue<String> queueS = new Myqueue<>();
    Myqueue<Double> queueD = new Myqueue<>();

    for(double d = 0.5; d < 5; d +=1){
        queueS.enqueue(String.valueOf(d));
        queueD.enqueue(d);
    }
    while(!queueS.empty() && !queueD.empty()){
        String s = queueS.dequeue();
        double d = queueD.dequeue();
        System.out.println("String" + s + " " +
                "Double" + d);
    }
    String i= String.valueOf(8);
        System.out.println(String.valueOf(7));
}
}
