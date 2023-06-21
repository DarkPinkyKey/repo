/*Alerta mediante alert
window.alert("Keyla");
alert("Keyla");


/*Prompt
let sign = prompt("Introduce tu nombre");

if (sign.toLowerCase() == "Keyla") {
alert("Keyla");
}

/* Solucion Clase
const nombre = "Keyla";
alert(nombre);

prompt ("Introduce Nombre")(nombre){
    return nombre;
}
*/

/* Ejercicos 01 (19/06)*/

/*Const*/

/* Ejercicios diapo 64*/
/*Arrow
const saludar = () => {
    console.log("Keyla Batzin");
}
saludar();
*/

/* Nombre sin return
const holi = function (){
    console.log("holi");
}
holi();

*/

/*ForEach
const array = ['1','2','3','4','5'];
array.forEach(element => console.log(element));
*/

/*Ejercico diapo 74 (19/06)
const numero = console.log
if (numero = 1){
    console.log("cara");
}else {
    console.log("cruz");
}

console.log(Math.round(Math.random())); 
*/

//Ejercicio diapo 81 Ej-1
/*
let mesAño = 4; //Introdcuce un numero del 1 al 12

switch (mesAño) {
  case 1:
    console.log("Enero");
    break;
  case 2:
    console.log("Febrero");
    break;
  case 3:
    console.log("Marzo");
    break;
  case 4:
    console.log("Abril");
    break;
  case 5:
    console.log("Mayo");
    break;
  case 6:
    console.log("Junio");
    break;
  case 7:
    console.log("Julio");
    break;
  case 8:
    console.log("Agosto");
    break;
  case 9:
    console.log("Septiembre");
    break;
  case 10:
    console.log("Octubre");
    break;
  case 11:
    console.log("Noviembre");
    break;
  case 12:
    console.log("Diciembre");
    break;
  default:
    console.error("No es un mes del año :(");
    break;
}
*/

//Ejercico 2 diapo 81
//SIN ACABAR
/*
let numeroString = 1;
function transformarNumero(numeroString) {
    var numero;
  
    switch (numeroString) {
      case "uno":
        numero = 1;
        break;
      case "dos":
        numero = 2;
        break;
      case "tres":
        numero = 3;
        break;
      case "cuatro":
        numero = 4;
        break;
      case "cinco":
        numero = 5;
        break;
      default:
        numero = NaN; // Si no se introduce un número válido, se asigna NaN (Not a Number)
    }
  
    return numero;
  }
  
  var numeroString = prompt("Introduce un número del uno al cinco en texto:");
  var numero = transformarNumero(numeroString);
  
  console.log("El número transformado es: " + numero);
*/

//Ejercicio Math diapo 84 Ejercico 1
//ACABADO
/*
function getRandomInt(max) {
  return Math.floor(Math.random() * max);
}
console.log(getRandomInt(2));
*/

//Ejercico 2 diapo 84
//SIN ACABAR
/*
Math.PI
x = Math.round(Math.PI);
*/

//Ejercicio String diapo 87 Ejercicio 1




// Ejercico Array diapo 108 (12/06)  Ej 1
/*
const arr = ["🍔","🌯","🍣","🍕","🍜","🧇","🍙","🍘","🍡"];
console.log(arr.fill("🍺",3,arr.length));
*/

//Ejercico 2 diapo 108//
/*
const arr = ["🍕", "🍕", "🍍", "🍕", "🍕"];
let stock = 0;
arr.find(item => {
    if (item == "🍍"){
        stock++;
    };
});
if(stock != 0){console.log("Tenemos" + " "+ stock + "🍍");}
*/

//Ejercico 3 diapo 108//
//ACABADO
/*
const array = ["🍕", "🍕", "🍍", "🍕", "🍕"]; 

array.forEach((item, index, arr) => {
    item!= "🍍"?true:arr.splice(index, 1);
});
console.log(array)
*/

//Ejercicio 4 diapo 108
//ACABADO
/*
let array = ["🍇", "🍋", "🍇", "🍋", "🍇"];

const newArr = array.map((element) => {
	if (element === "🍇") {
		return "🍡";
	}
	return element;
});
console.log(newArr);
*/

//Ejercicio 5 diapo 108
/*
let arr5 = ["🌺", "🍀", "🌺", "🍀", "🌺", "🍀"];

const result = [];

arr5.map((item, index, array) => {
return item === "🌺" && array[index + 1] === "🍀"
? result.push(item, "🍂")
: result.push(item);
});
console.log(result);
*/

//Ejercicio 6 diapo 108
//ACABADO
/*
array = ["🎴", "🎴", "🎴", "🃏", "🎴", "🎴", "🎴"];
result = [];

array.forEach((item, index, array) => {
    item === array[index + 1]
    ? result.push(item, "🃏") //🎴🃏
    : result.push(item); //🎴
return result;
});
console.log(result);
*/


