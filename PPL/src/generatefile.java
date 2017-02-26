import java.io.*;
import java.util.*;
public class generatefile {
	    void createfile(int numb,int numg){
		try{
                    FileWriter file2;
                    
                    Random gal;
                    try (FileWriter file1 = new FileWriter("boysdata1.txt")) {
                        file2 = new FileWriter("girlsdata1.txt");
                        Random boy = new Random();
                        gal = new Random();
                        for(int i=0;i<numb;i++){
                            file1.write("Boy"+(i+1)+","+boy.nextInt(10)+","+boy.nextInt(100)+","+boy.nextInt(10)+","+boy.nextInt(20)+System.lineSeparator()+System.lineSeparator());
                        }
                    }
			for(int i=0;i<numg;i++){
				file2.write("Girl"+(i+1)+","+gal.nextInt(10)+","+gal.nextInt(100)+","+gal.nextInt(10)+","+gal.nextInt(10)+System.lineSeparator()+System.lineSeparator());
			}
                        file2.close();
                     
		}catch(IOException e){		
		
                }	
            }
}