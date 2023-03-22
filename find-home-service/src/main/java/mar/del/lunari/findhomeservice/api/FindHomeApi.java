package mar.del.lunari.findhomeservice.api;

import mar.del.lunari.findhomeservice.model.FindHomeRequest;
import mar.del.lunari.findhomeservice.model.FindHomeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/find")
public interface FindHomeApi {
    @GetMapping("/home")
    ResponseEntity<FindHomeResponse> findHome(@RequestBody FindHomeRequest registerHomeRequest);
}
