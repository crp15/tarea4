/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4.ejercicio2;

/**
 *
 * @author Clariza
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class MiColeccion implements List<Object>{
    private Object[] datos;
    private int dimension;

    public MiColeccion() {
        dimension = 3;
        datos = new Object[dimension];
    }

    public MiColeccion(int dimension) {
        this.dimension = dimension;
        datos = new Object[dimension];
    }

    @Override
    public int size() {
        int tamano = 0;

        for (Object dato : datos) {
            if (dato != null) {
                tamano++;
            }
        }

        return tamano;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] != null) {
                return false;
            }
        }

        return true;
    }

    @Override
    public Object[] toArray() {
        return datos;
    }

    @Override
    public boolean add(Object element) {
        if (this.size() == datos.length) {
            return false;
        }

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == null) {
                datos[i] = element;
                break;
            }
        }

        return true;
    }

    @Override
    public Object remove(int index) {
        if (index < datos.length) {
            datos[index] = null;
            return null;
        }

        return null;
    }

    @Override
    public void clear() {
        for (int i = 0; i < datos.length; i++) {
            datos[i] = null;
        }
    }

    @Override
    public Object get(int index) {
        if (index < datos.length) {
            return datos[index];
        }

        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<Object> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends Object> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection<? extends Object> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<Object> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<Object> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
