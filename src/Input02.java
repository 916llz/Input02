import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "não precisa digitar nada aqui, é apenas uma mensagem",
                "Titulo",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "isso é uma pergunta ?",
                "titulo dialogado",
                2,
                null,
                null,
                "poe algo aqui");
        
        
        String[] acceptableValues = {"Flakes", "Derp", "Nathes"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "isso é uma pergunta?",
                "titulo dialogado",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
