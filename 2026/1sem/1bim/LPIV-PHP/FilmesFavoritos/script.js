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

        // estrutura da tabela
        let tabela = `
            <table class="table table-striped table-bordered">
                <thead class="table-primary">
                    <tr>
                        <th>Título</th>
                        <th>Gênero</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody>
        `;

        dados.forEach((item, index) => {
            tabela += `
                <tr>
                    <td>${item.titulo}</td>
                    <td>${item.genero}</td>
                    <td>
                        <button class="btn btn-outline-danger btn-sm" onclick="excluirItem(${index})">
                            Excluir
                        </button>
                    </td>
                </tr>
            `;
        });

        tabela += `
                </tbody>
            </table>
        `;

        lista.innerHTML = tabela;
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
