import javax.swing.JOptionPane;
public class Quiz {
    public static void main(String[] args) {
        String question = "What was Nedry's password in Jurassic Park?\n";
        question += "A. red_hat\n";
        question += "B. blk_rbt\n";
        question += "C. whte_rbt\n";
        question += "D. green_hat\n";
        question += "E. dino_saur\n";
        String answer = JOptionPane.showInputDialog(question);
        while (!answer.equals("C")) {
            JOptionPane.showMessageDialog(null, "Ah ah ah, you didn't say the magic word!");
            answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
        }
        JOptionPane.showMessageDialog(null, "You got it!");
    }
}
