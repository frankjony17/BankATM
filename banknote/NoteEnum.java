
public enum NoteEnum {
    TWO(2), FIVE(5), TEN(10), TWENTY(20), FIFTY(50), ONE_HUNDRED(100), TWO_HUNDRED(200);

    private final int note;

    private NoteEnum(int note) { this.note = note; }

    public int getValue() {
        return note;
    }
}