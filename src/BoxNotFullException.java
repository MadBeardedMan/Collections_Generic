public class BoxNotFullException extends Exception {
    public BoxNotFullException(int empty) {
        super("���������� ������� ��� �� ���������! �������� �����: " + empty);
    }
}