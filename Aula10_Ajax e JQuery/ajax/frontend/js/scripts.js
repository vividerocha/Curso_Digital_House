
function submeter(e){
    let data = {
        "id": $($("#form1")[0].id).val(),
        "name": $($("#form1")[0].name).val(),
        "location": $($("#form1")[0].location).val()
    }
    salvar(data);
    $("#form1").trigger("reset");
    e.preventDefault();
    
}


function salvar(data){    
            $.ajax({
                method: "POST",
                url: "http://localhost:3000/users",
                dataType: "json",
                data: data,
                success: function(data){
                    console.log(data);
                    carregar();
                    
                },
                error: function(data){
                    console.log(data);
                    carregar();
                }
            })
            
}

function carregar(){
    $('#bodyTabela').empty();

    $.ajax({
        method: "GET",
        url: "http://localhost:3000/users",
        dataType: "json",
        data: {
            test : 'TESTE'
        },
        success: function(data){
            $(data).each(function(i, nomes){
                $('#bodyTabela').append($("<tr>")
                        .append($("<td>").append(nomes.id))
                        .append($("<td>").append(nomes.name))
                        .append($("<td>").append(nomes.location))
                        .append($("<td>").append('<img src="img/edit.png" width="25px" onclick="consultaUmNome(' + nomes.id + ')">'))
                        .append($("<td>").append('<img src="img/delete.png" width="30px" onclick="excluir(' + nomes.id + ')">'))
                );
            });
        }
        
    })
}

function excluir(id){
    $.ajax({
        method: "DELETE",
        url: "http://localhost:3000/users/" + id,
        dataType: "json",
        success: function(data){
            console.log(data);
            carregar();
        }
    });
}

function consultaUmNome(id){
    $.ajax({
        method: "GET",
        url: "http://localhost:3000/users/" + id,
        dataType: "json",
        success: function(data) {
            $($("#form1")[0].id).val(data.id);
            $($("#form1")[0].name).val(data.name);
            $($("#form1")[0].location).val(data.location);
        }
    });

}

function atualizar(e){
    let data = {
        "id": $($("#form1")[0].id).val(),
        "name": $($("#form1")[0].name).val(),
        "location": $($("#form1")[0].location).val()
    }

    var id = data.id;

    $.ajax({
        method: "PUT",
        url: "http://localhost:3000/users/" + id,
        dataType: "json",
        data: data,
        success: function(data){
            console.log(data);
            carregar();
        }
    });

    $("#form1").trigger("reset");
    e.preventDefault();
    
}