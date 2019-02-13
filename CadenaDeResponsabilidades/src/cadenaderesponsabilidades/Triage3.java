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
public class Triage3 implements IAtencion {

    private IAtencion next;

    @Override
    public IAtencion getNext() {
        return next;
    }

    @Override
    public void solicitarAtencion(int tipo) {
        if (tipo == 3) {
            System.out.println("Su atencion no puede tardar mas de 60 minutos");
        } else {
            next.solicitarAtencion(tipo);
        }

    }

    @Override
    public void setNext(IAtencion atencion) {
        next = atencion;
    }

}
