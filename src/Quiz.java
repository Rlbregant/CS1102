import javax.swing.JOptionPane;

public class Quiz {
    public static void main(String[] args) {
        String question = "What was Nedrys password in Jurassic Park?\n"; // The question
        question += "A. red_hat\n"; //The options
        question += "B. blk_rbt\n";
        question += "C. whte_rbt\n";
        question += "D. green_hat\n";
        question += "E. dino_saur\n";

        String answer = null; // The answer set to null to avoid null pointer exceptions
        while (answer == null || !answer.equals("C")) { // While the answer is null or not equal to C
            answer = JOptionPane.showInputDialog(question); // Ask the question
            if (answer == null) { // If the answer is null
                JOptionPane.showMessageDialog(null, "No answer given. Please enter an answer."); // Tell the user to enter an answer
            } else  { // If the answer is not null
                answer = answer.toUpperCase(); // Convert the answer to uppercase
                if (!answer.equals("A") && !answer.equals("B") && !answer.equals("C") && !answer.equals("D") && !answer.equals("E")) { // If the answer is not valid
                    JOptionPane.showMessageDialog(null, "Invalid answer. Please enter a valid option (A, B, C, D or E)."); // Tell the user to enter a valid answer
                    answer = null; // Set the answer to null to avoid null pointer exceptions
                } else if (!answer.equals("C")) { // If the answer is not C
                    JOptionPane.showMessageDialog(null, "Ah ah ah, you didn't say the magic word!"); // Tell the user to enter the magic word
                }
            }
        }
        JOptionPane.showMessageDialog(null, "You got it!"); // Tell the user they got it!
    }
}