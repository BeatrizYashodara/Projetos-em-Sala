<?php

$index = $_POST['index'] ?? null;
$arquivo = 'dados.json';

if (!file_exists($arquivo)) {
    exit;
}

$dados = json_decode(file_get_contents($arquivo), true);

if (isset($dados[$index])) {
    unset($dados[$index]);
    $dados = array_values($dados); // reorganiza índices
}

file_put_contents($arquivo, json_encode($dados)); ?>
