/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosequipo;
import java.util.Scanner;
/**
 *
 * @author igor
 */
//public class DatosEquipo {
    
    public class Jugadora{
        String nombre;
        String apellido;
        String mail;
        int nacimiento;
        boolean lesionada;
        
        public Jugadora (String nombre, String apellido, String mail,
                int nacimiento, boolean lesionada){
            this.nombre = nombre;
            this.apellido = apellido;
            this.mail = mail;
            this.nacimiento = nacimiento;
            this.lesionada = false;
        }
        
        public String getNombre (){
            return this.nombre;
        }
        
        public String getApellido (){
            return this.apellido;
        }
        
        public String getMail (){
            return this.mail;
        }
        
        public int getNacimiento (){
            return this.nacimiento;
        }
        
        public boolean getLesionada (){
            return this.lesionada;
        }
        
        public void setNombre (String nombre){
            this.nombre = nombre;
        }
        
        public void setApellido (String apellido){
            this.apellido = apellido;
        }
        
        public void setMail (String mail){
            this.mail = mail;
        }
        
        public void setNacimiento (int nacimiento){
            this.nacimiento = nacimiento;
        }
        
        public void setLesionada (boolean lesionada){
            this.lesionada = lesionada;
        }
    //}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Jugadora jugadora1 = new Jugadora("","","",0,false);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Teclee el nombre de la jugadora");
        jugadora1.nombre = input.nextLine();
        
        System.out.println("Teclee el apellido de la jugadora");
        jugadora1.apellido = input.nextLine();
        
        System.out.println("Teclee el mail de la jugadora");
        jugadora1.mail = input.nextLine();
        
        System.out.println("Teclee el año de nacimiento de la jugadora");
        jugadora1.nacimiento = input.nextInt();
        
        System.out.println(jugadora1.nombre);
        System.out.println(jugadora1.apellido);
        System.out.println(jugadora1.mail);
        System.out.println(jugadora1.nacimiento);

        
    }
    
    
}
