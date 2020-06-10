/**
 * 
 */
package br.com.acme.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acme.model.Model;
import br.com.acme.service.Service;
import lombok.RequiredArgsConstructor;

/**
 * @author carlos
 *
 */

@RestController
@RequestMapping("/api/v1/")
public class Controller {

	private final Service service;

	public Controller(Service service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<Iterable<Model>> models(Pageable pageable) {
		return new ResponseEntity<>(this.service.models(pageable), HttpStatus.OK);
	}
}
