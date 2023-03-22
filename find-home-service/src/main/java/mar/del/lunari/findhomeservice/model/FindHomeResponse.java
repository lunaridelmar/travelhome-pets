package mar.del.lunari.findhomeservice.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class FindHomeResponse {
    private List<HomeFound> homeFounds;
}
