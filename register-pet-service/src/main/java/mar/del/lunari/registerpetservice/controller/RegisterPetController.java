package mar.del.lunari.registerpetservice.controller;

import mar.del.lunari.registerpetservice.api.RegisterPetApi;
import mar.del.lunari.registerpetservice.model.RegisterPetRequest;
import mar.del.lunari.registerpetservice.model.RegisterPetResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterPetController implements RegisterPetApi {

    @Override
    public ResponseEntity<RegisterPetResponse> registerHome(@RequestBody RegisterPetRequest findHomeRequest) {
        //TODO add service usage with implementation https://github.com/lunaridelmar/travelhome-pets/issues/4

        return ResponseEntity.ok(
                RegisterPetResponse.builder()
                        .petName(findHomeRequest.getPetName())
                        .petType(findHomeRequest.getAnimalType())
                        .description(findHomeRequest.getDescription())
                        .build()
        );
    }
}
