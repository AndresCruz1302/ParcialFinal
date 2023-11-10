package com.Ejemplo.EjemploComunicacion.Controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Camas {
    @GetMapping("/Camas")
    public String showIndex(Model model){
        model.addAttribute( "bienvenida", "Bienvenido a CarePet");
        model.addAttribute( "init", "CarePet");

        
        model.addAttribute( "title", "Camas para mascotas");
        model.addAttribute( "subtitle", "Algunas camas que te pueden interesar");
        model.addAttribute( "Compra", "Comprar cama");

        model.addAttribute( "Gato1", "Cama para Gato sencilla");
        model.addAttribute( "Gato2", "Cama para Gato suave");
        model.addAttribute( "Gato3", "Cama para Gato con techo");
        model.addAttribute( "PrecioG", "$19.99");
        model.addAttribute( "PrecioG2", "$50.99");
        model.addAttribute( "PrecioG3", "$100.99");

        model.addAttribute( "Perro1", "Cama para perro con juguete");
        model.addAttribute( "Perro2", "Cama para perro sencilla");
        model.addAttribute( "PrecioP", "$100.99");
        model.addAttribute( "PrecioP2", "$50.99");
  

        model.addAttribute( "Perrop", "Camas para perro pequeño");
        model.addAttribute( "Descp", "Una cama comoda y acogedora para perros pequeños");
        model.addAttribute( "Precio", "Precio: $29.99");

        model.addAttribute( "Gato", "Cama para Gato");

        
        model.addAttribute( "pathimageG", "images/shop/CamasGato/CamaG1.jpg");
        model.addAttribute( "pathimageG2", "images/shop/CamasGato/CamaG2.jpg");
        model.addAttribute( "pathimageG3", "images/shop/CamasGato/CamaG3.jpg");

        model.addAttribute( "pathimageP", "images/shop/Camasperro/Camap1.jpg");
        model.addAttribute( "pathimageP2", "images/shop/Camasperro/Camap2.jpg");

        model.addAttribute( "TR", "Clientes satisfechos");
        model.addAttribute( "rez", "Reseñas");

        model.addAttribute( "Resena1", "Esta pagina es muy util");
        model.addAttribute( "Resena2", "Espero incrementen su catalogo");
        model.addAttribute( "Resena3", "Vende productos muy interesantes");
        model.addAttribute( "Resena4", "Siempre dispuestos a mejorar");
        model.addAttribute( "Resena5", "Ya no quedan existencias de lo que buscaba");
        return "Index2";
    }
}
