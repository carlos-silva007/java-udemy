/*
const produto = {
    nome: 'Caneta',
    preco: 9.99,
    desconto: 0.80,
};

//pra acessar/exibir um objeto usa-se como abaixo
console.log(produto['nome']);  //ele exibe Caneta ou
console.log(produto.nome);
console.log(produto.desconto);
*/

const produto = {
    nome: 'iPad',
    preco: 5600,
    desconto: 0.15,
    precoComDesconto: function(){     
        return this.preco * (1 - this.desconto)   //usar this pra referenciar
    }                                             //e calcular o desconto 
};
console.log(produto.nome);
console.log(produto.precoComDesconto());   //pra invocar a funcao coloca mais()
