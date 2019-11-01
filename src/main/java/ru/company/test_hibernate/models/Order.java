package ru.company.test_hibernate.models;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.company.test_hibernate.models.dict.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Data
@Table(name = "Orders")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Type type;

    @NotNull
    private BigDecimal value;

    @NotNull
    private Date cdat; // created
}
