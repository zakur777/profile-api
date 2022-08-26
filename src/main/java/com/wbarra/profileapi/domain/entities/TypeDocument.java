package com.wbarra.profileapi.domain.entities;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TypeDocument {
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
