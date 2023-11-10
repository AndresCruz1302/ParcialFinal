package com.Ejemplo.EjemploComunicacion.Controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Ropa {
    @GetMapping("/Ropa")
    public String showIndex(Model model){
        model.addAttribute( "bienvenida", "Bienvenido a CarePet");
        model.addAttribute( "init", "CarePet");

        
        model.addAttribute( "title", "Ropa para mascotas");
        model.addAttribute( "subtitle", "Ropa que te pueden interesar");
        model.addAttribute( "Compra", "Comprar producto");

        model.addAttribute( "Gato1", "Sueter");
        model.addAttribute( "Gato2", "Vestido");
        model.addAttribute( "Gato3", "Disfraz");
        model.addAttribute( "PrecioG", "$40.99");
        model.addAttribute( "PrecioG2", "$40.99");
        model.addAttribute( "PrecioG3", "$60.99");

        model.addAttribute( "Perro1", "Sueter para perro");
        model.addAttribute( "Perro2", "gorro");
        model.addAttribute( "PrecioP", "$40.99");
        model.addAttribute( "PrecioP2", "$9.99");

        
        model.addAttribute( "pathimageG", "images/shop/RopaG/sueter.jpg");
        model.addAttribute( "pathimageG2", "images/shop/RopaG/vestido.jpg");
        model.addAttribute( "pathimageG3", "images/shop/RopaG/disfraz.jpg");

        model.addAttribute( "pathimageP", "images/shop/RopaP/suetp.jpg");
        model.addAttribute( "pathimageP2", "images/shop/RopaP/gorro.jpg");

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
