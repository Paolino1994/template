package ar.fiuba.tdd.template;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTests {

    @Test
    public void puedoCrearUnaCola() {
        Cola cola1 = new Cola<Integer>();
        assertNotNull(cola1);
    }
   @Test
    public void puedoAgregarYSacarUnObjetoDeLaCola() {
        Cola cola1= new Cola<Integer>();
        cola1.add(5);
        cola1.add(6);
        cola1.add(7);
        try{assertEquals(cola1.top(),5);
        assertEquals(cola1.top(),6);
        assertEquals(cola1.top(),7);
        }
        catch (Exception exeption){
            assertTrue(false);//falla el test si lanza la excepcion
        }
    }
    @Test
    public void colaEstaVacia() {
        Cola cola1= new Cola<Integer>();
        assertTrue(cola1.isEmpty());
    }
    @Test
    public void colaNoEstaVacia() {
        Cola cola1= new Cola<Integer>();
        cola1.add(1);
        assertFalse(cola1.isEmpty());
    }
    @Test
    public void puedoObtenerUnTamañoCorrecto(){
        Cola cola1= new Cola<Integer>();
        cola1.add(5);
        cola1.add(6);
        cola1.add(7);
        assertEquals(cola1.size(),3);
        try {
            cola1.remove();
            assertEquals(cola1.size(),2);
            assertFalse(cola1.isEmpty());
        } catch (Exception e) {
            assertTrue(false);//falla el test si lanza la excepcion
        }

    }
    @Test
    public void noPuedoSacarUnObjetoDeUnaColaVacia(){
        Cola cola1= new Cola<Integer>();
        cola1.add(5);
        cola1.add(6);
        try {
            cola1.remove();
            cola1.remove();
            try{
                cola1.top();//tiene que lanzar Error
                assertTrue(false);//falla el test si no lanza la excepcion en el top
            }
            catch(Exception exception2){
                assertTrue(true);
            }
        } catch (Exception e) {
            assertTrue(false);//falla el test si lanza la excepcion antes del top
        }

    }
}
