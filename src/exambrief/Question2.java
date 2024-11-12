/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exambrief;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author thabo
 */
public class Question2 {
    static String[] LOCATIONS = {"Cape Town" , "Durban", "Pretoria"}; 
    static File app = new File("report.txt");
    
    public static void main(String[] args) 
    {
        JFrame win = new JFrame("TECHNICIAN");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(400, 300);
        win.setLayout(new GridLayout(5, 2));
        
        JPanel namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT)); 
        JPanel locationPnl = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        JPanel ratePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel displayPnl = new JPanel();
        displayPnl.setLayout(new BoxLayout(displayPnl, BoxLayout.Y_AXIS));
        displayPnl.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JPanel repairPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        JLabel techLocLbl = new JLabel("TECHNICIAN LOCATION: ");
        JLabel techNameLbl = new JLabel("TECHNICIAN NAME: ");
        JLabel repairCostLbl = new JLabel("REPAIR COST: ");
        JLabel techRateLbl = new JLabel("TECHNICIAN RATE: ");
        JLabel techReportLbl = new JLabel("TECHNICIAN REPORT: ");
        
        JTextField techNameTxt = new JTextField(20);
        JTextField repairCostTxt = new JTextField(20);
        JTextField techRateTxt = new JTextField(20);
        
        JTextArea techReportArea = new JTextArea(20, 20);
        techReportArea.setEditable(false);
        
        JComboBox<String> techLocCBox = new JComboBox<>(LOCATIONS);
        
        JMenuBar menuBar = new JMenuBar();
        
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> 
        {
            System.exit(0);
        });
        fileMenu.add(exitItem);
        //saveItem
        JMenu toolsMenu = new JMenu("Tools");
        JMenuItem processItem = new JMenuItem("Process Report");
        JMenuItem clearItem = new JMenuItem("Clear");
        JMenuItem saveItem = new JMenuItem("Save Report");
        processItem.addActionListener(e->
        {
            String techName = techNameTxt.getText();
            String techRate = techRateTxt.getText();
            String repairCosts = repairCostTxt.getText();
            String techLoc = (String) techLocCBox.getSelectedItem();
            
            int repairCost = Integer.parseInt(repairCosts);
            int techRateInt = Integer.parseInt(techRate);
            
            double calcPay = repairCost * (techRateInt / 100.0);
            
            System.out.println(repairCosts);
            System.out.println(repairCost);
            System.out.println(techRateInt);
            System.out.println(techRateInt / 100.0);
            System.out.println(calcPay);
            String displayText = "TECHNICIAN LOCATION: " + techLoc + "\n"
                    + "TECHNICIAN NAME: " + techName + "\n"
                    + "REPAIR COST: R" + repairCosts + "\n"
                    + "TECHNICIAN RATE: " + techRate + "% \n"
                    + "CALCULATED PAY: R" + calcPay + "\n";
           
            techReportArea.setText(displayText);
        });
        saveItem.addActionListener(e->
        {
            String techName = techNameTxt.getText();
            String techRate = techRateTxt.getText();
            String repairCosts = repairCostTxt.getText();
            String techLoc = (String) techLocCBox.getSelectedItem();
            
            int repairCost = Integer.parseInt(repairCosts);
            int techRateInt = Integer.parseInt(techRate);
            
            double calcPay = repairCost * (techRateInt / 100);
            System.out.println(calcPay);
            String displayText = "TECHNICIAN LOCATION: " + techLoc + "\n"
                    + "TECHNICIAN NAME: " + techName + "\n"
                    + "REPAIR COST: R" + repairCosts + "\n"
                    + "TECHNICIAN RATE: " + techRate + "% \n"
                    + "CALCULATED PAY: R" + calcPay + "\n";
            
            try 
            {
                FileWriter app1 = new FileWriter("report.txt", true);
                if(app.createNewFile()) 
                {
                    System.out.println("File created: " + app.getName());
                } 
                else 
                {
                    System.out.println("Already created.");
                }
                app1.append(displayText);
                app1.close();
        
                System.out.println("Data saved to file.");
            }
            catch(IOException err) 
            {
                err.printStackTrace();
            }
        });
        clearItem.addActionListener(e->
        {
            techNameTxt.setText("");
            repairCostTxt.setText("");
            techRateTxt.setText("");
            techLocCBox.setSelectedIndex(0);
            techReportArea.setText("");
        });
        toolsMenu.add(processItem);
        toolsMenu.add(clearItem);
        toolsMenu.add(saveItem);
        menuBar.add(fileMenu);
        menuBar.add(toolsMenu);
        
        win.setJMenuBar(menuBar);
        
        namePnl.add(techNameLbl);
        namePnl.add(techNameTxt);
        locationPnl.add(techLocLbl);
        locationPnl.add(techLocCBox);
        ratePnl.add(techRateLbl);
        ratePnl.add(techRateTxt);
        displayPnl.add(techReportLbl);
        displayPnl.add(techReportArea);
        repairPnl.add(repairCostLbl);
        repairPnl.add(repairCostTxt);
        
        win.add(locationPnl);
        win.add(namePnl);
        win.add(repairPnl);
        win.add(ratePnl);
        win.add(displayPnl);
        
        win.setVisible(true);
    }
}
