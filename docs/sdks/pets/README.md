# Pets
(*pets*)

### Available Operations

* [createPets](#createpets) - Create a pet
* [listPets](#listpets) - List all pets
* [showPetById](#showpetbyid) - Info for a specific pet

## createPets

Create a pet

### Example Usage

```java
package hello.world;

import com.demo.petstore.SwaggerPetstore;
import com.demo.petstore.models.operations.CreatePetsResponse;
import com.demo.petstore.models.shared.Pet;

public class Application {
    public static void main(String[] args) {
        try {
            SwaggerPetstore sdk = SwaggerPetstore.builder()            .build();

            com.demo.petstore.models.shared.Pet req = new Pet(
                596804L,
                "<value>"){{
                tag = "<value>";

            }};

            com.demo.petstore.models.operations.CreatePetsResponse res = sdk.pets.createPets(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [com.demo.petstore.models.shared.Pet](../../models/shared/Pet.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |


### Response

**[com.demo.petstore.models.operations.CreatePetsResponse](../../models/operations/CreatePetsResponse.md)**


## listPets

List all pets

### Example Usage

```java
package hello.world;

import com.demo.petstore.SwaggerPetstore;
import com.demo.petstore.models.operations.ListPetsRequest;
import com.demo.petstore.models.operations.ListPetsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SwaggerPetstore sdk = SwaggerPetstore.builder()            .build();

            com.demo.petstore.models.operations.ListPetsRequest req = new ListPetsRequest(
){{
                limit = 21453;

            }};

            com.demo.petstore.models.operations.ListPetsResponse res = sdk.pets.listPets(req);

            if (res.pets != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [com.demo.petstore.models.operations.ListPetsRequest](../../models/operations/ListPetsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[com.demo.petstore.models.operations.ListPetsResponse](../../models/operations/ListPetsResponse.md)**


## showPetById

Info for a specific pet

### Example Usage

```java
package hello.world;

import com.demo.petstore.SwaggerPetstore;
import com.demo.petstore.models.operations.ShowPetByIdRequest;
import com.demo.petstore.models.operations.ShowPetByIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SwaggerPetstore sdk = SwaggerPetstore.builder()            .build();

            com.demo.petstore.models.operations.ShowPetByIdRequest req = new ShowPetByIdRequest(
                "<value>");

            com.demo.petstore.models.operations.ShowPetByIdResponse res = sdk.pets.showPetById(req);

            if (res.pet != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [com.demo.petstore.models.operations.ShowPetByIdRequest](../../models/operations/ShowPetByIdRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |


### Response

**[com.demo.petstore.models.operations.ShowPetByIdResponse](../../models/operations/ShowPetByIdResponse.md)**

