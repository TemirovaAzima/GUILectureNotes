public class AddAndMult implements BiIntOperator{
    int seed;

    AddAndMult(int seed) {this.seed = seed;}
    AddAndMult() {this(1);}
    @Override
    public int apply(int i, int j) {
        return seed * (i + j);
    }
}
