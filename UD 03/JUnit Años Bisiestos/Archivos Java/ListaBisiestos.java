
package UD3_Pract3_JUnit;

import java.util.ArrayList;

/**
 *
 * @author salga
 */
public class ListaBisiestos {
    private ArrayList<Integer> listaBisiestos;
    private Integer year;
    
    public ListaBisiestos (){
        this.listaBisiestos= new ArrayList<Integer>();        
    }
        
    public void addYear (Integer year){
        if(esBisiesto(year)){
            this.listaBisiestos.add(year);
            System.out.println("Año añadido con éxito:");
            System.out.println(listaBisiestos.toString());
        }
        else
            System.out.println("El año no es bisiesto y no puede añadirse.");
    }
    
    public boolean esBisiesto (Integer year){
        
        // Si el año es divisible entre 4
    if (year % 4 == 0) {

      // Si el año es un siglo
      if (year % 100 == 0) {

        // Si el año se puede dividir entre 400 entonces es bisiesto:        
        if (year % 400 == 0)
          return true;
        else
          return false;
      }
      
      // Si el año no es un siglo es bisiesto:
      else
        return true;
    }
    //Si no se cumple ninguna condición, no es bisiesto:
    else
      return false;    
  } 
}
        

    
    

