import java.awt.*;
import javax.swing.JFrame;

public class circleProgram extends Canvas{
	public void paint(Graphics g){
		g.setColor(Color.yellow);
		g.fillOval(0, 0, 200, 200);
		g.setColor(Color.blue);
		g.fillOval(50, 50, 30, 30);
		g.fillOval(140, 50, 30, 30);
		g.setColor(Color.red);
		g.drawArc(60, 50, 100, 100, 200, 145);
	}

	public static void main(String[] args){
		JFrame win = new JFrame("circleProgram");
		win.setSize(500, 500);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		circleProgram canvas = new circleProgram();
		win.add(canvas);
		win.setVisible(true);
	}
}