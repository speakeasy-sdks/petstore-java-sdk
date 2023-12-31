/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.demo.petstore.models.operations;

import com.demo.petstore.utils.SpeakeasyMetadata;


public class ListPetsRequest {
    /**
     * How many items to return at one time (max 100)
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Integer limit;

    public ListPetsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    
    public ListPetsRequest(){}
}
