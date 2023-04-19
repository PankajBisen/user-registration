package user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import user.entity.CompanyDetail;
@Repository
public interface CompanyDetailRepo extends JpaRepository<CompanyDetail,Long> {
}
