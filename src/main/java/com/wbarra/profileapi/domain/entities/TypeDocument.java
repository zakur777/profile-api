package com.wbarra.profileapi.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypeDocument extends BaseEntity {
    private Integer typeDocumentId;

    private String name;

    public Integer getTypeDocumentId() {
        return typeDocumentId;
    }

    public void setTypeDocumentId(Integer typeDocumentId) {
        this.typeDocumentId = typeDocumentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
