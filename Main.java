import java.util.EnumSet;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
    System.out.println("Hello Client");

    BankNote note2Reais = new BankNote();
    note2Reais.setNoteType(2);
    note2Reais.setNoteLimit(100);
    note2Reais.setNoteCount(100);

    Scanner input = new Scanner(System.in);
    System.out.print("Informe o valor do saque (valor inteiro): ");

    ATMService atmService = new ATMService(Integer.parseInt(input.nextLine()));
    input.close();

    for (NoteEnum note : NoteEnum.values()) {
      BankNote noteXReais = note2Reais.clone();
      noteXReais.setNoteType(note.getValue());
      atmService.getTotalNote(noteXReais);
    }
    atmService.getTotalNote(note2Reais);

    atmService.printCash();
  }
}