import javax.swing.JOptionPane;

public class areYouHappy {
	public static void main(String[] args) {

		String q = JOptionPane.showInputDialog("Are you happy?");
		if (q.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");

		}
		if (q.equals("no")) {
			String y = JOptionPane.showInputDialog("Do you want to be happy?");

			if (y.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
			if (y.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change Something.");

			}

		}
	}
}
