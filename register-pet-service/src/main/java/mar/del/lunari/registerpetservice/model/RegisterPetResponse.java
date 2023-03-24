package mar.del.lunari.registerpetservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterPetResponse {
    private String petName;
    private AnimalType petType;
    private String description;
}
