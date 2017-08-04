import java.awt.*;
import javax.swing.JFrame;

public class myOwnGraphics extends Canvas{

	public void paint(Graphics graphicsVariable){
		graphicsVariable.setColor(Color.blue);
		//fillRect(xLocation, yLocation, width, height)
		graphicsVariable.drawRect(150, 150, 50, 50);
		graphicsVariable.drawRect(0, 0, 50, 50);
		graphicsVariable.fillRect(0, 150, 50, 50);
		graphicsVariable.fillRect(150, 0, 50, 50);
	}

	public static void main(String[] args){
		JFrame window = new JFrame("myOwnGraphics");
		window.setSize(200, 223);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myOwnGraphics canvas = new myOwnGraphics();
		window.add( canvas );
		window.setVisible(true);
	}
}