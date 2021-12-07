let temDinheiro = true;
let estaEnsolarado = true;
let carroEstaNaGaragem = false;


let resultadoE = '#1 (AND) Vai pro Shopping? ';
resultadoE += temDinheiro && estaEnsolarado;
console.log(resultadoE);

let resultadoOU = '#2 (OR) Vai pro Shopping? ';
resultadoOU += estaEnsolarado || carroEstaNaGaragem;
console.log(resultadoOU);

//xor ou exclusivo 
console.log(true != true);
console.log(true != false);
console.log(false != true);
console.log(false != false);

//negação logica usa-se ! antes do true ou false
console.log('Não verdadeiro: ' + !true);
console.log('Não false: ' + !false);