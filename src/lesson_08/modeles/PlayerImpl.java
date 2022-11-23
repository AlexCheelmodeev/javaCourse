package lesson_08.modeles;

import lesson_08.interfaces.Card;
import lesson_08.interfaces.Player;

import java.util.Scanner;

public class PlayerImpl implements Player {


    //fields
    Card[] cardsOnHand = new Card[100];
    boolean inGame;



    //constructor


    @Override
    public void takeCard(Card card) {
        for (int i = 0; i < cardsOnHand.length; i++) {
            if (cardsOnHand[i] == null){
                cardsOnHand[i] = card;
                break;
            }
        }
    }



    @Override
    public int countValuesOfAllCardsOnHand() {
        int count = 0;
        for (Card c: cardsOnHand) {
            if (c != null){
            count += c.getValue();}
        }
        return count;
    }

    @Override
    public boolean needCard() {
        System.out.println("-------Ваши карты------");
        showCardsOnHands();
        System.out.println("Нужна ли вам еще карта");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.equals("да")){
            return true;
        } return false;
    }

    @Override
    public boolean isCroupier() {
        return true;
    }

    @Override
    public void showCardsOnHands() {
        for(Card card : cardsOnHand){
            if (card != null){
            card.printCard();}
        }
    }

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }




}

