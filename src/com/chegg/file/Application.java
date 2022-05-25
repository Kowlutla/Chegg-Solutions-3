package com.chegg.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		try {
			//Create FileReader and BufferedReader Object to read file data
            FileReader reader = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            //create FileWriter Object to write data into file
            FileWriter fw=new FileWriter("output.txt");
 
            String line;
 
            //read the all data line by line
            while ((line = bufferedReader.readLine()) != null) {
            	//get the value
                double gross=Double.parseDouble(line);
                //print the all details to output file
                printInformation(gross,fw);
            }
            reader.close();
            fw.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	//Method to write details to output file
	public static void printInformation(double gross, FileWriter fw) throws IOException {
		
		double federalTax=(gross*15)/100;
		double stateTax=(gross*3.5)/100;
		double retirementPlan=(gross*5)/100;
		double healthInsurance=750;
		double netSalary=gross-federalTax-stateTax-retirementPlan-healthInsurance;
		fw.write("Grass Amount:\t\t\t"+gross+" dirhams\n");
		fw.write("Federal Income Tax:\t\t"+federalTax+" dirhams\n");
		fw.write("State Tax:\t\t\t\t"+stateTax+" dirhams\n");
		fw.write("Retirement Plan:\t\t"+retirementPlan+" dirhams\n");
		fw.write("Health Insurance:\t\t"+healthInsurance+" dirhams\n");
		fw.write("Net Salary:\t\t\t\t"+netSalary+" dirhams\n");
		fw.write("------------------------------------------------------\n");
	}

}
