/* Scripts do projeto DOM - HTML e JavaScript
Autor: Fuzer
data: 11/21
Versão: 1
*/

// 1. Mudar valores com o .value
function mudarTexto() {
 document.getElementById('texto').value = "Novo Texto"
}

// 2. Mudar valores com o .innerHTML
function mudarTexto2(){
  document.getElementById('texto2').innerHTML = "Texto 2";
}

// 3. Mudar imagem 
function mudarImagem(){
  document.querySelector('#img01').src = "img/steve_assalto.png";
}

//4. Mudar o CSS (Estilo)
function mudarCSS(){
      // document.getElementById('texto3').style.color = "red";
      // document.getElementById('texto3').style.backgroundColor = "green";
      // document.getElementById('texto3').style.fontSize = "2rem";

      // Encapsulamento
      var texto = document.getElementById('texto3');
      texto.style.color = "purple";
      texto.style.fontSize = "1.5rem";
      texto.style.fontWeight = "bold"
      texto.innerHTML = "Vai toma no cu João";
}

// 5. Mudar texto (com uso de parâmetro)
function mudarTexto3(id){
  // console.log(id);

  // id.innerHTML = "texto alterado por javascript";
  let num = Math.floor(Math.random() * 100);
  id.innerHTML = num;
}

// 6. Data e hora
function mostrarDataHora(){
    document.getElementById('hora').innerHTML = Date();
}

