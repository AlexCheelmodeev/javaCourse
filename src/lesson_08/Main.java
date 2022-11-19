package lesson_08;

import lesson_08.interfaces.GameBJ;
import lesson_08.interfaces.Player;
import lesson_08.modeles.CroupierBJ;
import lesson_08.modeles.GameBJImpl;
import lesson_08.modeles.PlayerImpl;

public class Main {
    public static void main(String[] args) {
        //1. Создать класс игру, в которой будет происходить игра
        //2. Создать игроков.
        //3. Создать крупье.
        //4. Добавить игроков и крупье в игру
        //5. Добавить колоду карт
        //6. Добавим карты в колоду
        //7. Раздать каждому игроку по 2 карты на старте
        //8. Раздавать каждому игроку по 1 карте, когда они будут просить это, пока это требуется
        //9. Определить победителя


        //1. Создать класс игру, в которой будет происходить игра
        GameBJImpl gameBJ = new GameBJImpl();


        //2. Создать игроков.
        PlayerImpl player1 = new PlayerImpl();
        PlayerImpl player2 = new PlayerImpl();

        //3. Создать крупье.
        CroupierBJ croupierBJ = new CroupierBJ();


        //4. Добавить игроков и крупье в игру
        gameBJ.addPlayerInGame(player1);
        gameBJ.addPlayerInGame(player2);
        gameBJ.addPlayerInGame(croupierBJ);


        //5. Добавить колоду карт
        //6. Добавим карты в колоду
        //7. Раздать каждому игроку по 2 карты на старте
        gameBJ.get2CardOnHand();

        //8. Раздавать каждому игроку по 1 карте, когда они будут просить это, пока это требуется
        gameBJ.get1CardIfNeedToPlayer();


        //9. Определить победителя
        gameBJ.printWinner();

    }

}
