function criarData(dia, mes, ano) {
  return {
    dia: dia,
    mes: mes,
    ano: ano,
    //pode simplicar como abaixo
    //dia,
    //mes,
    //ano,
    exibir: function () {   //e pra funcao pode faze: exibir(){
      return `${this.dia}/${this.mes}/${this.ano}`;
    },
  };
}
//criando varivel e adicionado valor na funcao
const d1 = criarData(09, 10, 1987);
const d2 = criarData(12, 05, 2021);
const d3 = criarData(22, 09, 2023);

console.log(d1.exibir());
console.log(d2.exibir());
console.log(d3.exibir());


