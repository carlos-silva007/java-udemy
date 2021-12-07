//funçao construtora -> objeto
/*function produto(){
    console.log(this);
}
const p1 = new produto();

console.log(typeof p1);
*/
function Data(dia = 10, mes = 12, ano = 2021){
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
    this.exibir = function(){
        return `${this.dia}/${this.mes}/${this.ano}`;
    }
}
const d1 = new Data();
const d2 = new Data(24, 12, 2022);
const d3 = new Data(30, 11, 2024);


console.log(typeof d1);
console.log(d1);
