package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import util.JPAUtil;

public class Estoque {
	
	private ArrayList<Produto> lista = new ArrayList<>();

	public void adiciona(Produto produto) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
		em.close();
	}

	public void alterar(Produto produto) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Produto novo_produto = em.find(Produto.class, produto.getId());
		novo_produto.setNome(produto.getNome());
		novo_produto.setDescricao(produto.getDescricao());
		novo_produto.setPreco(produto.getPreco());
		novo_produto.setQuantidade(produto.getQuantidade());
		novo_produto.setUnidade(produto.getUnidade());
		em.getTransaction().commit();
		em.close();
	}

	public void remove(int valor) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Produto produto = em.find(Produto.class, valor);
		em.remove(produto);
		em.getTransaction().commit();
		em.close();
	}

	public Produto consulta(int id) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Produto produto = em.find(Produto.class, id);
		em.getTransaction().commit();
		em.close();
		return produto;
	}

	public ArrayList<Produto> getProdutos() {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("SELECT p FROM Produto p");
        List<Produto> produtos = query.getResultList();

        for(Produto produto : produtos){
    		lista.add(produto);
        }

		em.getTransaction().commit();
		em.close();
		return lista;
	}

}
