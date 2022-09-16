import javax.swing.*;

public class Exercicio2 {
    public static void main(String[] args) {

        double p1, p2, p3, M;

        p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota p1: "));
        p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota p2: "));
        p3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota p3: "));
        M = (p1*3 + p2*3 + p3 *4)/10;

        JOptionPane.showMessageDialog(null, "Sua média foi: " + M);
        System.out.println("Sua média foi: " + M);
    }

}
