package ar.edu.unlam.tallerweb1.repositorios;

import javax.inject.Inject;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ar.edu.unlam.tallerweb1.modelo.PedidoModel;

@Repository
@Transactional
public class PedidoRepositoryImpl implements PedidoRepository{

	@Inject
	private SessionFactory sessionFactory;
	
	@Override
	public void guardarPedido(PedidoModel pedido) {
		sessionFactory.getCurrentSession().save(pedido);
		
	}

	@Override
	public PedidoModel consultarPedidoPorId(Long id) {
		PedidoModel pedido = sessionFactory.getCurrentSession().get(PedidoModel.class, id);
		return pedido;
	}




}