package lesson_08.modeles;

import lesson_08.interfaces.GameBJ;
import lesson_08.interfaces.Player;
import lesson_08.modeles.PlayerImpl;

public class GameBJImpl implements GameBJ {

    PlayerImpl [] playersInGame = new PlayerImpl[3];
    DeckOfCardsImpl deckOfCards = new DeckOfCardsImpl();


    @Override
    public void addPlayerInGame(PlayerImpl player) {
        for (int i = 0; i < playersInGame.length; i++) {
            if(playersInGame[i] == null){
                playersInGame[i] = player;
                break;
            }
        }
    }

    @Override
    public void get2CardOnHand() {
        for (int i = 0; i < playersInGame.length; i++) {
            if(playersInGame[i] != null){
                playersInGame[i].takeCard(deckOfCards.randomCards());
                playersInGame[i].takeCard(deckOfCards.randomCards());

            }
        }
    }

    @Override
    public void get1CardIfNeedToPlayer() {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] != null){
                while (playersInGame[i].needCard()){
                    playersInGame[i].takeCard(deckOfCards.randomCards());
                }
            }
        }
    }

    @Override
    public void printWinner() {
        // 1 Проход по всему массиву игроков в игре и выключение всех игроков у кого больше 21
        for (PlayerImpl player: playersInGame) {
            if (player != null){
                if (player.countValuesOfAllCardsOnHand() > 21){
                    player.setInGame(false);
                }
            }
        }

        // 2 Если в игре осталься 1 игрок
        if(countPlayersInGame() == 1){
            for (PlayerImpl player:playersInGame) {
                System.out.println("Победил игрок :" + player.getNameOfPlayer());
                if (player != null && player.isInGame()){
                    player.showCardsOnHands();
                }
            }
        }
        //3. Выбрать 1 победителя с лучшим значением на руках
        int bestValue = 0;
        for (PlayerImpl player:playersInGame) {
            if (player != null && player.isInGame()){
                if (bestValue < player.countValuesOfAllCardsOnHand()){
                    bestValue = player.countValuesOfAllCardsOnHand();
                }
            }
        }

        for (PlayerImpl player:playersInGame) {
            if (player != null && player.isInGame()){
                System.out.println("Победил игрок :" + player.getNameOfPlayer());
                player.showCardsOnHands();
            }
        }
    }

    public int countPlayersInGame() {
        int countPlayers = 0;
        for (PlayerImpl player:playersInGame) {
            if (player != null && player.isInGame()){
                countPlayers++;
            }
        }
        return countPlayers;
    }
}


