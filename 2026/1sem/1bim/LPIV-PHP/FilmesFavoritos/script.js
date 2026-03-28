function adicionarItem() {
    let titulo = document.getElementById("titulo").value;
    let genero = document.getElementById("genero").value;

    if (titulo === "" || genero === "") {
        alert("Preencha todos os campos!");
        return;
    }
        fetch("salvar.php", {
        method: "POST",
        headers: {
            "Content-Type": "application/x-www-form-urlencoded"
        },
        body: "titulo=" + encodeURIComponent(titulo) + 
              "&genero=" + encodeURIComponent(genero)
    })
    .then(() => {
        document.getElementById("titulo").value = "";
        document.getElementById("genero").value = "";
        carregarLista();
    });
}

function carregarLista() {
    fetch("listar.php")
    .then(res => res.json())
    .then(dados => {
        let lista = document.getElementById("lista");
        lista.innerHTML = "";

        dados.forEach((item, index) => {
            let li = document.createElement("li");

            li.textContent = item.titulo + " | " + item.genero + " ";

            let botao = document.createElement("button");
            botao.textContent = "Excluir";

            botao.onclick = function () {
                excluirItem(index);
            };

            li.appendChild(botao);
            lista.appendChild(li);
        });
    });
}

function excluirItem(index) {
    fetch("excluir.php", {
        method: "POST",
        headers: {
            "Content-Type": "application/x-www-form-urlencoded"
        },
        body: "index=" + index
    })
    .then(() => carregarLista());
}

function toggleLista() {
    let lista = document.getElementById("lista");

    if (lista.style.display === "none" || lista.style.display === "") {
        lista.style.display = "block";
        carregarLista();
    } else {
        lista.style.display = "none";
    }
}
