import javax.swing.*;

public class Exercicio6 {
    public static void main(String[] args) {

        double B, H, A;

        B = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo: "));
        H = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
        A = (B * H)/2;

        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + A);
        System.out.println("A área do triângulo é: " +A);
    }

}
