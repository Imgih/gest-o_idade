
import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class AgeClassifier {

    private static Scanner in = new Scanner(System.in); // Inicializa um Scanner para ler a entrada do usuário
    private int childCount;
    private int youngCount;
    private int middleAgeCount;
    private int oldCount;

    // Método para classificar a idade com base em faixas etárias
    public void classifyAge(int age) {
        if ((1 <= age) && (age <= 12)) {
            childCount++;
        } else if ((13 <= age) && (age <= 30)) {
            youngCount++;
        } else if ((31 <= age) && (age <= 49)) {
            middleAgeCount++;
        } else if (age >= 60) {
            oldCount++;
        }
    }

    // Método para exibir a classificação final
    public void printClassification() {
        System.out.println("Here is the classification:");
        System.out.println("There are " + childCount + " children.");
        System.out.println("There are " + youngCount + " young people.");
        System.out.println("There are " + middleAgeCount + " middle age people.");
        System.out.println("There are " + oldCount + " old people.");
    }

    public static void main(String[] args) {
        AgeClassifier classifier = new AgeClassifier(); // Instancia a classe AgeClassifier

        System.out.println("This program classifies people based on their ages.");
        System.out.println("Here are the ranges:");
        System.out.println(" 1-12 : Child \n 13-30: Young \n 31-49: Middle age \n 60-  : Old \n");

        // Loop para entrada contínua de idades até o usuário inserir um valor inválido
        while (true) {
            System.out.println("Please enter the age:");
            int age = in.nextInt(); // Lê a idade inserida pelo usuário
            if (age <= 0 || age > 120) { // Verifica se a idade está fora dos limites permitidos
                System.out.println("Are you kidding me?");
                break;
            }

            classifier.classifyAge(age); // Chama o método para classificar a idade
        }

        classifier.printClassification(); // Exibe a classificação final com base nas idades inseridas
    }
}
