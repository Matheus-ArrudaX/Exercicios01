import javax.swing.*;

public class Exercicio8 {
    public static void main(String[] args) {

        double a, b, c;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância percorrida em KM: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de gasolina gasta: "));
        c = b/a;

        JOptionPane.showMessageDialog(null, "Seu carro gasta: " +c+ "litros de gasolina por quilômetro");
        System.out.println("Seu carro gasta: " +c+ "litros de gasolina por quilômetro");
    }

}
