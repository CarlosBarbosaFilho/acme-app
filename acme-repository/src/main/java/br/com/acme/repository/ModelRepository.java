/**
 * 
 */
package br.com.acme.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.com.acme.model.Model;

/**
 * @author carlos
 *
 */
@Component
@Repository
public interface ModelRepository extends PagingAndSortingRepository<Model, Long> {

}
