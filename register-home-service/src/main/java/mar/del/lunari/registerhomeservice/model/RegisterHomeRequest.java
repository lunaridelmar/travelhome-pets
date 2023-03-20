package mar.del.lunari.registerhomeservice.model;

import lombok.Data;

import java.util.List;

@Data
public class RegisterHomeRequest {

    private OwnerRequest ownerRequest;
    private AddressRequest addressRequest;
    private String description;

    private List<AnimalType> supportedAnimalTypes;
}
