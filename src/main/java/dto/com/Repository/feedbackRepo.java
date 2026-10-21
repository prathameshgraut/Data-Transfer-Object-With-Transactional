package dto.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dto.com.entity.FeedBack;

@Repository
public interface feedbackRepo extends JpaRepository<FeedBack, Integer>{

}
