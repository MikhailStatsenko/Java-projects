package Task11;

public class Subtract extends Operation implements Operandable{
    public Subtract(Operandable firstOperation, Operandable secondOperation) {
        super(firstOperation, secondOperation);
        value.operation = "-";
    }

    @Override
    public Value getValue() {
        return value;
    }
}
