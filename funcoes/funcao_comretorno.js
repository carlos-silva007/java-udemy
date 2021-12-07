function sempreRetornaUm() {
  return 1;
}
let valor = sempreRetornaUm() + 995;
console.log(valor);

function textoOuNumero(retornaTexto) {
 return retornaTexto ? "Sou um texto!" : 123;
 
    /* if (retornaTexto) {            pode usar o if ou tenario ? :
    return "Sou um Texto";
  } else {
    return 123;
  } */

}
let texto = textoOuNumero(true);
console.log(texto);
