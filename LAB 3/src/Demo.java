public class Demo {
    public static void main(String args[]) {
//        Deck deck=new Deck();
//        deck.shuffle();
//        System.out.println();
//        deck.displayDecks();

        String names[] = {"Atiqa", "Tehreem", "Ayesha"};

        Game game = new Game(names);

        game.playGame();
    }
}

