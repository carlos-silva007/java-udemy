//laços for infinitos

//for(;;) {
 //   }

 //for(; true; ){
     // }

/*for (let i = 7; i >= 3; i--){
    console.log(i);
}

console.log('FIM!');
*/

for (let i = 1; i <= 3; i++){
    let linha = "";
    for(let j = 1; j <= 3; j++) {
        linha += `[${i}, ${j}]`;
    }
    console.log(linha);
}


//laço for controlado por string

for(let s = '#'; s != '######'; s += '#') {
    console.log(s);
}