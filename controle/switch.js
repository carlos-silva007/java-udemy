// serve pra ter multiplas seleçoes dentro do codigo

let nota = 9.4;

//math.ceil arredonda pra cima
switch (Math.ceil(nota)) {
  case 10:
  case 9:
  case 8:
  case 7:
    console.log("Parabens!!");
    break;
  case 6:
  case 5:
    console.log("Recupareção");
    break;
  case 4:
  case 3:
  case 2:
    console.log("Reprovado");
    break;
  case 1:
  case 0:
    console.log("Muito Reprovado");
    break;
  default:
    //quando for informado nota que nao esta no codigo tipo nota 12
    console.log("Nota Invalida");
}
console.log('FIM!!!!')