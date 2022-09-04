package com.wbarra.profileapi.persistence;

import com.wbarra.profileapi.domain.entities.TypeDocument;
import com.wbarra.profileapi.domain.gateways.TypeDocumentGateway;
import com.wbarra.profileapi.persistence.crud.TypeDocumentCrudRepository;
import com.wbarra.profileapi.persistence.mappers.TypeDocumentMapper;
import com.wbarra.profileapi.persistence.models.CertificateDAO;
import com.wbarra.profileapi.persistence.models.TypeDocumentDAO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TypeDocumentRepository implements TypeDocumentGateway {

    @Autowired
    private TypeDocumentCrudRepository crudRepository;

    @Autowired
    private TypeDocumentMapper mapper;

    @Override
    public List<TypeDocument> getAll() {
        List<TypeDocumentDAO> daos = (List<TypeDocumentDAO>) crudRepository.findAll();
        return mapper.toTypeDocuments(daos);
    }

    @Override
    public Optional<TypeDocument> getTypeDocumentById(Integer id) {
        return crudRepository.findById(id).map(document -> mapper.toTypeDocument(document));
    }

    @Override
    public TypeDocument saveTypeDocument(TypeDocument typeDocument) {
        TypeDocumentDAO dao = mapper.toTypeDocumentDAO(typeDocument);
        return mapper.toTypeDocument(crudRepository.save(dao));
    }

    @Override
    public void deleteTypeDocumentById(Integer id) {
        crudRepository.deleteById(id);
    }

    @Override
    public TypeDocument update(TypeDocument typeDocument) {
        TypeDocumentDAO dao = mapper
                .toTypeDocumentDAO(getTypeDocumentById(typeDocument.getTypeDocumentId()).get());
        BeanUtils.copyProperties(typeDocument, dao);
        return mapper.toTypeDocument(crudRepository.save(dao));
    }
}
