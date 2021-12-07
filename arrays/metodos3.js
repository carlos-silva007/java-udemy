//foreach passar função pro foreach, ele precisa de uma funcao

const numeros = [1, 2 , 3 , 4 , 5 , 6];
function praCadaElemento(elemento, indice, array){
    console.log(elemento, indice, array);
}
numeros.forEach(praCadaElemento);
