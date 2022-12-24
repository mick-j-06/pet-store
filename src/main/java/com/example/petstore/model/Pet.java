package com.example.petstore.model;

import com.example.petstore.model.enumType.PetStatus;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pet")
public class Pet extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @Column(unique = true, nullable = false)
    private String name;
    @ManyToMany
    @JoinTable(
            name = "pet_tag",
            joinColumns = @JoinColumn(name = "pet_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private List<Tag> tags;
    @Enumerated(EnumType.STRING)
    @Transient
    private PetStatus status;
    @OneToMany(mappedBy = "pet")
    private List<Order> orders;
}
