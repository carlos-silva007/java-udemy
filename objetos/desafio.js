/*
const data = {
    dia: 21,
    mes: 12,
    ano: 2021,
    exibirData : function(){
        return `${this.dia}/${this.mes}/${this.ano}`
    }
}
console.log(data.exibirData()); //nao esquecer dos () pra invocar a funcao
*/

const d1 = {
    dia: 10,
    mes: 09,
    ano: 2021,
    exibirData : function(){
        return `${this.dia}/${this.mes}/${this.ano}`
    }
}
console.log(d1.exibirData());

const d2 = {
    dia: 11,
    mes: 06,
    ano: 2022,
    exibirData : function(){
        return `${this.dia}/${this.mes}/${this.ano}`
    }
}
console.log(d2.exibirData());
