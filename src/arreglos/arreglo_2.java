package arreglos;

public class arreglo_2 {
    public static void main(String[] args){
        String[] nombres = {"angelo", "daniel", "luis" , "vargas"};

      //  for(int i=0 ; i<nombres.length; i++){
       //    System.out.println(nombres[i]);
       // }

        //lo nuevo - for each
        for (String i: nombres){
            System.out.println("nombres: " + i);
        }


    }
}
