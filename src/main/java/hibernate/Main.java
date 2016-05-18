package hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] a) {
		EntityManager em;

		em = Persistence.createEntityManagerFactory("primary").createEntityManager();
		Order order = new Order("Tobias Trelle");
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(order);
		em.flush();
		tx.commit();
		System.out.println("finish");

		EntityManager em1;

		em1 = Persistence.createEntityManagerFactory("assista").createEntityManager();
		Todo todo = new Todo("test");
		EntityTransaction tx1 = em1.getTransaction();
		tx1.begin();
		em1.persist(todo);
		em1.flush();
		tx1.commit();
		System.out.println("finish1");

	

	}
}
