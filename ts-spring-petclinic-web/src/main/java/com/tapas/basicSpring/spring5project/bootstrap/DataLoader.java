package com.tapas.basicSpring.spring5project.bootstrap;

import com.tapas.basicSpring.spring5project.model.Owner;
import com.tapas.basicSpring.spring5project.model.Vet;
import com.tapas.basicSpring.spring5project.service.OwnerService;
import com.tapas.basicSpring.spring5project.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Tapas");
        owner1.setLastName("Satpathy");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ahuti");
        owner2.setLastName("Mishra");
        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("Anshuman");
        owner3.setLastName("Manas");
        ownerService.save(owner3);

        System.out.println("Loaded Owners.....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Saroj");
        vet1.setLastName("Kumar");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Pankaj");
        vet2.setLastName("Kumar");
        vetService.save(vet2);

        System.out.println("Loaded vets.....");
    }
}
