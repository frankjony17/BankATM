
public class BankNote implements Cloneable {

    private int noteType = 0;
    private int noteLimit = 100;
    private int noteCount = 100;

    public int requiredNote;

    public void setNoteType(int noteType) { this.noteType = noteType; }

    public void setNoteLimit(int noteLimit) { this.noteLimit = noteLimit; }

    public void setNoteCount(int noteCount) { this.noteCount = noteCount; }

    public int getNoteType() { return this.noteType; }

    public int getNoteLimit() { return this.noteLimit; }

    public int getNoteCount() { return this.noteCount; }

    public BankNote clone() throws CloneNotSupportedException {
        return (BankNote)super.clone();
    }
}