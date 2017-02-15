/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mcorripioh.a05;
import java.util.Scanner;
/**
 *
 * @author MayteCorripio
 */
public class SPP2MCORRIPIOHA05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // 
        menu();
        
    }
   
    public static void menu(){
        Solicitarelnombre("tu nombre");
        Solicitarlaedad("tu edad");
        Solicitarelpeso("tu peso");
        Solicitarlamatricula(" tu matricula");
        
    }
     static long Solicitarlamatricula(String mensaje){
        Scanner kb=new Scanner(System.in);
        long matricula=0;
        boolean flag;
        do{
            System.out.println("Introduce " + mensaje);
         try{
             matricula=kb.nextLong();
             flag=true;
         } catch(Exception ex){
             flag=false;
             System.out.println("El dato que insertaste no es correcto");
             kb.nextLine();
          }
        }while (flag==false);
           
        return matricula;
    }
    static String Solicitarelnombre(String mensaje){
        Scanner kb=new Scanner(System.in);
        String nombre="";
        boolean flag;
        do{
            System.out.println("Introduce "+ mensaje);
            try{
                nombre=kb.nextLine();
                flag=true;
            } catch(Exception ex){
                flag=false;
                System.out.println("No escribiste tu nombre");
                kb.nextLine();
                  
            }
        }while(flag==false);
        return nombre;
    } 
    static double Solicitarlaedad(String mensaje){
        Scanner kb=new Scanner(System.in);
        double peso=0;
        boolean flag;
        do{
            System.out.println("Introduce "+mensaje);
         try{
            peso=kb.nextDouble();
            flag=true;
        } catch(Exception ex){
                flag=false;
                System.out.println("El dato que insertaste no es un número");
                kb.nextLine();
                
        }
    }while(flag==false);
        return peso;
}
     static double Solicitarelpeso(String mensaje){
        Scanner kb=new Scanner(System.in);
        double peso=0;
        boolean flag;
        do{
            System.out.println("Introduce "+mensaje);
         try{
            peso=kb.nextDouble();
            flag=true;
        } catch(Exception ex){
                flag=false;
                System.out.println("El dato que insertaste no es un número");
                kb.nextLine();
                
        }
    }while(flag==false);
        return peso;
    }
     
}