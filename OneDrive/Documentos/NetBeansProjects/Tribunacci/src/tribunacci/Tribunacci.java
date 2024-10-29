/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tribunacci;

/**
 *
 * @author J MAX
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tribunacci {

    // Función recursiva para calcular la secuencia Tribunacci
    public static int tribunacciRec(int n, List<Integer> tribunacciList) {
        if (n == 0) return tribunacciList.get(0);
        if (n == 1) return tribunacciList.get(1);
        if (n == 2) return tribunacciList.get(2);
        
        return tribunacciRec(n - 1, tribunacciList) 
             + tribunacciRec(n - 2, tribunacciList) 
             + tribunacciRec(n - 3, tribunacciList);
    }
    
    // Función para generar la secuencia Tribunacci
    public static List<Integer> generateTribunacci(int[] initialValues, int length, boolean useLinkedList) {
        List<Integer> tribunacciList = useLinkedList ? new LinkedList<>() : new ArrayList<>();
        
        for (int value : initialValues) {
            tribunacciList.add(value);
        }
        
        for (int i = 3; i < length; i++) {
            tribunacciList.add(tribunacciRec(i, tribunacciList));
        }
        
        return tribunacciList;
    }
    
    // Función para invertir la lista
    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
    
    public static void main(String[] args) {
        int[] initialValues = {0, 1, 1}; // Puedes cambiar estos valores
        int length = 10; // Cambia este valor según lo que necesites
        
        // Cambia el número del carnet según corresponda
        boolean useLinkedList = true; // true para LinkedList, false para ArrayList
        
        List<Integer> tribunacciSequence = generateTribunacci(initialValues, length, useLinkedList);
        
        System.out.println("Secuencia Tribunacci: " + tribunacciSequence);
        
        List<Integer> reversedSequence = reverseList(tribunacciSequence);
        System.out.println("Secuencia Invertida: " + reversedSequence);
    }
}