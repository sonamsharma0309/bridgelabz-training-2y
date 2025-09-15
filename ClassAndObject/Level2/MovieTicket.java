class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void bookTicket(String movie, int seat, double cost) {
        this.movieName = movie;
        this.seatNumber = seat;
        this.price = cost;
    }

    void display() {
        System.out.println("Movie: " + movieName + ", Seat: " + seatNumber + ", Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket m = new MovieTicket("", 0, 0);
        m.bookTicket("Avengers", 12, 250);
        m.display();
    }
}