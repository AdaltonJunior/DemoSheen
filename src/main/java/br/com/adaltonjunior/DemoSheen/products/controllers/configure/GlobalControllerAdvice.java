package br.com.adaltonjunior.DemoSheen.products.controllers.configure;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.adaltonjunior.DemoSheen.products.services.exceptions.ProductNotExistException;

@ControllerAdvice
public class GlobalControllerAdvice {
	
	/**
     * Handles {@link ProductNotExistException}.
     *
     * @param exception    exception
     *
     * @return response entity
     */
    @ExceptionHandler(ProductNotExistException.class)
    public ResponseEntity<String> handleProductNotExistsException(ProductNotExistException exception) {
        return new ResponseEntity<String>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
	
}
