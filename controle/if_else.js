/*if (true)
console.log('Executada');
else
 console.log('Nao executada');

 if (false)
 console.log('Nao executada');
 else 
 console.log('Executada');
*/

/*================================
const hora = 18;
let saudacao;

if (hora < 12) {
  saudacao = "Bom dia!!";
} else if (hora < 18) {
  //pode-se combinar o else junto com if
  saudacao = "Boa tarde";
} else if (hora < 22) {
  saudacao = "Boa Noite";
} else {
  saudacao = "Muito Tarde";
}
console.log(saudacao);
*/

const a = 10;
const b = 28;
const operacao = "+"; // + - * / %

let resultado;
//if ..else if.. else

if (operacao === "+") {
  //extreitamente igual === quando usa 3 =
  resultado = a + b;
} else if (operacao === "-") {
  resultado = a - b;
} else if (operacao === "*") {
  resultado = a * b;
} else if (operacao === "/") {
  resultado = a / b;
} else {
  resultado = a % b;
}
console.log(resultado);
