package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import util.JPAUtil;

public class Usuarios {

	private ArrayList<Usuario> lista = new ArrayList<>();

	public void adiciona(Usuario usuario) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		em.close();
	}

	public Usuario existeUsuario(String login, String senha) {
		this.getUsuarios();
		for(Usuario usuario : lista) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}
	
	public ArrayList<Usuario> getUsuarios() {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("SELECT u FROM Usuario u");
        List<Usuario> usuarios = query.getResultList();

        for(Usuario usuario : usuarios){
    		lista.add(usuario);
        }

		em.getTransaction().commit();
		em.close();
		return lista;
	}
}
