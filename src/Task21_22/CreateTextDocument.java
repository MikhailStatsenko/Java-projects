package Task21_22;

public class CreateTextDocument implements ICreateDocument{
    @Override
    public IDocument createNew() {
        System.out.println("Creating new text document");
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        System.out.println("Opening new text document");
        return new TextDocument();
    }
}
