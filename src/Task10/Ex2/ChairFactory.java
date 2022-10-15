package Task10.Ex2;

public class ChairFactory implements ChairAbstractFactory {
    @Override
    public MagicChair createMagicChair() {
        return new MagicChair("Пожалуйста");
    }

    @Override
    public MultifunctionalChair createMultifunctionalChair() {
        return new MultifunctionalChair("Иван");
    }

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(400);
    }
}
