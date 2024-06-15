let carrito = [];

function agregarAlCarrito(elemento) {
    const plato = elemento.dataset.plato;
    const cantidad = parseInt(elemento.parentNode.querySelector('.quantity-input__field').value);

    const platoExistente = carrito.find(item => item.plato.id === plato.id);
    if (platoExistente) {
        platoExistente.cantidad += cantidad;
    } else {
        carrito.push({ plato, cantidad });
    }

    console.log(carrito);
}

function aumentarCantidad(elemento) {
    const inputCantidad = elemento.parentNode.querySelector('.quantity-input__field');
    inputCantidad.value = parseInt(inputCantidad.value) + 1;
}

function disminuirCantidad(elemento) {
    const inputCantidad = elemento.parentNode.querySelector('.quantity-input__field');
    if (inputCantidad.value > 1) {
        inputCantidad.value = parseInt(inputCantidad.value) - 1;
    }
}