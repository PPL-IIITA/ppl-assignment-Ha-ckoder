/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sowji
 */
public class generateboy {
    
	int criterion,iq,attractiveness;
	double budget;
        String name, gf;
	boolean committed;

	generateboy(String str[]) {
            
		gf = "";
		name = str[0];
		budget = Integer.parseInt(str[2]);
		iq = Integer.parseInt(str[3]);
		attractiveness = Integer.parseInt(str[1]);
                criterion = Integer.parseInt(str[4]);
		committed = false;
	}

	
}

    

