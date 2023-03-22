package mar.del.lunari.findhomeservice.model;

import lombok.Data;

import java.util.List;

@Data
public class FindHomeRequest {
    private List<AnimalType> animalTypes;
    private String country;
    private String city;
}
