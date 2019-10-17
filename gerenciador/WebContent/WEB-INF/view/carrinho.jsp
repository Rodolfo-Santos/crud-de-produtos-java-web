
<jsp:include page="trechos/header.jsp" />

<body class="bg-color1">

   	<jsp:include page="trechos/menu.jsp" />

    <main>
        <div class="container m-auto row venda-conteudo mb-4">
            <div class="col-12 col-md-8 d-flex flex-column">
                <div class="grupo-titulo">
                    <h2 class="text-white animated fadeInLeft">Carrinho do Cliente</h2>
                    <p class="text-muted text-justify animated fadeInleft delay-03s">
                        Confira os produtos do carrinho do cliente
                    </p>
                </div>
                <table class="table table-dark bg-color1">
                    <thead>
                        <tr class="animated fadeInLeft">
                            <th scope="col">ID</th>
                            <th scope="col">Produto</th>
                            <th scope="col">Valor</th>
                            <th scope="col">Quantidade</th>
                            <th scope="col">Total</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr class="animated fadeInLeft">
                            <th scope="row">1</th>
                            <td>Pão Puma</td>
                            <td>R$ 5,00</td>
                            <td><input type="number" name="quantidade" id=""
                                    class="input-venda border-none text-center input-small" value="2"></td>
                            <td>R$ 10,00</td>
                        </tr>
                        <tr class="animated fadeInLeft">
                            <th scope="row">1</th>
                            <td>Pão Puma</td>
                            <td>R$ 5,00</td>
                            <td><input type="number" name="quantidade" id=""
                                    class="input-venda border-none text-center input-small" value="2"></td>
                            <td>R$ 10,00</td>
                        </tr>
                        <tr class="animated fadeInLeft">
                            <th scope="row">1</th>
                            <td>Pão Puma</td>
                            <td>R$ 5,00</td>
                            <td><input type="number" name="quantidade" id=""
                                    class="input-venda border-none text-center input-small" value="2"></td>
                            <td>R$ 10,00</td>
                        </tr>
                    </tbody>
                </table>
                <div class="row ml-2 justify-content-between">
                    <button class="btn btn-danger col-5
                               animated fadeInUp delay-1s">
                        Cancelar Compra </button>
                    <button class="btn btn-large btn-color2 col-6 
                                      animated fadeInUp delay-1s">
                        Finalizar Compra </button>
                </div>
            </div>
            <div class="col-12 col-md-4 d-flex flex-column tela-direita justify-content-between">
                <div class="d-none d-md-block">
                    <img src="img/fundo04.svg" alt="" class="img-fundo-vendas animated fadeIn delay-08s">
                </div>
            </div>
        </div>
		<jsp:include page="trechos/footer.jsp" />

    </main>

	<jsp:include page="trechos/scripts-base.jsp" />

</body>

</html>