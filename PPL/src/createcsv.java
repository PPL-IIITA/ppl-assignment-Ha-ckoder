import java.io.*;
import java.util.*;
public class createcsv {
	    void make(int nb,int ng,int ngif){
		try{
                    FileWriter girl_file;
                    int i;
                    Random girl_rand;
                    try (FileWriter boy_file = new FileWriter("boysdata1.txt")) {
                        girl_file = new FileWriter("girlsdata1.txt");
                        Random boy_rand = new Random();
                        girl_rand = new Random();
                        for(i=0;i<nb;i++){
                            boy_file.write("Boy"+(i+1)+","+boy_rand.nextInt(10)+","+boy_rand.nextInt(100)+","+boy_rand.nextInt(10)+","+boy_rand.nextInt(20)+System.lineSeparator()+System.lineSeparator());
                        }
                    }
			for(i=0;i<ng;i++){
				girl_file.write("Girl"+(i+1)+","+girl_rand.nextInt(10)+","+girl_rand.nextInt(100)+","+girl_rand.nextInt(10)+","+girl_rand.nextInt(10)+System.lineSeparator()+System.lineSeparator());
			}
                        girl_file.close();
                     
		}catch(IOException e){		
		
                }	
            }
}