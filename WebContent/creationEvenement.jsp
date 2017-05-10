<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
<%@ page import="donnees.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Deal With It !</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="http://anthony.jeamme.fr/css/resume_impress.css" media="print">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="style.css">
</head>
<body>

<header>
	<h1>Cr�ation d'un �v�nement</h1>
</header>

 	<nav id="bloc_navigation">
		<a class="btn btn-success btn-lg nav nav-tabs nav-left" href="AccueilConnecte"><span class="glyphicon glyphicon-chevron-left"></span>  Accueil  </a>
	</nav>

<section>
	<form method="post" action="creerEvenement">
		<label for="nom">Nom de l'�v�nement :</label>
		<br/>
		<input type="text" name="nom" id="nom" />
		<br/>
		
		<input class="btn btn-default" value="Cr�er l'�v�nement" type="submit">
		
	</form>
</section>

</body>
</html>