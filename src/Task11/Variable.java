package Task11;

public class Variable implements Operandable {
    private String name;

    Variable(String name) {
        this.name = name;
    }

    @Override
    public Value getValue() {
        return new Value(name, Value.ValueType.VAR);
    }
}
