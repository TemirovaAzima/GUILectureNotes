public class MultAndAdd implements BiIntOperator{
    int seed;
    MultAndAdd(int seed) {this.seed = seed;}
    MultAndAdd() {this(1);}

    @Override
    public int apply(int i, int j) {
        return seed + i*j;
    }
}
