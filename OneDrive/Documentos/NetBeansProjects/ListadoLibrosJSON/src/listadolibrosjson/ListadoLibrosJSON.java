/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listadolibrosjson;

/**
 *
 * @author J MAX
 */
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class ListadoLibrosJSON {

    public static void main(String[] args) {
        // Creamos un objeto JSON
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("mensaje", "Lista de libros recomendados");
        jsonObject.put("cantidadDeLibros", 5);
        jsonObject.put("disponibilidad", true);

        // Creamos un arreglo de libros
        JSONArray librosArray = new JSONArray();

        // Añadimos libros al arreglo
        librosArray.put(new JSONObject()
                .put("titulo", "Cien Años de Soledad")
                .put("autor", "Gabriel García Márquez")
                .put("paginas", 417)
                .put("genero", "Realismo mágico"));

        librosArray.put(new JSONObject()
                .put("titulo", "1984")
                .put("autor", "George Orwell")
                .put("paginas", 328)
                .put("genero", "Distopía"));

        librosArray.put(new JSONObject()
                .put("titulo", "El Hobbit")
                .put("autor", "J.R.R. Tolkien")
                .put("paginas", 310)
                .put("genero", "Fantasía"));

        librosArray.put(new JSONObject()
                .put("titulo", "Don Quijote de la Mancha")
                .put("autor", "Miguel de Cervantes")
                .put("paginas", 863)
                .put("genero", "Clásico"));

        librosArray.put(new JSONObject()
                .put("titulo", "Orgullo y Prejuicio")
                .put("autor", "Jane Austen")
                .put("paginas", 279)
                .put("genero", "Romance"));

        // Añadimos el arreglo al objeto JSON
        jsonObject.put("libros", librosArray);

        // Guardamos el JSON en un archivo
        try (FileWriter file = new FileWriter("libros.json")) {
            file.write(jsonObject.toString(4)); // Formateamos el JSON con indentación de 4 espacios
            file.flush();
            System.out.println("Archivo JSON creado exitosamente.");
        } catch (IOException e) {
        }
    }
}