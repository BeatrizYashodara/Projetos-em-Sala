<?php

$arquivo = 'dados.json';

if (!file_exists($arquivo)) {
    echo json_encode([]);
    exit;
}

$json = file_get_contents($arquivo);
echo $json;

?>
