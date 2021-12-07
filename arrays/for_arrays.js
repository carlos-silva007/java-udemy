/*
const numeros = [1, 2, 3, 4, 5, 6, 7, 455];

for(let i = 0; i < numeros.length; i++){
    console.log(numeros[i]);
}
*/

//utilizando o FOREACH mais facil pra percorrer o arrays
const notas = [1, 2, 4, 6, 8, 10, 13, 16, 18];
for( let nota of notas){
    console.log(nota);
}

let valores = '';
for(let nota of notas){   //apresenta todos os arrays (valores)
    valores += nota + ' ';
}
console.log(valores);

let indices = '';
for(let indice in notas){  //ver quantos elementos dentro do array(indices)
    indices += indice + ' ';
}
console.log(indices);

