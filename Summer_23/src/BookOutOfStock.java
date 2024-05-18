public class BookOutOfStock extends Exception{
    public BookOutOfStock() {
        super("[BookOutOfStockException] The value of numberOfAvailableCopies is 0.");
    }
}
