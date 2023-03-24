package mar.del.lunari.registerpetservice.model;

import lombok.Data;

@Data
public class RegisterPetRequest {
    private String petName;
    private AnimalType animalType;
    private PetOwnerRequest petOwnerRequest;
    private DesiredAddress desiredAddress;
    private String description;
}
