public class BoxNotFullException extends Exception {
    public BoxNotFullException(int empty) {
        super("Магическая коробка еще не заполнена! Осталось ячеек: " + empty);
    }
}