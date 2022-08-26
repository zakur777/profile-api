package com.wbarra.profileapi.persistence.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type_document")
public class TypeDocumentDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_document")
    private Integer typeDocumentId;

    private String name;

    @OneToMany(mappedBy = "typeDocument")
    private List<UserDAO> users;

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

    public List<UserDAO> getUsers() {
        return users;
    }

    public void setUsers(List<UserDAO> users) {
        this.users = users;
    }
}
