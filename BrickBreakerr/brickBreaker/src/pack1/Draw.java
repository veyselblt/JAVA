package pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;

public class Draw extends JLabel {
	


	protected void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.setColor(Color.CYAN);
		for(int i=0;i<=30;i++){
			
			g.fillRect(Label.sizeWidthScreenValue/2-5, i*20, 10, 10);		
		}
		g.setColor(Color.WHITE);
		g.fillRect(Label.bordX, Label.bordY, 25, 150);
		g.setColor(Color.RED);
		g.fillRect(Label.du�manX, Label.du�manY, 25, 150);
		g.fillOval(Label.ballX, Label.ballY, 25, 25);
		
		g.setFont(new Font("Arial", Font.BOLD,50));
		g.setColor(Color.WHITE);
		g.drawString("" + Label.benimPuan�m, Label.sizeWidthScreenValue/2 -95 , 60);
		g.setColor(Color.RED);
		g.drawString("" + Label.du�manPuan�, Label.sizeWidthScreenValue/2 +70 , 60);
		
		repaint();
	}

}
