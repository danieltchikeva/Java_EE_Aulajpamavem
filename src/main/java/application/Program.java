package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		//============ Java EE - Mapeamento objeto-relacional com JPA / Hibernate ==================
		
		/*//PASSO 1: Adicionar pessoas no BD
		Pessoa p1 = new Pessoa(null, "Daniel Tchikeva", "daniel@gmail.com");
		Pessoa p2 = new Pessoa(null, "Manuel Tchikeva", "manuel@gmail.com");
		Pessoa p3 = new Pessoa(null, "Francisco Tchikeva", "francisco@gmail.com");
		Pessoa p4 = new Pessoa(null, "Eduardo Miapia", "eduardo@gmail.com");
		Pessoa p5 = new Pessoa(null, "Pedro Tchikeva", "pedro@gmail.com");
		*/
		
		/*//Passo 1: Adicionar pessoas no BD
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.persist(p5);
		
		em.getTransaction().commit();
		*/
		
		//Em todos os passos esta operação tem que estar presente 
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
				EntityManager em = emf.createEntityManager();
						
		/*
		//Passo 2: resgatar um arquivo do BD
		Pessoa p = em.find(Pessoa.class, 4);
		System.out.println(p);
		*/
		
		//PASSO 3: Fazer remoção de pessoa no BD
		Pessoa p = em.find(Pessoa.class, 5);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		
		
		System.out.println("Tudo pronto!");
		em.close();
		emf.close();
		
	}

}
