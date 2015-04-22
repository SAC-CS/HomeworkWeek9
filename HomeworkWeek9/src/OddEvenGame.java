//import javax.swing.JOptionPane;

public class OddEvenGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiceSolution diceGame = new DiceSolution();
		//calling static method without initialize.
		
		//RandomOddEven  oddEven = new RandomOddEven();
		
		DiceSolution.Welcome();
		do
		{
			DiceSolution.UserSelection();
			diceGame.DiceStratergy();					
		}while(DiceSolution.ExitGame().equalsIgnoreCase("yes"));			
		
		diceGame.GameReport();
	}

}
// Good job.
