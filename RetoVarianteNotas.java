import java.util.ArrayList;
public class Solucion {
       
    public static Object[] reportes(ArrayList<Estudiante> grupo) {     
        
        Object[] resultado = new Object[5];
        double calificacion = 0;
        double notaMenor = grupo.get(0).getNota();
        double notaMayor = 0;
        double promedio = 0;
        String estudianteMenorNota = grupo.get(0).getNombreCompleto();
        String estudianteMayorNota = "";
        
        for(int i = 0; i < grupo.size(); i++){
            calificacion += grupo.get(i).getNota();
            if (grupo.get(i).getNota() < notaMenor){
                notaMenor = grupo.get(i).getNota();
                estudianteMenorNota = grupo.get(i).getNombreCompleto();           
            } if (grupo.get(i).getNota() > notaMayor){
                notaMayor = grupo.get(i).getNota();                
                estudianteMayorNota = grupo.get(i).getNombreCompleto(); 
            }
         }  
        
        promedio = calificacion/grupo.size();
        
        resultado[0] = promedio;
        resultado[1] = estudianteMenorNota;
        resultado[2] = notaMenor;
        resultado[3] = estudianteMayorNota;
        resultado[4] = notaMayor;
        
   
        return resultado;
  }      
   
}