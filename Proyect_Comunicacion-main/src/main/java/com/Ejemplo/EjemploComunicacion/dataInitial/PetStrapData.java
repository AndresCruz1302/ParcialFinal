package com.Ejemplo.EjemploComunicacion.dataInitial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Ejemplo.EjemploComunicacion.domain.aseoEntity;
import com.Ejemplo.EjemploComunicacion.domain.camasEntity;
import com.Ejemplo.EjemploComunicacion.domain.comidaEntity;
import com.Ejemplo.EjemploComunicacion.domain.juguetesEntity;
import com.Ejemplo.EjemploComunicacion.domain.ropaEntity;
import com.Ejemplo.EjemploComunicacion.repositories.aseoRepositories;
import com.Ejemplo.EjemploComunicacion.repositories.camasRepositories;
import com.Ejemplo.EjemploComunicacion.repositories.comidaRepositories;
import com.Ejemplo.EjemploComunicacion.repositories.juguetesRepositories;
import com.Ejemplo.EjemploComunicacion.repositories.ropaRepositories;

@Component
public class PetStrapData implements CommandLineRunner{
    private final camasRepositories camasRepository;
    private final comidaRepositories comidaRepository;
    private final juguetesRepositories juguetesRepository;
    private final ropaRepositories ropaRepository;
    private final aseoRepositories aseoRepository;

    
    
    public PetStrapData(camasRepositories camasRepository, comidaRepositories comidaRepository,
            juguetesRepositories juguetesRepository, ropaRepositories ropaRepository,
            aseoRepositories aseoRepository) {
        this.camasRepository = camasRepository;
        this.comidaRepository = comidaRepository;
        this.juguetesRepository = juguetesRepository;
        this.ropaRepository = ropaRepository;
        this.aseoRepository= aseoRepository;
    }



    @Override
    public void run(String... args) throws Exception {

       camasEntity addCama =new camasEntity("KingCama", "medium", "Basica", 1200000, "nice", "ACME");
       camasEntity addCama2 =new camasEntity("Buena cama", "medium", "Basica", 900000, "azul", "ACME");
       camasEntity addCama3 =new camasEntity("aceptable Cama", "medium", "Basica", 500000, "Cafe", "ACME");
       camasEntity addCama4 =new camasEntity("Camitas", "Small", "Basica", 1200000, "Rojo", "ACME");
       camasEntity addCama5 =new camasEntity("Camotas", "Big", "Basica", 2000000, "Verde", "ACME");
       camasEntity addCama6 =new camasEntity("masCamas", "medium", "Basica", 700000, "Blanco", "ACME");
       camasEntity addCama7 =new camasEntity("SeAcaban", "Small", "Basica", 400000, "Negro", "ACME");
       camasEntity addCama8 =new camasEntity("Llegaronmas", "Big", "Basica", 1800000, "Naranja", "ACME");
       camasEntity addCama9 =new camasEntity("Camasvarias", "medium", "Basica", 1500000, "Azul claro", "ACME");
       camasEntity addCama10 =new camasEntity("CamasVariadas", "medium", "Basica", 1700000, "Amarillo", "ACME");
       camasRepository.save(addCama);
       camasRepository.save(addCama2);
       camasRepository.save(addCama3);
       camasRepository.save(addCama4);
       camasRepository.save(addCama5);
       camasRepository.save(addCama6);
       camasRepository.save(addCama7);
       camasRepository.save(addCama8);
       camasRepository.save(addCama9);
       camasRepository.save(addCama10);


       comidaEntity addComida= new comidaEntity("Mirringo",7000,"todos","Gato","mediana");
       comidaEntity addComida2= new comidaEntity("Donkat",4000,"todos","Gato","mediana");
       comidaEntity addComida3= new comidaEntity("Evolve",5000,"todos","Gato","mediana");
       comidaEntity addComida4= new comidaEntity("Hill's Gatos",10000,"todos","Gato","mediana");
       comidaEntity addComida5= new comidaEntity("Max",3000,"todos","Gato","mediana");
       comidaEntity addComida6= new comidaEntity("Vet life",7000,"todos","Gato","mediana");
       comidaEntity addComida7= new comidaEntity("Diamond naturals",15000,"todos","Gato","mediana");
       comidaEntity addComida8= new comidaEntity("Nutra nuggets",11000,"todos","Gato","mediana");
       comidaEntity addComida9= new comidaEntity("Nutragold",9000,"todos","Gato","mediana");
       comidaEntity addComida10= new comidaEntity("Taste of the wild",10000,"todos","Gato","mediana");
       comidaRepository.save(addComida);
       comidaRepository.save(addComida2);
       comidaRepository.save(addComida3);
       comidaRepository.save(addComida4);
       comidaRepository.save(addComida5);
       comidaRepository.save(addComida6);
       comidaRepository.save(addComida7);
       comidaRepository.save(addComida8);
       comidaRepository.save(addComida9);
       comidaRepository.save(addComida10);    


       aseoEntity addAseo= new aseoEntity("Shampoo",5000,"todos","Gato");
       aseoEntity addAseo2= new aseoEntity("Cepillo",10000,"todos","Gato");
       aseoEntity addAseo3= new aseoEntity("Collar",4000,"todos","Gato");
       aseoEntity addAseo4= new aseoEntity("Jabon",2000,"todos","Gato");
       aseoEntity addAseo5= new aseoEntity("Secador",500000,"todos","Gato");
       aseoEntity addAseo6= new aseoEntity("Shampoo pequeño",1000,"todos","Gato");
       aseoEntity addAseo7= new aseoEntity("Shampoo grande",9000,"todos","Gato");
       aseoEntity addAseo8= new aseoEntity("Cepillo grande",16000,"todos","Gato");
       aseoEntity addAseo9= new aseoEntity("Peinilla",10000,"todos","Gato");
       aseoEntity addAseo10= new aseoEntity("Peinilla Grande",20000,"todos","Gato");
       aseoRepository.save(addAseo);
       aseoRepository.save(addAseo2);
       aseoRepository.save(addAseo3);
       aseoRepository.save(addAseo4);
       aseoRepository.save(addAseo5);
       aseoRepository.save(addAseo6);
       aseoRepository.save(addAseo7);
       aseoRepository.save(addAseo8);
       aseoRepository.save(addAseo9);
       aseoRepository.save(addAseo10);


       juguetesEntity addJuguete= new juguetesEntity("Generica",2000,"Todos","Perro","Pelota");
       juguetesEntity addJuguete2= new juguetesEntity("Generica",3000,"Todos","Gato","Raton");
       juguetesEntity addJuguete3= new juguetesEntity("Generica",5000,"Todos","Gato","pluma");
       juguetesEntity addJuguete4= new juguetesEntity("Generica",7000,"Todos","Perro","hueso");
       juguetesEntity addJuguete5= new juguetesEntity("Generica",2000,"Todos","Gato","Cascabel");
       juguetesEntity addJuguete6= new juguetesEntity("Generica",4000,"Todos","Perro","Pelota grande");
       juguetesEntity addJuguete7= new juguetesEntity("Generica",12000,"Todos","Perro","Frisby");
       juguetesEntity addJuguete8= new juguetesEntity("Generica",20000,"Todos","Perro","Frisby de mas calidad");
       juguetesEntity addJuguete9= new juguetesEntity("Generica",2000,"Todos","Perro","Rechinador");
       juguetesEntity addJuguete10= new juguetesEntity("Generica",1500,"Todos","Gato","Laser");
       juguetesRepository.save(addJuguete);
       juguetesRepository.save(addJuguete2);
       juguetesRepository.save(addJuguete3);
       juguetesRepository.save(addJuguete4);
       juguetesRepository.save(addJuguete5);
       juguetesRepository.save(addJuguete6);
       juguetesRepository.save(addJuguete7);
       juguetesRepository.save(addJuguete8);
       juguetesRepository.save(addJuguete9);
       juguetesRepository.save(addJuguete10);


       ropaEntity addRopa= new ropaEntity("Generica",10000,"Todos","Gato","Azul","buso");
       ropaEntity addRopa2= new ropaEntity("Generica",10000,"Todos","perro","Azul","buso");
       ropaEntity addRopa3= new ropaEntity("Generica",10000,"Todos","Gato","Azul","Medias");
       ropaEntity addRopa4= new ropaEntity("Generica",10000,"Todos","Perro","Azul","Meidas");
       ropaEntity addRopa5= new ropaEntity("Generica",10000,"Todos","Gato","Azul","Chanclas");
       ropaEntity addRopa6= new ropaEntity("Generica",10000,"Todos","Perro","Azul","Chanclas");
       ropaEntity addRopa7= new ropaEntity("Generica",10000,"Todos","Gato","varios","Disfraz");
       ropaEntity addRopa8= new ropaEntity("Generica",10000,"Todos","perro","varios","Disfraz");
       ropaEntity addRopa9= new ropaEntity("Generica",10000,"Todos","Gato","Azul","sombrero");
       ropaEntity addRopa10= new ropaEntity("Generica",10000,"Todos","Perro","Azul","sombrero");
       ropaRepository.save(addRopa);
       ropaRepository.save(addRopa2);
       ropaRepository.save(addRopa3);
       ropaRepository.save(addRopa4);
       ropaRepository.save(addRopa5);
       ropaRepository.save(addRopa6);
       ropaRepository.save(addRopa7);
       ropaRepository.save(addRopa8);
       ropaRepository.save(addRopa9);
       ropaRepository.save(addRopa10);


       System.out.println("Cantidad de juguetes\n");
       System.out.println("Juguetes: " + juguetesRepository.count());
    }

}
