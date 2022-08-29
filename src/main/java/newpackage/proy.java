
package newpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class proy {
    
    public static void main(String[] args) {
       
//        List miLista = new ArrayList(); //al no especificar tipo, lo pone object
//        miLista.add(3);
//        miLista.add("Robyn");
//        miLista.add(55.58);
//        imprimir(miLista);
 
      
      
       
 
    
        List<ClsVendedores> misEmp= new ArrayList();
        
        ClsVendedores ven= new ClsVendedores();
        
        ven.setNombre("Ericson");
        ven.setEnero(ram());
        ven.setFebrero(ram());
        ven.setMarzo(ram());
        misEmp.add(ven);
        ven= new ClsVendedores();
        
        ven.setNombre("Emily");
        ven.setEnero(ram());
        ven.setFebrero(ram());
        ven.setMarzo(ram());
        misEmp.add(ven);
        ven= new ClsVendedores();
        
         ven.setNombre("Nom 3");
        ven.setEnero(ram());
        ven.setFebrero(ram());
        ven.setMarzo(ram());
        misEmp.add(ven);
        ven= new ClsVendedores();
        
         ven.setNombre("nom 4");
        ven.setEnero(ram());
        ven.setFebrero(ram());
        ven.setMarzo(ram());
        misEmp.add(ven);
        ven= new ClsVendedores();
        
         ven.setNombre("nom 5");
        ven.setEnero(ram());
        ven.setFebrero(ram());
        ven.setMarzo(ram());
        misEmp.add(ven);
        ven= new ClsVendedores();
        
         ven.setNombre("nom 6");
        ven.setEnero(ram());
        ven.setFebrero(ram());
        ven.setMarzo(103);
        misEmp.add(ven);
        ven= new ClsVendedores();
        
         ven.setNombre("nom 7");
        ven.setEnero(ram());
        ven.setFebrero(ram());
        ven.setMarzo(ram());
        misEmp.add(ven);
        ven= new ClsVendedores();
        
         ven.setNombre("nom 8 ");
        ven.setEnero(ram());
        ven.setFebrero(ram());
        ven.setMarzo(ram());
        misEmp.add(ven);
        ven= new ClsVendedores();
        
        double sumaEnero=0;
        double sumaFebrero=0;
        double sumaMarzo=0;
        double sumatotal=0;
        for(ClsVendedores v: misEmp){
            System.out.println("nom="+v.getNombre());
            sumaEnero=sumaEnero+v.getEnero();
            sumaFebrero=sumaFebrero+v.getFebrero();
            sumaMarzo=sumaMarzo+v.getMarzo();
            sumatotal=sumaEnero+sumaFebrero + sumaMarzo;
            
        }
        System.out.println("la suma de enero es : "+ sumaEnero);
        
         System.out.println("la suma de febrero  es : "+ sumaFebrero);
        
          System.out.println("la suma de marzo   es : "+ sumaMarzo);
          
          System.out.println("la suma de todos los meses es : "+ sumatotal);
    }
    
    public static void imprimir(Collection coleccion){
        for (Object elemento : coleccion){
            System.out.println("elemento = "+ elemento);
        }
        
    }
   
 public static int ram(){
     int numero = 0; 
          numero = (int) (Math.random()*(1000-100)) + 100;
          
        return numero;
    }
   
}

