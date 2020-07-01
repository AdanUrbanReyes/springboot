package com.ayan.demos.morethanonedatasource.entities.datasource1;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "userCore1")
@Table(name = "USER_CORE", schema = "BICORP")
public class UserCore {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ID", nullable = false, length = 255)
    private String id;
    @Column(name = "USERNAME", nullable = true, length = 255)
    private String username;
    @Column(name = "PASSWORD", nullable = true, length = 255)
    private String password;

}