import java.util.EnumSet;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
    System.out.println("Hello Client");

    BankNote note2Reais = new BankNote();
    note2Reais.setNoteType(2);
    note2Reais.setNoteLimit(100);
    note2Reais.setNoteCount(100);

    EnumSet.allOf(NoteEnum.class).forEach(
      note -> 
    );

    for (int note : NoteEnum.get) {

    }

    BankNote note5Reais = note2Reais.clone();
    note5Reais.setNoteType(5);


    Scanner input = new Scanner(System.in);
    System.out.print("Informe o valor do saque (valor inteiro): ");

    ATMService atmService = new ATMService(Integer.parseInt(input.nextLine()));
    atmService.getTotalNote(note2Reais);

  }
}