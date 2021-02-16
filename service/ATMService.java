import java.util.ArrayList;

public class ATMService {

  private int cash;
  private ArrayList<BankNote> bankNotes = new ArrayList<>();

  public ATMService(int cash) { this.cash = cash; }

  public void getTotalNote(BankNote bankNote) {
    int remainingMoney = this.cash;

    if(bankNote != null && this.cash >= bankNote.getNoteType()) {
      bankNote.requiredNote = this.cash / bankNote.getNoteType();
      remainingMoney = this.cash % bankNote.getNoteType();

      if (remainingMoney == 1 || remainingMoney == 3) {
        bankNote.requiredNote -= 1;
        remainingMoney += bankNote.getNoteType();
      }
      this.hasNote(bankNote, remainingMoney);
    }
  }

  private void hasNote(BankNote bankNote, int remainingMoney) {
    if (bankNote.requiredNote > 0) {
      if (bankNote.getNoteCount() >= bankNote.requiredNote) {
        bankNote.setNoteCount(bankNote.getNoteCount() - bankNote.requiredNote);
      }
      else {
        remainingMoney += bankNote.getNoteType() * (bankNote.requiredNote - bankNote.getNoteCount());
        bankNote.requiredNote = bankNote.getNoteCount();
      }
      this.bankNotes.add(bankNote);
    }
    this.cash = remainingMoney;
  }

  public void printCash() {
    if (this.cash == 0) {
      System.out.println("O valor do saque pode ser expresso em: ");

      for (BankNote note : this.bankNotes) {
        System.out.printf("%d notas de %d\n", note.requiredNote, note.getNoteType());
      }
    }
    else {
      System.out.printf("A caixa não tem dinheiro suficiente para o serviço solicitado!!!");
    }
  }
}