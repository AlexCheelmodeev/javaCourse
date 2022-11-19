package lesson_08.interfaces;

import lesson_08.modeles.PlayerImpl;

public interface GameBJ {
    void addPlayerInGame(PlayerImpl player);

    void get2CardOnHand();

    void get1CardIfNeedToPlayer();

    void printWinner();
}
