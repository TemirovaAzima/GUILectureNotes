public class Closure {
    public static void main(String[] args){
        String meow = "Meow-meow";
        Dog dog = new Dog("kitty"){
            @Override
            public void voice(){
                System.out.println(name + ": " + meow);
            }
        };
        dog.voice();

    }
}
class Dog{
    protected String name;
    public Dog(String n) { name = n;}
    public void voice(){
        System.out.println(name + ": " + "bow-bow");
    }
}