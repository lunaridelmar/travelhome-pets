package mar.del.lunari.registerhomeservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterHomeResponse {
    private String description;
}
