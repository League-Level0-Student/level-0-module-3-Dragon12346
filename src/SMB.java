import javax.swing.JOptionPane;

public class SMB {
	public static void main(String[] args) {
		String q = "9000";

		String m = JOptionPane.showInputDialog(null, "What is the message?");
		String g = JOptionPane.showInputDialog("What is the password?");
		if (g.equals("9000")) {
			JOptionPane.showMessageDialog(null, m);
		} else {
			JOptionPane.showMessageDialog(null, "INTRUDER!");

		}
	}

}
