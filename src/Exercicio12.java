import javax.swing.*;

public class Exercicio12 {
    public static void main(String[] args) {

        int a, b, c;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nacimento: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
        c = b - a;

        JOptionPane.showMessageDialog(null, "Sua idade é: " +c);
        System.out.println("Sua idade é: " +c);
    }

}
