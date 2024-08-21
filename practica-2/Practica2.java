public class Practica2{

    /*
        4.-La potenciación se resuelve elevando un número conocido
        como base a un número conocido como exponente. La 
        potenciación indica que una base elevada a un exponente 
        es igual a la sumatoria de las base, el número de veces que
        indica el exponente. Por ejemplo 5(3)=5+5+5. Implemente un 
        algoritmo que resuelva la potenciación.
    */

   /*   
        Observación el planteamiento del problema tiene un error de solución,
        las potencias se resulven con multiplicación y no con suma. Por ejemplo 
        5(3)=5*5*5
   */

    public static void main(String[] args){
        double base=2;
        int exponente=3;
        double res=1;
        //Realizó una validación para que el exponente y la base sean mayor a 0 por la inicializacion de la variable res
        if(base>0 && exponente>0){
            for(int i=0;i<exponente;i++){
                res=res*base;
            }
            System.out.println("El resultado es: "+res);
        }else{
            System.out.println("La base y la potencia deben ser mayor a 0");
        }   
    }

}