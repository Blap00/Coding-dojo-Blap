var users = [
    {
        name: "Michael",
        age: 37
    },
    {
        name: "John",
        age: 30
    },
    {
        name: "David",
        age: 27
    }
];
/*
Lo que debe imprimir;
Michael - 37
John - 30
David - 27
*/
function JugandoObjetos(users) {
    for (let i = 0; i < users.length; i++) {
        console.log(users[i].name, ' - ', users[i].age);
    }
}

JugandoObjetos(users);