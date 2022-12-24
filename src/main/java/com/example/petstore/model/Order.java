package com.example.petstore.model;

import com.example.petstore.model.enumType.OrderStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "\"order\"")
public class Order extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "pet_id", nullable = false)
    private Pet pet;
    private Integer quantity;
    @Column(name = "ship_date")
    private Instant shipDate;
    @Enumerated(EnumType.STRING)
    @Transient
    private OrderStatus status;
    @Column(columnDefinition = "boolean default false")
    private boolean complete;
}
