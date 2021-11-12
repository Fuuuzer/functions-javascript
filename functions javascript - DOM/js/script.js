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
  document.getElementById('texto2').innerHTML = "você";
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

// 7. Alterar texto ao tirar o foco
function alterarTexto(){
  const textoInformado = document.getElementById('nome');
  textoInformado.value = textoInformado.value.toUpperCase();
  textoInformado.style.border = "solid 2px red";

  // document.getElementById('nome').value = document.getElementById('nome').value.toUpperCase();
}

// 8. Passar o mouse sobre
function passarMouse(objeto){
  objeto.innerHTML = "Obrigado!";
    objeto.style.backgroundColor = "#59a6d3";
        objeto.style.transition = "500ms";

}

function tirarMouse(objeto){
  objeto.innerHTML = "passe o mouse";
    objeto.style.backgroundColor = "#f9f9f9";
      objeto.style.transition = "1500ms"

}

// 9. Clicar, segurar e soltar
  function clicar(elemento){
    elemento.innerHTML = "Solte!";
    elemento.style.backgroundColor = "#2e3c5e";
    elemento.style.transition = "0.5s";
}

function soltar(elemento){
  elemento.innerHTML = "Clicar!";
  elemento.style.backgroundColor = "#d94a38"
  elemento.style.transition = "0.5s";
}

// Atributo (variável) Global 
let contador = 1;


// 10. Cobntador de cliques
function contadorClique(){
// contador++;
// contador += 5;
contador *= 5;

// Atualiza o display
document.querySelector('.display').value = contador;


// ---------------------------!!!-------------------------------
/*var valor = parseInt (document.querySelector('.display').value);

 valor = valor + 1;
valor++; //o mesmo que o comando de cima

document.querySelector('.display').value = valor;*/
// ---------------------------!!!-------------------------------
}

function zerarContador(){
  contador = 1;
  document.querySelector('.display').value = contador;
}
