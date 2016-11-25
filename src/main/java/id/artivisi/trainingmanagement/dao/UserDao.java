package id.artivisi.trainingmanagement.dao;

import id.artivisi.trainingmanagement.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserDao extends PagingAndSortingRepository<User, String> {
    
}
