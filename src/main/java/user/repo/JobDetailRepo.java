package user.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import user.entity.JobDetail;
@Repository
public interface JobDetailRepo extends MongoRepository<JobDetail,Long> {
}
