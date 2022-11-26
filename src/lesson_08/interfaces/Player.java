package lesson_08.interfaces;

public interface Player {
    void takeCard(Card card);
    int countValuesOfAllCardsOnHand();
    boolean needCard();

    boolean isCroupier();

    void showCardsOnHands();



}
