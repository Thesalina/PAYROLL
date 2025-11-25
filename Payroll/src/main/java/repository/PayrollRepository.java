package repository;

import model.payroll;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PayrollRepository extends JpaRepository<payroll,Long> {

    List<payroll> findByEmployee_Id(Long id);
    payroll findByemployee_idandPayroll_period(Long id,Long pid);
}
