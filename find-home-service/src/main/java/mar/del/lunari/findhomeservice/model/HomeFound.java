package mar.del.lunari.findhomeservice.model;

import lombok.Data;

import java.util.List;

@Data
public class HomeFound {

    private HomeOwner homeOwner;
    private HomeAddress homeAddress;
    private String description;

    private List<AnimalType> supportedAnimalTypes;
}
