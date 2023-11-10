package com.Ejemplo.EjemploComunicacion.Controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Juguetes {
    @GetMapping("/Juguetes")
    public String showIndex(Model model){
        model.addAttribute( "bienvenida", "Bienvenido a CarePet");
        model.addAttribute( "init", "CarePet");

        
        model.addAttribute( "title", "Juguetes para mascotas");
        model.addAttribute( "subtitle", "Algunos Juguetes que te pueden interesar");
        model.addAttribute( "Compra", "Comprar producto");

        model.addAttribute( "Gato1", "Plumas");
        model.addAttribute( "Gato2", "Raton");
        model.addAttribute( "Gato3", "Raton en esfera");
        model.addAttribute( "PrecioG", "$4.99");
        model.addAttribute( "PrecioG2", "$6.99");
        model.addAttribute( "PrecioG3", "$10.99");

        model.addAttribute( "Perro1", "Pelotas");
        model.addAttribute( "Perro2", "Hueso de hule");
        model.addAttribute( "PrecioP", "$4.99");
        model.addAttribute( "PrecioP2", "$7.99");

        
        model.addAttribute( "pathimageG", "images/shop/Jgato/1.jpg");
        model.addAttribute( "pathimageG2", "images/shop/Jgato/2.jpg");
        model.addAttribute( "pathimageG3", "images/shop/Jgato/3.jpg");

        model.addAttribute( "pathimageP", "images/shop/Jperro/pelota.jpg");
        model.addAttribute( "pathimageP2", "images/shop/Jperro/H.jpg");

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
