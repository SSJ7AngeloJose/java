package ciclos_while.ejercicios;

import javax.swing.*;



/*leer un numero e indicar si es positivo o negativo el proceso se repetira hasta que se introduzca un 0*/
public class ejercicio_2 {
   public static void main(String[] args){

       int num;
       num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero :"));

while(num  != 0){
    if(num >= 0 ){
        JOptionPane.showMessageDialog(null,"el numero"+ num + "es positivo");
        num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero :"));
        }else{
            JOptionPane.showMessageDialog(null," el numero"+ num + "es negativo");
            num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero :"));

        }
}
}
}



