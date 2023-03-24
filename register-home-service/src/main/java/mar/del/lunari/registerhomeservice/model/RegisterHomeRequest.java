package mar.del.lunari.registerhomeservice.model;

import lombok.Data;

import java.util.List;

@Data
public class RegisterHomeRequest {

    private HomeOwnerRequest homeOwnerRequest;
    private AddressRequest addressRequest;
    private String description;

    private List<AnimalType> supportedAnimalTypes;
}
