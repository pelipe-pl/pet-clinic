package pl.pelipe.petclinic.bootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.pelipe.petclinic.model.Owner;
import pl.pelipe.petclinic.model.Vet;
import pl.pelipe.petclinic.services.OwnerService;
import pl.pelipe.petclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) {

        Logger logger = LoggerFactory.getLogger(this.getClass().getName());

        Owner owner1 = new Owner();
        owner1.setFirstName("Chuck");
        owner1.setLastName("Norris");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Don");
        owner2.setLastName("Johnson");
        ownerService.save(owner2);

        logger.info("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Mickey");
        vet1.setLastName("Mouse");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Donald");
        vet2.setLastName("Duck");
        vetService.save(vet2);

        logger.info("Loaded Vets...");

    }
}