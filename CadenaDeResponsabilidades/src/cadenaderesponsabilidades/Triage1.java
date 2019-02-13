/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaderesponsabilidades;

/**
 *
 * @author Estudiantes
 */
public class Triage1 implements IAtencion {

    private IAtencion next;

    @Override
    public IAtencion getNext() {
        return next;
    }

    @Override
    public void solicitarAtencion(int tipo) {
        if (tipo == 1) {
            System.out.println("La atencion tiene que ser inmediata!!");
        } else {
            this.next.solicitarAtencion(tipo);
        }

    }

    @Override
    public void setNext(IAtencion atencion) {
        next = atencion;
    }
}