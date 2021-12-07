const cliente = {
    codigo: 16202,
    nome: 'Carlos',
    vip: true,
    endereco: {
        logradouro: 'Rua Carlos Fiolo',
        numero: 176,
        complemento: 'Apto 101 Bloco B',
        pontosRef: [
            'Hospital Vera Cruz',
            'Shopping Unimart',
        ]

    },
    nomeFilhos: ['Bia', 'Raquel', 'Isabel']

};
console.log(cliente['endereco']['logradouro']);
console.log(cliente.endereco.logradouro);
console.log(cliente.endereco.pontosRef[0]);
