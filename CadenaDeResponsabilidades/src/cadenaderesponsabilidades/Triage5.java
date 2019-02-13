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
public class Triage5 implements IAtencion{
    private IAtencion next;

    @Override
    public IAtencion getNext() {
        return next;
    }

    @Override
    public void solicitarAtencion(int tipo) {
        if (tipo == 5) {
            System.out.println("Denle una aromatica");
        }

    }

    @Override
    public void setNext(IAtencion atencion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
