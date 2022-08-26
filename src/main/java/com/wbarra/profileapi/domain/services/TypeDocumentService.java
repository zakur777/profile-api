package com.wbarra.profileapi.domain.services;

import com.wbarra.profileapi.domain.entities.TypeDocument;
import com.wbarra.profileapi.domain.gateways.TypeDocumentGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeDocumentService {

    @Autowired
    private TypeDocumentGateway gateway;

    public List<TypeDocument> getAll() {
        return gateway.getAll();
    }

    public Optional<TypeDocument> getTypeDocumentById(Integer id) {
        return gateway.getTypeDocumentById(id);
    }

    public TypeDocument saveTypeDocument(TypeDocument typeDocument) {
        return gateway.saveTypeDocument(typeDocument);
    }

    public boolean deleteTypeDocumentById(Integer id) {
        return getTypeDocumentById(id).map(typeDocumen -> {
            gateway.deleteTypeDocumentById(id);
            return true;
        }).orElse(false);
    }




}
