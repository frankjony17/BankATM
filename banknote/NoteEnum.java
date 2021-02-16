
public enum NoteEnum {
    TWO_HUNDRED(200), ONE_HUNDRED(100), FIFTY(50), TWENTY(20), TEN(10), FIVE(5);
    private final int note;

    private NoteEnum(int note) { this.note = note; }

    public int getValue() {
        return note;
    }
}