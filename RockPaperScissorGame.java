package rockpaparscissor;


import java.util.Scanner;

public class RockPaperScissorGame {

    public static void main(String[] args){

        GameController gameController = new RockPaperScissorsGameController();

        Scanner scanner = new Scanner(System.in);
        String userWantsToExit;




Loader loader = new Loader('*');



        System.out.print(gameController.welcomeMessage());

        do {
            System.out.println(gameController.pleaseEnterOptionMessage());

            int userOptionRaw = scanner.nextInt();

            GameOption userOption = GameOption.valueOf(userOptionRaw);

            gameController.selectUserChoice(userOption);

            GameOption machineChoice = gameController.randomMachineChoice();

            Player winner = gameController.calculateResult();

            Score score = new Score();
            gameController.getResults();

            System.out.printf("You played: %s and the machine played: %s \n", userOption.name(), machineChoice.name());
            if (Player.USER.equals(winner)) {
                System.out.println("You won!!");
            }
            if(Player.TIE.equals(winner)){
                System.out.println("Tie!!");
            }
            System.out.printf("You won %d games out of %d \n", (score.getGamesWonByUser() + 1), (score.totalNumberOfGames() + 1));
            System.out.println("Continue playing(Y=Yes, N=No)?");
            userWantsToExit = scanner.next();
            if (userWantsToExit.toUpperCase().equals("N")){
                System.exit(0);
            }

        }
        while(userWantsToExit.toUpperCase().equals("Y") );


    }
}



