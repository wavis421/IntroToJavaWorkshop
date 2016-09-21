
import java.net.URI;

import javax.swing.JOptionPane;


public class variables_2 {

    public static void main(String[] args) {

        // 1. Ask the user how many cats they have
    	String numCatsStr = JOptionPane.showInputDialog("How many cats do you have?");


        // 2. Convert their answer into an int
    	int numCats = Integer.parseInt(numCatsStr);


        // 3. If they have more than 3 cats, tell them they're a crazy cat lady
    	if (numCats > 3)
    		JOptionPane.showMessageDialog(null, "You're one crazy lady!");


        // 4. If they have 3 or less, call the method below to show them a cat video
    	else if (numCats > 0)
    		playVideo ("https://youtu.be/q1dpQKntj_w");

    	else if (numCats == 0)
    		playVideo ("https://www.youtube.com/watch?feature=player_embedded&v=SKRgktzRvZ0");
    		
        // 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human

        

    }


    static void playVideo(String videoURL) {

        try {

            URI uri = new URI(videoURL);

            java.awt.Desktop.getDesktop().browse(uri);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }


}
