// Obtener elementos del DOM
const powerButton = document.getElementById('powerButton');
const bulbImage = document.getElementById('bulbImage');
const sizeRange = document.getElementById('sizeRange');
const intensityRange = document.getElementById('intensityRange');

// Agregar eventos a los controles
powerButton.addEventListener('click', togglePower);
sizeRange.addEventListener('input', adjustSize);
intensityRange.addEventListener('input', adjustIntensity);

// Función para encender/apagar la bombilla
function togglePower() {
  powerButton.classList.toggle('on');
  if (powerButton.classList.contains('on')) {
    bulbImage.src = 'on.jpg';
    bulbImage.alt = 'Bombilla encendida';
  } else {
    bulbImage.src = 'off.jpg';
    bulbImage.alt = 'Bombilla apagada';
  }
}

// Función para ajustar el tamaño de la bombilla
function adjustSize() {
  const size = sizeRange.value;
  bulbImage.style.width = `${size}px`;
}

// Función para ajustar la intensidad de la bombilla
function adjustIntensity() {
  const intensity = intensityRange.value;
  bulbImage.style.opacity = `${intensity / 100}`;
}
