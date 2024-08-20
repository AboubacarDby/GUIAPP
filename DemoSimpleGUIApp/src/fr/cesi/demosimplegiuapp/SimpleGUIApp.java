package fr.cesi.demosimplegiuapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SimpleGUIApp {

	public static void main(String[] args) {
		//créer la fenêtre principal
		
		JFrame frame = new JFrame("Application simple GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,300);
		
		//créer un panneau pour ajouter des composants
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		//créer un bouton simple
		JButton button = new JButton("Affichez l'image");
		panel.add(button);
		
		try {
			BufferedImage img = ImageIO.read(new File ("yoda_best.png"));
			JLabel pic = new JLabel();
			panel.add(pic);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ajouter un écouteur d'évènements
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//afficher le message quand je clique sur le bouton
				JOptionPane.showMessageDialog(frame, "Vous avez cliquez sur le boutton");
			}
		});
		
		//rendre visible la fenêtre
		frame.setVisible(true);
	}

}
