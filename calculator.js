let currentValue = '';
let currentOperator = '';
let previousValue = '';

function appendValue(value) {
    currentValue += value;
    updateDisplay();
}

function setOperator(operator) {
    currentOperator = operator;
    previousValue = currentValue;
    currentValue = '';
    updateDisplay();
}

function calculateResult() {
    let result;

    switch (currentOperator) {
        case '+':
            result = parseFloat(previousValue) + parseFloat(currentValue);
            break;
        case '-':
            result = parseFloat(previousValue) - parseFloat(currentValue);
            break;
        case '*':
            result = parseFloat(previousValue) * parseFloat(currentValue);
            break;
        case '/':
            result = parseFloat(previousValue) / parseFloat(currentValue);
            break;
        default:
            result = currentValue;
    }

    currentValue = result.toString();
    currentOperator = '';
    previousValue = '';
    updateDisplay();
}

function clearDisplay() {
    currentValue = '';
    currentOperator = '';
    previousValue = '';
    updateDisplay();
}

function updateDisplay() {
    document.getElementById('display').value = currentValue;
}
