/**
 * 
 */
package br.com.acme.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import br.com.acme.model.Model;
import br.com.acme.repository.ModelRepository;
import lombok.RequiredArgsConstructor;

/**
 * @author carlos
 *
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class Service {
	
	private final ModelRepository repository;

	public Iterable<Model> models(Pageable pageable) {
		return this.repository.findAll(pageable);
	}
}
