const data = {
    dia: 25,
    mes: 12,
    ano: 2021,
};
//exibir objeto de maneira diferente e todos de uma vez usa-se crazes ``e ${}
console.log(`${data.dia}/${data.mes}/${data.ano}`);

//alterar valor dentro do objeto
data.dia = 29;
data.mes = 05;
console.log(`${data.dia}/${data.mes}/${data.ano}`);