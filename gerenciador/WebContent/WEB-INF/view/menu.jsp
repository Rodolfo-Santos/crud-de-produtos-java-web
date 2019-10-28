<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="trechos/header.jsp" />

<body class="bg-color1">

	<jsp:include page="trechos/menu.jsp" />
	
	<main class="h-100 pt-4">
		<div class="container bloco_conteudo">

			<img src="img/fundo02.svg" alt="" class="img-fundo animated fadeInLeft delay-1s">

			<div class="w-100 menu-conteudo">
				<h1 class="text-white animated bounceInLeft">Bem vindo de volta <span class="text-color2">${ usuarioLogado.nome }</span></h1>
				<p class="text-muted text-justify animated bounceInLeft delay-05s">
					Escolha uma das opções abaixo para continuar. Gerencie seus a entrada e saída de produtos.
				</p>

				<div class="d-flex flex-column">
					<a href="entrada?acao=venda" class="btn btn-menu btn-color2 mb-3 animated fadeInLeft delay-06s">
						Realizar Venda
					</a>

					<a href='entrada?acao=estoque' class="btn btn-menu btn-color2 mb-3 animated fadeInLeft delay-07s">
						Verificar Estoque
					</a>

					<a href='entrada?acao=historico' class="btn btn-menu btn-color2 mb-3 animated fadeInLeft delay-08s">
						Histórico de vendas
					</a>
				</div>
			</div>
		</div>

		<jsp:include page="trechos/footer.jsp" />

	</main>

	<jsp:include page="trechos/scripts-base.jsp" />

</body>

</html>