package com.Ejemplo.EjemploComunicacion.Controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Comida {
    @GetMapping("/Comida")
    public String showIndex(Model model){
        model.addAttribute( "bienvenida", "Bienvenido a CarePet");
        model.addAttribute( "init", "CarePet");

        
        model.addAttribute( "title", "Comida para mascotas");
        model.addAttribute( "subtitle", "Algunas comidas que te pueden interesar");
        model.addAttribute( "Compra", "Comprar producto");

        model.addAttribute( "Gato1", "Don Kat");
        model.addAttribute( "Gato2", "Mirringo");
        model.addAttribute( "Gato3", "Felix");
        model.addAttribute( "PrecioG", "$6.99");
        model.addAttribute( "PrecioG2", "$7.99");
        model.addAttribute( "PrecioG3", "$9.99");

        model.addAttribute( "Perro1", "Pedigree");
        model.addAttribute( "Perro2", "Dog Chow");
        model.addAttribute( "PrecioP", "$15.99");
        model.addAttribute( "PrecioP2", "$10.99");

        
        model.addAttribute( "pathimageG", "images/shop/ComidaG/DonKat.jpg");
        model.addAttribute( "pathimageG2", "images/shop/ComidaG/Mirringo.jpg");
        model.addAttribute( "pathimageG3", "images/shop/ComidaG/felix.jpg");

        model.addAttribute( "pathimageP", "images/shop/ComidaP/Pedigree.jpg");
        model.addAttribute( "pathimageP2", "images/shop/ComidaP/Dog.jpg");

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
