//Genera un número aleatorio entre un rango de enteros
function patito(minimo, maximo) {
  var numero = Math.floor(Math.random() * (maximo - minimo + 1) + minimo);
  return numero;
}

var piedra = 0;
var papel = 1;
var tijera = 2;

var opciones = ["Piedra ✊", "Papel 🖐", "Tijera ✌"];

var opcionUsuario;
var opcionMaquina = patito(0, 2);

opcionUsuario = prompt(
  "¿Qué eliges?\n✊Piedra✊: 0\n🖐Papel🖐: 1\n✌Tijera✌: 2",
  0
);

document.write("<h2>🏁Resultado del juego🏁:</h2>");

document.write("<p>Elegiste " + opciones[opcionUsuario] + "</p>");
document.write("<p>Javascript eligió " + opciones[opcionMaquina] + "</p>");

if (opcionUsuario == piedra) {
  if (opcionMaquina == piedra) {
    document.write("<p>Empate! 😃</p>");
  } else if (opcionMaquina == papel) {
    document.write("<p>Perdiste 😕:(</p>");
  } else if (opcionMaquina == tijera) {
    document.write("<p>Ganaste! 😉</p>");
  }
} else if (opcionUsuario == papel) {
  if (opcionMaquina == piedra) {
    document.write("<p>Ganaste! 😉</p>");
  } else if (opcionMaquina == papel) {
    document.write("<p>Empate! 😃</p>");
  } else if (opcionMaquina == tijera) {
    document.write("<p>Perdiste! 😕</p>");
  }
} else if (opcionUsuario == tijera) {
  if (opcionMaquina == piedra) {
    document.write("<p>Perdiste! 😕</p>");
  } else if (opcionMaquina == papel) {
    document.write("<p>Ganaste! 😉</p>");
  } else if (opcionMaquina == tijera) {
    document.write("<p>Empate! 😃</p>");
  }
} else {
  document.write("<p>Esa no es una opción 😣</p>");
}
