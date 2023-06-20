package com.itb.inf2em.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2em.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {

	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String litarProdutos(Model model) {
		
		
		
		Produto produto = new Produto();
		produto.setId(20l);
		produto.setNome("Televisor Samsung 75'");
		produto.setDescricao("Televisor Tela Plana de Plasma FullHD");
		produto.setPreco(5467.99);
		produto.setCodigoBarras("JLDFOWHBSNHSB12345");
		
		Produto produto2 = new Produto();
		produto2.setId(21l);
		produto2.setNome("Máquina de Lavar 15l");
		produto2.setDescricao("Máquina de lavar Brastemp com painel digital");
		produto2.setPreco(2364.99);
		produto2.setCodigoBarras("AFGFDVGTBDFGRE12345");
		
		// Adicionando Produtos a lista
		listaDeProdutos.add(produto);
		listaDeProdutos.add(produto2);
		
		model.addAttribute("listaDeProdutos",listaDeProdutos);
		
		return "produtos";
	}
	
	@GetMapping("/novo-produto")
	public String novoProduto() {
		
		return "novo-prod";
	}
	
}
