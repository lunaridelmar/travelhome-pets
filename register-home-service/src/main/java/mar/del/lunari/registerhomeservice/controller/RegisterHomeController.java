package mar.del.lunari.registerhomeservice.controller;

import mar.del.lunari.registerhomeservice.api.RegisterHomeApi;
import mar.del.lunari.registerhomeservice.model.RegisterHomeRequest;
import mar.del.lunari.registerhomeservice.model.RegisterHomeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterHomeController implements RegisterHomeApi {

    @Override
    public ResponseEntity<RegisterHomeResponse> registerHome(@RequestBody RegisterHomeRequest findHomeRequest) {
        //TODO add service usage with implementation https://github.com/lunaridelmar/travelhome-pets/issues/2

        return ResponseEntity.ok(
                RegisterHomeResponse.builder()
                        .description(findHomeRequest.getDescription())
                        .build()
        );
    }
}
