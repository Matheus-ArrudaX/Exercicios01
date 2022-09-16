import javax.swing.*;

public class Exercicio3 {
    public static void main(String[] args) {

        double a, b, c;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário atual"));
        b = a/4;
        c = a + b;

    JOptionPane.showMessageDialog(null, "Seu novo salário é: " + c);
    System.out.println("Seu novo salário é: " + c);
    }


}
