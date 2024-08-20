package fr.cesi.demosimplegiuapp;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


public class ImagePanel 
{
 ImagePanel() 
 {
  try 
  {
   JFrame f = new JFrame("Ajouter une image dans JPanel");
   JPanel panel = new JPanel();
   panel.setBounds(50, 50, 250, 250);

   BufferedImage img = ImageIO.read(new File("yoda_best.png"));
   JLabel pic = new JLabel(new ImageIcon(img));
   panel.add(pic);

   f.add(panel);
   f.setSize(400, 400);
   f.setLayout(null);
   f.setVisible(true);
  } 
  catch (IOException e) {}
 }
 public static void main(String args[]) 
 {
  new ImagePanel();
 }
}
