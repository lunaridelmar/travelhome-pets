package mar.del.lunari.registerhomeservice.model;

import lombok.Data;

@Data
public class HomeOwnerRequest {
    private String ownerName;
    private String phoneNumber;
}
