
package estancias;

import EstanciaEntidades.Casa;
import EstanciaServicio.CasasServicios;
import EstanciaServicio.EstanciasServicio;
import EstanciaServicio.FamiliasSevicio;
import java.time.LocalDate;

import java.util.Scanner;

public class Estancias {

    public static void main(String[] args) throws Exception {
        FamiliasSevicio fa=new FamiliasSevicio();
        CasasServicios cs=new CasasServicios();
        EstanciasServicio es=new EstanciasServicio();
        //cs.imprimirCasas();
     // fa.imprimirFamilias();
       //fa.imprimirFamiliasTresHijosMenos10();
       //fa.imprimirFamiliasMailHotmail();
       //punto d
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//       System.out.println("Ingrese el día de alquiler");
//       int dia=leer.nextInt();
//          
//        System.out.println("Ingrese el mes de alquiler");
//        int mes=leer.nextInt();
//        System.out.println("Ingrese el año de alquiler");
//        int ano=leer.nextInt();
//
//        LocalDate fechaX = LocalDate.of(ano, mes, dia);
//        System.out.println(fechaX);
//        
//
//       cs.imprimirCasasD(fechaX, 10);
//cs.imprimirCasasE();


es.imprimirEstanciasD();
    }
    
}
