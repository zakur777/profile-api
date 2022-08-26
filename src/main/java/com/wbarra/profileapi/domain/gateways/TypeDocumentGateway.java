package com.wbarra.profileapi.domain.gateways;

import com.wbarra.profileapi.domain.entities.TypeDocument;

import java.util.List;
import java.util.Optional;

public interface TypeDocumentGateway {
    List<TypeDocument> getAll();
    Optional<TypeDocument> getTypeDocumentById(Integer id);
    TypeDocument saveTypeDocument(TypeDocument typeDocument);
    void deleteTypeDocumentById(Integer id);
}
