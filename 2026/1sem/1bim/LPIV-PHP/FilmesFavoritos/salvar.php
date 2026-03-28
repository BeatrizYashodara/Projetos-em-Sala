<?php

$titulo = $_POST['titulo'] ?? '';
$genero = $_POST['genero'] ?? '';

if ($titulo == '' || $genero == '') {
    exit;
}

$arquivo = 'dados.json';

$dados = [];

if (file_exists($arquivo)) {
    $json = file_get_contents($arquivo);
    $dados = json_decode($json, true);
}

// cria um objeto (array associativo)
$novoItem = [
    "titulo" => $titulo,
    "genero" => $genero
];

$dados[] = $novoItem;

file_put_contents($arquivo, json_encode($dados));
?>
