package Task11;

public class Multiply extends Operation implements Operandable {
    public Multiply(Operandable firstOperation, Operandable secondOperation) {
        super(firstOperation, secondOperation);
        value.operation = "*";
    }

    @Override
    public Value getValue() {
        return value;
    }
}
