package model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="Employee")

@Getter
@Setter
    @EqualsAndHashCode

public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name ="first_name",nullable=false,length=50)
    private String firstName;
    @Column(name = "last_name",nullable=false,length=50)
    private String lastName;
    @Column(name="salary",nullable=false,length=50)
    private String salary;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "employee")
    List<payroll> payrollList;
}
