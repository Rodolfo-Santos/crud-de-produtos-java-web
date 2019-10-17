<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="theme-color" content="#111">
    <meta name="apple-mobile-web-app-status-bar-style" content="#111">

    <title>Gestão Real</title>
    <link href="css/style.css" rel="stylesheet">
</head>
<body class="bg-color1 text-white">
	<div class="container vh-100 d-flex justify-content-center align-items-center">
    	<h1>O produto <span class="text-color2"> ${ produto } </span> foi Cadastrado com Sucesso!</h1>
    </div>
    
    
    
    <!--SCRIPTS-->
	    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
	    <script src="js/bootstrap.bundle.min.js"></script>
	    <script src="js/bootstrap.min.js"></script>
    <!--FIM SCRIPTS-->
    
    <script type="text/javascript">
	    setTimeout(function() {
	        window.location.href = "/gerenciador/estoque";
	    }, 2000);
    </script>
    
    
    
</body>
</html>