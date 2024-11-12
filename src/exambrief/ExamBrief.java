/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exambrief;

/**
 *
 * @author thabo
 */
public class ExamBrief {

    
    public static void main(String[] args) 
    {
        int[][] repairAmounts = {{8000,2500,5000},{7000,2200,5600}};
        String[] techNames = {"Joe Bloggs","Jane Doe"};
        String[] months = {"JAN", "FEB", "MAR"};
        int totalAmount1 = 0;
        int totalAmount2 = 0;
        
        String highestComm = "";
        
        System.out.print("Technician Vehicle Repair Report\n");
        System.out.print("\t\t\t\t");
        
        for(int h = 0; h < months.length; h++)
        {
            System.out.print(months[h] + "\t\t");
        }
        System.out.println("\n-------------------------------------------------------------------------");
        for (int i = 0; i < repairAmounts.length; i++) 
        {
            System.out.print(techNames[i] + "\t\t\t");
            for(int j = 0; j < repairAmounts[i].length; j++)
            {
                System.out.print("R " + (double) repairAmounts[i][j] + "\t\t");
                if (i == 0) 
                {
                    totalAmount1 += repairAmounts[i][j];
                }
                if (i == 1) 
                {
                    totalAmount2 += repairAmounts[i][j];
                }
            }
            
            System.out.println();
        }
        
        System.out.println("Total vehicle repairs for " + techNames[0] + " = R " + totalAmount1);
        System.out.println("Total vehicle repairs for " + techNames[1] + " = R " + totalAmount2);
        System.out.println("Repair Commission for " + techNames[0] + " = R " + (totalAmount1 * 0.1));
        System.out.println("Repair Commission for" + techNames[1] + " = R " + (totalAmount2 * 0.1));
        
        if (totalAmount1 < totalAmount2) 
        {
            highestComm = techNames[1];
        }
        else 
        {
            highestComm = techNames[0];
        }
        
        System.out.println("Top performing vehicle repair technician: " + highestComm);
    }
    
}
