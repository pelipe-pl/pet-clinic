package pl.pelipe.petclinic.services;

import pl.pelipe.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
