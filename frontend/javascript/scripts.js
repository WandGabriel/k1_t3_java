var btnSalvar = document.querySelector("#adicionarTarefa");
let id = 0;

let listaDeTarefaTodo = [];

btnSalvar.addEventListener("click", function (event) {
	event.preventDefault();

	let indiceCategoria = document.getElementById("entradaCategoria").options.selectedIndex;

	var tarefa = {
		'id': id,
		'titulo': document.getElementById("titulo").value,
		'data': document.getElementById("dataEntrega").value.toString(),
		'categoria': document.getElementById("entradaCategoria")[indiceCategoria].value,
		'prioridade': document.getElementById("entradaPrioridade").value,
		'descricao': document.getElementById("entradaDescricao").value
	}

	id++;
	listaDeTarefaTodo.push(tarefa);
	criarItemListaTodo();
});

function deleteItem(id){
	let i = listaDeTarefaTodo.findIndex(item => item != undefined && item.id==id);
	delete listaDeTarefaTodo[i];
	criarItemListaTodo();
}

function criarItemListaTodo(){
	todohtml = "";
	listaDeTarefaTodo.forEach(function (item,i) {
		todohtml = todohtml+"<div>"+item.titulo+"" +
				"<button onclick='deleteItem("+item.id+")'> Excluir</button>" +
				"</div>";
	})
	document.getElementById("todo").innerHTML = todohtml;
}
