package io.github.xinyangpan.spring.data.restdemo.restrepo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.github.xinyangpan.spring.data.restdemo.po.UserPo;
import io.github.xinyangpan.spring.data.restdemo.po.UserProjection;

@RepositoryRestResource(collectionResourceRel = "user", path = "user", excerptProjection = UserProjection.class)
public interface UserRepository extends PagingAndSortingRepository<UserPo, Long> {

	List<UserPo> findByLastName(@Param("lastName") String lastName);

	UserPo findByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);

}