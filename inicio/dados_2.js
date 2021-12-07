var preco = 19.90; 

let desconto = 0.4;

console.log(19.9 * 0.6);  // multiplicacao pra saber a porcentagem

console.log(preco * (1 - desconto)); // mesma conta porem ele da prioridade pra conta dentro dos ()

let precoComDesconto = preco * (1 - desconto);
console.log(precoComDesconto);


let nome = "Caderno ";
let categoria = "Papelaria "
console.log("Produto:" + nome + ", Categoria: " + categoria + ",Preço" + preco + ", Desconto" + desconto);
