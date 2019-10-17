<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="trechos/header.jsp" />

<body class="bg-color1">

   	<jsp:include page="trechos/menu.jsp" />
   
    <main>
        <div class="container m-auto row venda-conteudo mb-4">
            <div class="col-12 col-md-12 d-flex flex-column">
                <div class="grupo-titulo">
                    <h2 class="fadeInLeft animated text-white">Histórico de Vendas</h2>
                    <p class="text-muted text-justify animated fadeInLeft delay-02s">
                        Consulte as últimas vendas realizadas
                    </p>
                </div>

                <ul id="accordion" class="p-0 animated fadeInLeft delay-03s">
                    <div class="card border-none">
                        <div class="card-header bg-light text-muted" id="headingOne" data-toggle="collapse" data-target="#collapseOne"
                            aria-expanded="true" aria-controls="collapseOne">
                            <h5 class="d-flex justify-content-between">
                                <div class="titulo-01">
                                    Venda: 0099
                                </div>
                                <div class="d-flex text-muted">
                                    <div class="mr-4">20/04/2019</div>
                                    <div class="">20:00</div>
                                </div>
                            </h5>
                        </div>

                        <div id="collapseOne" class="collapse show" aria-labelledby="headingOne"
                            data-parent="#accordion">
                            <div class="card-body pb-4">
                                <table class="table mt-4 fadeIn animated">
                                    <thead>
                                        <tr class="animated text-center">
                                            <th scope="col">ID</th>
                                            <th scope="col">Produto</th>
                                            <th scope="col">Quantidade</th>
                                            <th scope="col">Total</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="animated text-center">
                                            <th scope="row">1</th>
                                            <td>Pão Puma</td>
                                            <td> 2 </td>
                                            <td>R$ 10,00</td>
                                        </tr>
                                        <tr class="animated text-center">
                                            <th scope="row">1</th>
                                            <td>Pão Puma</td>
                                            <td> 2 </td>
                                            <td>R$ 10,00</td>
                                        </tr>
                                        <tr class="animated text-center">
                                            <th scope="row">1</th>
                                            <td>Pão Puma</td>
                                            <td> 2 </td>
                                            <td>R$ 10,00</td>
                                        </tr>
                                    </tbody>
                                </table>
                                <div class="d-flex justify-content-end mr-4 p-2">
                                    <div class="bold mr-3">Total: </div>
                                    <div>R$ 30,00</div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="card border-none">
                        <div class="card-header bg-light text-muted" id="headingThree" data-toggle="collapse" data-target="#collapseTwo"
                            aria-expanded="true" aria-controls="collapseTwo">
                            <h5 class="d-flex justify-content-between">
                                <div class="titulo-02">
                                    Venda: 0098
                                </div>
                                <div class="d-flex text-muted">
                                    <div class="mr-4">20/04/2019</div>
                                    <div class="">20:00</div>
                                </div>
                            </h5>
                        </div>

                        <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
                            data-parent="#accordion">
                            <div class="card-body pb-4">
                                <table class="table mt-4 fadeIn animated">
                                    <thead>
                                        <tr class="animated text-center">
                                            <th scope="col">ID</th>
                                            <th scope="col">Produto</th>
                                            <th scope="col">Quantidade</th>
                                            <th scope="col">Total</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="animated text-center">
                                            <th scope="row">1</th>
                                            <td>PÃ£o Puma</td>
                                            <td> 2 </td>
                                            <td>R$ 10,00</td>
                                        </tr>
                                        <tr class="animated text-center">
                                            <th scope="row">1</th>
                                            <td>PÃ£o Puma</td>
                                            <td> 2 </td>
                                            <td>R$ 10,00</td>
                                        </tr>
                                        <tr class="animated text-center">
                                            <th scope="row">1</th>
                                            <td>PÃ£o Puma</td>
                                            <td> 2 </td>
                                            <td>R$ 10,00</td>
                                        </tr>
                                    </tbody>
                                </table>
                                <div class="d-flex justify-content-end mr-4 p-2">
                                    <div class="bold mr-3">Total: </div>
                                    <div>R$ 30,00</div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="card border-none">
                        <div class="card-header bg-light text-muted" id="headingTwo" data-toggle="collapse" data-target="#collapseThree"
                            aria-expanded="true" aria-controls="collapseThree">
                            <h5 class="d-flex justify-content-between">
                                <div class="titulo-03">
                                    Venda: 0097
                                </div>
                                <div class="d-flex text-muted">
                                    <div class="mr-4">20/04/2019</div>
                                    <div class="">20:00</div>
                                </div>
                            </h5>
                        </div>

                        <div id="collapseThree" class="collapse" aria-labelledby="headingThree"
                            data-parent="#accordion">
                            <div class="card-body pb-4">
                                <table class="table mt-4 fadeIn animated">
                                    <thead>
                                        <tr class="animated text-center">
                                            <th scope="col">ID</th>
                                            <th scope="col">Produto</th>
                                            <th scope="col">Quantidade</th>
                                            <th scope="col">Total</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="animated text-center">
                                            <th scope="row">1</th>
                                            <td>Pão Puma</td>
                                            <td> 2 </td>
                                            <td>R$ 10,00</td>
                                        </tr>
                                        <tr class="animated text-center">
                                            <th scope="row">1</th>
                                            <td>Pão Puma</td>
                                            <td> 2 </td>
                                            <td>R$ 10,00</td>
                                        </tr>
                                        <tr class="animated text-center">
                                            <th scope="row">1</th>
                                            <td>Pão Puma</td>
                                            <td> 2 </td>
                                            <td>R$ 10,00</td>
                                        </tr>
                                    </tbody>
                                </table>
                                <div class="d-flex justify-content-end mr-4 p-2">
                                    <div class="bold mr-3">Total: </div>
                                    <div>R$ 30,00</div>
                                </div>
                            </div>
                        </div>
                    </div>
                </ul>

            </div>

        </div>
		<jsp:include page="trechos/footer.jsp" />
    </main>

<jsp:include page="trechos/scripts-base.jsp" />

</body>

</html>