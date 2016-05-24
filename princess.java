import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class princess {
static void displayPathtoPrincess(int n, String [] grid){
    int rp=0;
    int plocation=0;
    int rm=0;
    int mlocation=0;
    for(int i=0; i<grid.length; i++){
        
        //find princess in grid
        if(grid[i].contains("p")){
                rp=i; 
                plocation = grid[rp].indexOf('p');
        }

        //find machine in grid
        if(grid[i].contains("m")){
                rm=i; 
                mlocation = grid[rm].indexOf('m');
        }
    }
 
//change Location of machine
   while(rp!=rm){
        //change vertical location
        if(rp<rm){
            System.out.println("UP");
            rm=rm-1;
        }
        else if(rp>rm){
            System.out.println("DOWN");
            rm=rm+1;
        }
    }

    while(plocation!=mlocation){
       //change horizontal location
        if(plocation<mlocation){
            System.out.println("LEFT");
            mlocation=mlocation-1;
        }
        else if(plocation>mlocation){
            System.out.println("RIGHT");
            mlocation=mlocation+1;
        }
    }

  }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

    displayPathtoPrincess(m,grid);
    }
    
}
