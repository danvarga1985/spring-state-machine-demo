package dan.varga.springstatemachinedemo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Payment {

    @Id
    @GeneratedValue
    private Long id;

    // Default enum type is number (ORDINAL).
    @Enumerated(EnumType.STRING)
    private PaymentState state;

    private BigDecimal amount;
}
