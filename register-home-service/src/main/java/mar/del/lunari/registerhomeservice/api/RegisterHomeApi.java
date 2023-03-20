package mar.del.lunari.registerhomeservice.api;

import mar.del.lunari.registerhomeservice.model.RegisterHomeRequest;
import mar.del.lunari.registerhomeservice.model.RegisterHomeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/register")
public interface RegisterHomeApi {
    @PostMapping("/home")
    ResponseEntity<RegisterHomeResponse> registerHome(@RequestBody RegisterHomeRequest registerHomeRequest);
}
