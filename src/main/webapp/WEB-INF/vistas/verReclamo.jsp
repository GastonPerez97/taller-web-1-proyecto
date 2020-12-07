<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="header.jsp"%>

<c:choose>

	<c:when test="${not empty reclamo.detalleRespuesta && not empty reclamo.detalle}">
	<h1 class="text-center h1 display-3 bebas mb-4">Pedido
		"${reclamo.pedido.idPedido}"</h1>


	<section class="mx-auto col-lg-6">

		<article>
			<form:form action="reclamoRespuesta" method="POST"
				modelAttribute="reclamo">
					
					<div class="form-group">
						<div class="mb-3">
							<form:hidden path="pedido.idPedido" id="idPedido"
								class="form-control" />
						</div>
						
					<p style= "font-weight: bold"; >El reclamo ya se encuentra atendido. Si desea puede actualizar su respuesta</p>


						<div class="form-group">
							<div class="mb-3">
								<label for="detalle">Reclamo:</label>
								<form:textarea path="detalle" id="detalle" class="form-control"
									required="true" readonly="true" />
							</div>
						</div>
						<div class="form-group">
							<div class="mb-3">
								<label for="detalleRespuesta">Respuesta:</label>
								<form:textarea path="detalleRespuesta" id="detalleRespuesta"
									class="form-control" required="true"/>
							</div>
						</div>

						<div class="form-group mt-5 text-center">
							<button type="submit" class="btn btn-primary mx-auto">Actualizar Respuesta</button>

							<a href="./restaurantes"><button type="button"
									class="btn btn-secondary">Volver</button></a>
						</div>
			</form:form>
		</article>
	</section>
</c:when>

	<c:when test="${not empty reclamo.detalle}">
	<h1 class="text-center h1 display-3 bebas mb-4">Pedido
		"${reclamo.pedido.idPedido}"</h1>


	<section class="mx-auto col-lg-6">

		<article>
			<form:form action="reclamoRespuesta" method="POST"
				modelAttribute="reclamo">
					
					<div class="form-group">
						<div class="mb-3">
							<form:hidden path="pedido.idPedido" id="idPedido"
								class="form-control" />
						</div>


						<div class="form-group">
							<div class="mb-3">
								<label for="detalle">Reclamo:</label>
								<form:textarea path="detalle" id="detalle" class="form-control"
									required="true" readonly="true" />
							</div>
						</div>
						<div class="form-group">
							<div class="mb-3">
								<label for="detalleRespuesta">Respuesta:</label>
								<form:textarea path="detalleRespuesta" id="detalleRespuesta"
									class="form-control" required="true" />
							</div>
						</div>

						<div class="form-group mt-5 text-center">
							<button type="submit" class="btn btn-primary mx-auto">Enviar
								Respuesta</button>

							<a href="./restaurantes"><button type="button"
									class="btn btn-secondary">Volver</button></a>
						</div>
			</form:form>
		</article>
	</section>
</c:when>

<c:when test="${empty reclamo.detalle}">
	<h2 class="text-center h1 display-4 bebas mb-4">No hay un reclamo
		en el pedido</h2>

	<section class="comidas mx-auto">
		<a href="./restaurantes"><button type="button"
				class="btn btn-secondary">Volver</button></a>
	</section>
</c:when>



</c:choose>

<%@ include file="footer.jsp"%>