package Task11;

public class Const implements Operandable{
    private double val;

    public Const(double val) {
        this.val = val;
    }

    @Override
    public Value getValue() {
        return new Value(val, Value.ValueType.CONST);
    }
}
