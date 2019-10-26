<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="trechos/header.jsp" />

<body class="bg-color1">

    <main class="container bloco_conteudo">
        <div id="form_login" class="form_login">
            <h1 class="text-white animated fadeInDown">Gestãoo<span class="text-color2">Real</span></h1>
            <p class="text-muted animated fadeInUp text-justify">Gerencie as vendas de produtos de sua loja. Tenha seu
                negócio na palma da sua mão. Faça Login para começar.
            </p>
            <form role="form" name="form1" id="login-form" action="" method="post">
                <div class="form-group d-flex align-items-end animated fadeInLeft delay-05s">
                    <img src="img/icons/user.svg" class="icon mr-2">
                    <input type="text" class="form-control input-login" id="user" placeholder="UsuÃ¡rio" name="user">
                </div>
                <div class="form-group d-flex animated fadeInLeft delay-07s">
                    <img src="img/icons/key.svg" class="icon mr-2">
                    <input type="password" class="form-control input-login" id="pwd" placeholder="Senha"
                        name="password">
                </div>
                <div class="my-4 d-flex flex-column-reverse flex-md-row justify-content-between align-items-start">
                    <a href="#" class="text-muted text-decoration animated fadeInUp delay-07s my-3 my-md-0">
                        Esqueci a senha</a>
                    <button class="btn btn-large btn-color2 animated fadeInDown delay-05s"
                        id="btn-login">Entrar</button>
                </div>
            </form>
        </div>

        <img src="img/fundo01.svg" alt="" class="img-fundo animated fadeIn delay-1s ml-4 pl-4">
    </main>

	<jsp:include page="trechos/footer.jsp" />

	<jsp:include page="trechos/scripts-base.jsp" />
    <script src="js/submit.js"></script>

</body>

</html>