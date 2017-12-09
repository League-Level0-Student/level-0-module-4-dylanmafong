																													
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
import javax.swing.JOptionPane;
public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
	static int HL = 0;
	public static void main(String[] args) {
		String pet = JOptionPane.showInputDialog("what kind of pet do you want to buy");
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		for (int i = 0; i < 10; i++) {
		int task = JOptionPane.showOptionDialog(null, "Question", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { " cuddle", "food", " water" }, null);
		System.out.println(task);
		// 5. Use user input to call the appropriate method created in step 4.
		if (task == 1) {
			food();
		} else if (task == 2) {
			water();
		} else if (task == 0) {
			cuddle();
		}
		if(HL > 9) {
			JOptionPane.showMessageDialog(null, "your pet is happy");
		}
	}}
	// 6. If you determine the happiness level is large enough, tell the
	// user that he loves his pet and use break; to exit for loop.
	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	public static void food() {
		JOptionPane.showMessageDialog(null, "Yay");
      	 HL++;
	}
	public static void cuddle() {
		JOptionPane.showMessageDialog(null, "yes!");
		HL++;
	}
	public static void water() {
		JOptionPane.showMessageDialog(null, "Thank you");
		HL++;
	}
}