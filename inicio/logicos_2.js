const t1 = true;
const t2 = true;

let comprarTV50 = t1 && t2;
console.log('Vamos comprar a Tv 50"?', comprarTV50); //AND

let comprarTV32 = t1 !== t2;
console.log('Vamos comprar a Tv 32"?', comprarTV32); //XOR exclusivo

let tomarSorvete = t1 || t2;
console.log('Vamos comprar Sorvete"?', tomarSorvete); //OR 

let ficarEmCasa = !tomarSorvete;
console.log('Vamos ficar em Casa"?', ficarEmCasa); //NOT negação logica

