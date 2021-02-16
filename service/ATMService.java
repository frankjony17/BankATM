import java.util.ArrayList;

public class ATMService {

  private int cash;
  public ArrayList<BankNote> bankNotes = new ArrayList<>();

  public ATMService(int cash) { this.cash = cash; }

  public void getTotalNote(BankNote bankNote) {
    int remainingMoney = this.cash;

        if(this.cash > 0 && bankNote != null && this.cash >= bankNote.getNoteType()) {
            bankNote.requiredNote = this.cash / bankNote.getNoteType();
            remainingMoney = this.cash % bankNote.getNoteType();

            if (remainingMoney == 1 || remainingMoney == 3) {
                bankNote.requiredNote -= 1;
                remainingMoney += bankNote.getNoteType();
            }
            if (bankNote.requiredNote > 0) {
                bankNotes.add(bankNote);
            }
        }
        this.cash = remainingMoney;
  }
}