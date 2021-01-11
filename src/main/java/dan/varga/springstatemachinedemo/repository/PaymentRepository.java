package dan.varga.springstatemachinedemo.repository;

import dan.varga.springstatemachinedemo.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
