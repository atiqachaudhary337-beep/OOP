public class Demo {

    public static void main(String[] args) {

        Company company = new Company("VisionMovies",2);

        Branch branch1 = new Branch("SilverScreen","Faisalabad","D Ground",3);
        Branch branch2 = new Branch("RoyalCinema","Rawalpindi","Saddar",2);

        Movie movie1 = new Movie("DarkHorizon","Thriller",155,"5:45 PM");
        Movie movie2 = new Movie("SteelWarrior","Action",168,"8:30 PM");
        Movie movie3 = new Movie("GalaxyMission","SCIFI",160,"11:15 PM");

        Screen screen1 = new Screen("Screen 1","IMAX",5,5);
        Screen screen2 = new Screen("Screen 2","3D",5,5);
        Screen screen3 = new Screen("Screen 3","IMAX",5,5);

        screen1.setMovie(movie1);
        screen2.setMovie(movie2);
        screen3.setMovie(movie3);

        branch1.addScreen(0,screen1);
        branch1.addScreen(1,screen2);
        branch2.addScreen(0,screen3);

        company.addBranch(0,branch1);
        company.addBranch(1,branch2);

        company.displayCompany();

        screen1.displaySeats();
        screen1.selectSeat();

        screen2.displaySeats();
        screen2.selectSeat();

        screen3.displaySeats();
        screen3.selectSeat();
    }
}