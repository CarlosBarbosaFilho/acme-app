/**
 * 
 */
package br.com.acme.service;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import br.com.acme.model.Model;
import br.com.acme.repository.ModelRepository;

/**
 * @author carlos
 *
 */
@Component
public class Service {

	private final ModelRepository repository;

	public Service(ModelRepository repository) {
		this.repository = repository;
	}

	public Iterable<Model> models(Pageable pageable) {
		return this.repository.findAll(pageable);
	}
}
