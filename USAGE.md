<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.demo.petstore.SwaggerPetstore;
import com.demo.petstore.models.operations.CreatePetsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SwaggerPetstore sdk = SwaggerPetstore.builder()            .build();

            com.demo.petstore.models.operations.CreatePetsResponse res = sdk.pets.createPets();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->