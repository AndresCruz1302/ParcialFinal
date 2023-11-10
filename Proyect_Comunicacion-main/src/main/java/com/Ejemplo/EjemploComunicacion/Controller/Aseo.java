package com.Ejemplo.EjemploComunicacion.Controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Aseo {
    @GetMapping("/Aseo")
    public String showIndex(Model model){
        model.addAttribute( "bienvenida", "Bienvenido a CarePet");
        model.addAttribute( "init", "CarePet");

        
        model.addAttribute( "title", "Productos de aseo para mascotas");
        model.addAttribute( "subtitle", "Algunas productos que te pueden interesar");
        model.addAttribute( "Compra", "Comprar producto");

        model.addAttribute( "Gato1", "Shampoo para gato");
        model.addAttribute( "Gato2", "Peine para Gato");
        model.addAttribute( "Gato3", "Secador para Gato");
        model.addAttribute( "PrecioG", "$5.99");
        model.addAttribute( "PrecioG2", "$15.99");
        model.addAttribute( "PrecioG3", "$400.99");

        model.addAttribute( "Perro1", "Shampoo para perro");
        model.addAttribute( "Perro2", "Peinilla para perro");
        model.addAttribute( "PrecioP", "$5.99");
        model.addAttribute( "PrecioP2", "$15.99");

        
        model.addAttribute( "pathimageG", "images/shop/AseoGato/Shampoo.jpg");
        model.addAttribute( "pathimageG2", "images/shop/AseoGato/PeineG.jpg");
        model.addAttribute( "pathimageG3", "images/shop/AseoGato/Secador.jpg");

        model.addAttribute( "pathimageP", "images/shop/AseoPerro/ShampooP.jpg");
        model.addAttribute( "pathimageP2", "images/shop/AseoPerro/Peine.jpg");

        model.addAttribute( "TR", "Clientes satisfechos");
        model.addAttribute( "rez", "Reseñas");

        model.addAttribute( "Resena1", "Esta pagina es muy util");
        model.addAttribute( "Resena2", "Espero incrementen su catalogo");
        model.addAttribute( "Resena3", "Vende productos muy interesantes");
        model.addAttribute( "Resena4", "Siempre dispuestos a mejorar");
        model.addAttribute( "Resena5", "Ya no quedan existencias de lo que buscaba");
        return "index2";
    }
}
