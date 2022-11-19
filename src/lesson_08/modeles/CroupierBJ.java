package lesson_08.modeles;

public class CroupierBJ extends PlayerImpl{
    @Override
    public boolean needCard() {
        return countValuesOfAllCardsOnHand() < 17;
    }

    @Override
    public boolean isCroupier() {
        return true;
    }
}
