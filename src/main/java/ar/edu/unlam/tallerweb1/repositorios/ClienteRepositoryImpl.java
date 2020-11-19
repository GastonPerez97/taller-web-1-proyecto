package ar.edu.unlam.tallerweb1.repositorios;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.ClienteModel;

@Repository("repositorioCliente")
public class ClienteRepositoryImpl implements ClienteRepository {

	@Inject
	private SessionFactory sessionFactory;

	public ClienteModel consultarClientePorId(Long id) {
		return null;
	}

	public void guardarCliente(ClienteModel cliente) {
	}

	@Override
	public List<ClienteModel> buscarCliente() {

		return sessionFactory.getCurrentSession().createCriteria(ClienteModel.class).list();
	}

}
