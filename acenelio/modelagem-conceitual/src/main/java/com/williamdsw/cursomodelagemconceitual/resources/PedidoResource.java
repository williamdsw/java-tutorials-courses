package com.williamdsw.cursomodelagemconceitual.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.williamdsw.cursomodelagemconceitual.domain.Pedido;
import com.williamdsw.cursomodelagemconceitual.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {
	@Autowired
	private PedidoService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscarPorID(@PathVariable Integer id) {
		Pedido pedido = service.buscarPorID(id);
		return ResponseEntity.ok().body(pedido);
	}
}