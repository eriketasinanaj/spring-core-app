package com.eapp.core.persistence.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.eapp.core.persistence.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

	// id_application, id_role, is_active, deleted
/*	User findUserByIdApplication(Long idApplication);
	User findUserByIdApplicationAndIsActive(Long idApplication, Boolean isActive);
	User findUserByIdApplicationAndDeleted(Long idApplication, Boolean deleted);
	User findUserByIdApplicationAndIsActiveAndDeleted(Long idApplication, Boolean isActive,  Boolean deleted);

	Page<User> findAllByIdApplicationOrderByDateCreatedDesc(Long idApplication, Pageable pageable);

	User findUserByAuthToken(String authToken);
	User findUserByEmailAndPasswordAndActiveAndDeleted(String email, String password, Boolean active, Boolean deleted);
	User findUserByRefreshTokenAndRefreshTokenExpirationGreaterThanEqual(String refreshToken, Timestamp timestamp);*/

}

