/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sowji
 */
public class generateGirl {
   
	String name,bf;
	int attractiveness,iq,criterion;
	double maintainance;
	boolean committed;

	generateGirl(String str[]) {	
		maintainance = Double.parseDouble(str[3]);
                criterion = Integer.parseInt(str[4]);
		
		iq = Integer.parseInt(str[4]);
                name = str[0];
                bf = "";
	
		attractiveness = Integer.parseInt(str[2]);
		
		committed = false;		
		}

	
}
    

