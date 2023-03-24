package mar.del.lunari.registerpetservice.api;

import mar.del.lunari.registerpetservice.model.RegisterPetRequest;
import mar.del.lunari.registerpetservice.model.RegisterPetResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/register")
public interface RegisterPetApi {
    @PostMapping("/pet")
    ResponseEntity<RegisterPetResponse> registerHome(@RequestBody RegisterPetRequest registerHomeRequest);
}
