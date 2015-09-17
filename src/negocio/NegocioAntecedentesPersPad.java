/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidad.AntecedentesPersPad;
import datos.OperacionesAntecedentesPersPad;
/**
 *
 * @author QUINCHO
 */
public class NegocioAntecedentesPersPad 
{
    public void insertarAntecedentePersPad(AntecedentesPersPad nuevoAntecedente)
    {
        OperacionesAntecedentesPersPad operacionesAntecedente = new OperacionesAntecedentesPersPad();
        operacionesAntecedente.insertarAntecedentePersPad(nuevoAntecedente);
    }// fin del metodo insertarPadecimiento
}
