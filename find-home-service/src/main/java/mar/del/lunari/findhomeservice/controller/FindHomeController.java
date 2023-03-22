package mar.del.lunari.findhomeservice.controller;

import mar.del.lunari.findhomeservice.api.FindHomeApi;
import mar.del.lunari.findhomeservice.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class FindHomeController implements FindHomeApi {

    @Override
    public ResponseEntity<FindHomeResponse> findHome(@RequestBody FindHomeRequest findHomeRequest) {
        //TODO add service usage with implementation https://github.com/lunaridelmar/travelhome-pets/issues/3

        return ResponseEntity.ok(
                FindHomeResponse.builder()
                        .homeFounds(Collections.singletonList(getHomeFound()))
                        .build()
        );
    }

    private HomeFound getHomeFound() {
        HomeFound homeFound = new HomeFound();

        HomeAddress homeAddress = new HomeAddress();
        homeAddress.setCountry("Country");
        homeAddress.setCity("City");
        homeAddress.setDistrict("Dist");
        homeFound.setHomeAddress(homeAddress);

        HomeOwner homeOwner = new HomeOwner();
        homeOwner.setOwnerName("The name");
        homeOwner.setPhoneNumber("Phone");
        homeFound.setHomeOwner(homeOwner);

        homeFound.setSupportedAnimalTypes(Collections.singletonList(AnimalType.BUNNY));

        homeFound.setDescription("Some desc");

        return homeFound;
    }
}
