package com.ayan.demos.autonomoustransactionprocessing.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "APPLICATION")
public class Application {

    @Id
    @Column(name = "ID", nullable = false)
    private Short id;
    @Column(name = "NAME", nullable = false, length = 50)
    private String name;
    @Column(name = "CREATION", nullable = false)
    private LocalDateTime creation;

}
