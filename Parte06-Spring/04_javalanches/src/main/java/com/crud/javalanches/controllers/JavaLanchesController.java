package com.crud.javalanches.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.javalanches.models.Categoria;
import com.crud.javalanches.models.Cliente;
import com.crud.javalanches.models.Endereco;
import com.crud.javalanches.models.Produto;
import com.crud.javalanches.repository.CategoriaRepository;
import com.crud.javalanches.repository.ClienteRepository;
import com.crud.javalanches.repository.EnderecoRepository;
import com.crud.javalanches.repository.ProdutoRepository;

@Controller
public class JavaLanchesController {

    
   @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private ProdutoRepository produtoRepository;


    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired EnderecoRepository enderecoRepository;


    @GetMapping("/")
    public String index(){
        return "index";
    }


    @GetMapping("/novaCategoria")
    public String novaCategoria(){
        return "nova_categoria";

    }


    @PostMapping("/novaCategoria")
    public String novaCategoria(Categoria categoria){
        categoriaRepository.save(categoria);
        return "categoria_sucesso";

    }

    @GetMapping("/novoProduto")
    public String novoProduto(Model model){
        model.addAttribute("categorias", categoriaRepository.findAll());
        return "novo_produto";
    }

    @PostMapping("/novoProduto")
    public String novoProduto(Produto produto, @RequestParam("categoriaId") Long categoriaId){
        Categoria categoria = categoriaRepository.findById(categoriaId).orElse(null);
        produto.setCategoria(categoria);
        produtoRepository.save(produto);
        return "produto_sucesso";


    }

    @GetMapping("/listarProdutos")
    public String listarProdutos(Model model){
        model.addAttribute("categorias", categoriaRepository.findAll());
        return "listar_produtos";
    }


    @GetMapping("/novoCliente")
    public String novoCliente(){
        return "novo_cliente";
    }

    @PostMapping("/novoCliente")
    public String novoCliente(Cliente cliente, Endereco endereco) {
        cliente.getEnderecos().add(endereco);
        endereco.getClientes().add(cliente);

        enderecoRepository.save(endereco);
        clienteRepository.save(cliente);
        return "cliente_sucesso";
    }


    @GetMapping("/listaClientes")
    public String listarClientes(){
        return "listar_clientes";
    }

    

}
