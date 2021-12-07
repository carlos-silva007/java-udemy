function executar(fn, n1, n2){
    if(typeof fn === "function"){
        console.log(fn(n1, n2));   //pode usar numero dentro do (fn)
    }
}
function somar(a, b){
    return a + b;
}
function subtrair(a, b){
    return a - b;
}
function multiplicar(a, b){
    return a * b;
}

executar(somar, 50, 40);
executar(subtrair, 50, 40);
executar(multiplicar, 50, 40);
