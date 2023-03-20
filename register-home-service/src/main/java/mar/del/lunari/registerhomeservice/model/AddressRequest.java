package mar.del.lunari.registerhomeservice.model;

import lombok.Data;

@Data
public class AddressRequest {
    private String country;
    private String city;
    private String district;
}
