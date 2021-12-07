// indice       0    1   2   3    4     5
/*
const notas = [7.8, 6.7, 10, 9.5, 7.7, 5.8];

console.log(notas);
console.log(notas[3]);
console.log(notas[5]);
console.log(notas[10]);
//pra mudar o valor do array/indicar o indice
notas[4] = 8.7;
console.log(notas[4]);
*/
//==========================================

//pode criar um array vazio e apos adicionar elementos nele
/*
const nomes = [];
nomes[0] = "Pedro";
nomes[1] = "Leticia";
nomes[2] = "Carlos";
nomes[3] = "Ronaldo";
nomes[4] = "Rebeca";
nomes[9] = "Tiago";
console.log(nomes);
*/

const numeros = [1, 2, 3];
console.log(typeof numeros);   //pra ver o tipo de elemento
numeros.push(4);    //funçao .push adiciona novos elementos dentro do array
numeros.push(5);
numeros.push(10.98);

console.log(numeros);
console.log(numeros.length);  //pra ver qts elementos tem o array
