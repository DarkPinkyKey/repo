// Obtiene las referencias a las barras de estado
const statusBars = document.querySelectorAll('.status-bar');

// Objeto que contiene la información de las barras de estado
const statusInfo = {
  'health': { element: document.getElementById('health-bar'), value: 100 },
  'food': { element: document.getElementById('food-bar'), value: 100 },
  'sleep': { element: document.getElementById('sleep-bar'), value: 100 },
  'play': { element: document.getElementById('play-bar'), value: 100 }
};

// Función para actualizar el ancho de las barras de estado
function updateStatusBars() {
  for (const key in statusInfo) {
    const status = statusInfo[key];
    status.element.style.width = `${status.value}%`;
  }
}

// Función para disminuir el valor de las barras de estado con el tiempo
function decreaseStatusBars() {
  for (const key in statusInfo) {
    const status = statusInfo[key];
    status.value -= 10;

    if (status.value <= 0) {
      status.value = 0;
      clearInterval(interval);
      alert(`Tu Tamagotchi se quedó sin ${key} :(`);
    }
  }

  updateStatusBars();
}

// Función para aumentar el valor de una barra de estado
function increaseStatusBar(barKey) {
  const status = statusInfo[barKey];
  status.value += 20;

  if (status.value > 100) {
    status.value = 100;
  }

  updateStatusBars();
}

// Asigna eventos de clic a los botones de aumento
document.getElementById('health-btn').addEventListener('click', () => {
  increaseStatusBar('health');
});

document.getElementById('food-btn').addEventListener('click', () => {
  increaseStatusBar('food');
});

document.getElementById('sleep-btn').addEventListener('click', () => {
  increaseStatusBar('sleep');
});

document.getElementById('play-btn').addEventListener('click', () => {
  increaseStatusBar('play');
});

// Inicia un intervalo que disminuye los valores de las barras de estado cada 2 segundos
const interval = setInterval(decreaseStatusBars, 2000);

// Agrega la funcionalidad de arrastrar y ajustar las posiciones de las barras de estado
statusBars.forEach(bar => {
  bar.addEventListener('mousedown', function(event) {
    const initialY = event.clientY;
    const initialTop = parseInt(bar.style.top) || 0;

    function handleMouseMove(event) {
      const newY = event.clientY;
      const delta = newY - initialY;
      bar.style.top = `${initialTop + delta}px`;
    }

    function handleMouseUp() {
      window.removeEventListener('mousemove', handleMouseMove);
      window.removeEventListener('mouseup', handleMouseUp);
    }

    window.addEventListener('mousemove', handleMouseMove);
    window.addEventListener('mouseup', handleMouseUp);
  });
});
