package ar.fiuba.tdd.template;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTests {

    Integer num5 = 5;
    Integer num6 = 6;
    Integer num7 = 7;

    @Test
    public void puedoCrearUnaCola() {
        Cola<Integer> cola1 = new Cola<Integer>();
        assertNotNull(cola1);
    }

    @Test
    public void puedoAgregarYSacarUnObjetoDeLaCola() {
        Cola<Integer> cola1 = new Cola<Integer>();
        cola1.add(num5);
        cola1.add(num6);
        cola1.add(num7);
        assertEquals(cola1.top(), num5);
        cola1.remove();
        assertEquals(cola1.top(), num6);
        cola1.remove();
        assertEquals(cola1.top(), num7);
    }

    @Test
    public void colaEstaVacia() {
        Cola<Integer> cola1 = new Cola<Integer>();
        assertTrue(cola1.isEmpty());
    }

    @Test
    public void colaNoEstaVacia() {
        Cola<String> cola1 = new Cola<String>();
        cola1.add("HOLA");
        assertFalse(cola1.isEmpty());

    }

    @Test
    public void metoDiferentesTiposDeDatos() {
        Cola<Object> cola1 = new Cola<Object>();
        cola1.add("HOLA");
        cola1.add(num5);
        assertEquals("HOLA", cola1.top());
        cola1.remove();
        assertEquals(num5, cola1.top());
    }

    @Test
    public void puedoObtenerUnTamanioCorrecto() {
        Cola<String> cola1 = new Cola<String>();
        cola1.add("Hello");
        cola1.add("Darkness");
        cola1.add("My old friend");
        assertEquals(cola1.size(), 3);
        cola1.remove();
        assertEquals(cola1.size(), 2);
        assertFalse(cola1.isEmpty());
    }

    @Test
    public void noPuedoSacarUnObjetoDeUnaColaVacia() {
        Cola<Integer> cola1 = new Cola<Integer>();
        cola1.add(num5);
        cola1.add(num6);
        cola1.remove();
        cola1.remove();
        try {
            cola1.top();//tiene que lanzar AssertionError
            assertTrue(false);//falla el test si no lanza la excepcion en el top
        } catch (AssertionError e) {
            assertTrue(true);
        }
    }

    @Test
    public void siAgregoYBorroTodosLosObjetosLaListaDebeEstarVacia() {
        Cola<String> cola1 = new Cola<String>();
        cola1.add("Hello darkness, my old friend ");
        cola1.add("I've come to talk with you again");
        cola1.add("Because a vision softly creeping ");
        cola1.add("Left its seeds while I was sleeping ");
        cola1.remove();
        cola1.remove();
        cola1.remove();
        cola1.remove();
        assertTrue(cola1.isEmpty());
    }

    @Test
    public void noPuedoRemoverAlgoDeUnaColaVacia() {
        Cola<Integer> cola1 = new Cola<Integer>();
        try {
            cola1.remove();
            assertTrue(false);
        } catch (AssertionError ex) {
            assertTrue(true);
        }
    }
}
