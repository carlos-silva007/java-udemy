//#1: Funçao COM Parametro e COM Retorno
function somar(a, b){
    return a + b;
}
let resultado = somar(30, 56);
console.log(resultado);  //ou
console.log(somar(30, 56));   //ou
console.log(`O resultado final é: ${resultado}`);  //aqui usando crazes ``
console.log(`O resultado final é: ${somar(30, 56)}`);   //msm coisa

//#2: Funçao COM Parametro e SEM Retorno
function exibirMultiplicacao(a, b){
    console.log( a * b);
}
exibirMultiplicacao(10, 20);
exibirMultiplicacao(5, 10);

//#3: Funçao SEM Parametro e COM Retorno
function retornarDataAtual(){
    return new Date();
}
console.log(retornarDataAtual());

//#4: Funçao SEM Parametro e SEM Retorno
function exibirHoraAtual(){
    console.log(new Date().getHours());
}
exibirHoraAtual();

