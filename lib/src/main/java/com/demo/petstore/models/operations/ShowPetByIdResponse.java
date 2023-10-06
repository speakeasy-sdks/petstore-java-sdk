/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.demo.petstore.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ShowPetByIdResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public ShowPetByIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * unexpected error
     */
    
    public com.demo.petstore.models.shared.Error error;

    public ShowPetByIdResponse withError(com.demo.petstore.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    /**
     * Expected response to a valid request
     */
    
    public com.demo.petstore.models.shared.Pet pet;

    public ShowPetByIdResponse withPet(com.demo.petstore.models.shared.Pet pet) {
        this.pet = pet;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public ShowPetByIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public ShowPetByIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ShowPetByIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
