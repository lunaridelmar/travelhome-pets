package mar.del.lunari.registerpetservice.model;

import lombok.Data;

@Data
public class DesiredAddress {
    private String country;
    private String city;
    private String district;
}
