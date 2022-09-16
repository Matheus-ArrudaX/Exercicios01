import javax.swing.*;

public class Exercicio5 {
    public static void main(String[] args) {

        double B, H, A;

        B = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do retângulo: "));
        H = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retângulo: "));
        A = B * H;

        JOptionPane.showMessageDialog(null, "A área do retânuglo é: " + A);
        System.out.println("A área do retângulo é: " + A);
    }

}
