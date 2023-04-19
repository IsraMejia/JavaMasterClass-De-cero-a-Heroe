
//import com.isracode.Utileria;

//import com.isracode.* ; //Reconoce el nombre de las clases, pero las carga en memoria hasta que se usen
//no malgasta memoria

//Importacion estatica, solo usa el metodo o atributo static de la clase
import static com.isracode.Utileria.imprimir;


public class EjemploPaquetesPrueba {
    
    public static void main(String[] args) {
        //Utilizando el nombre de la clase completamente calificado 
        // fully qualified name 
        //com.isracode.Utileria.imprimir("sALU2 Internu");
        
        //haciendo un port de la clase
        //Utileria.imprimir("Haciendo uso de la clase y su metodo ");
        
        //usando el metodo estatico
        imprimir("import static salu2");
    }
 
}
