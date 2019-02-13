/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaderesponsabilidades;

/**
 *
 * @author estudiantes
 */
public class Hospital implements IAtencion{
    
    private IAtencion next;
    
    @Override
    public IAtencion getNext(){
        return next;
    }
    
    @Override
    public void solicitarAtencion (int tipo){
        //System.out.println("si entro");
        Triage1 triage1 = new Triage1();
        this.setNext(triage1);
       
        Triage2 triage2 = new Triage2();
        triage1.setNext(triage2);
        
        Triage3 triage3 = new Triage3();
        triage2.setNext(triage3);
        
        Triage4 triage4 = new Triage4();
        triage3.setNext(triage4);
        
        Triage5 triage5 = new Triage5();
        triage4.setNext(triage5);
      
        next.solicitarAtencion(tipo);
    
    }
    
    @Override
    public void setNext (IAtencion atencion){
        this.next = atencion;
    }
}
