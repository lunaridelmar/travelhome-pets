package mar.del.lunari.registerpetservice.model;

import lombok.Data;

@Data
public class PetOwnerRequest {
    private String petOwnerName;
    private String phoneNumber;
}
