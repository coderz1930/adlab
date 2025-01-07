
<!DOCTYPE html>
<html>
  <head>
    <title>Unit Converter</title>
    <link rel="stylesheet" href="styles.css">
  </head>
  <body>
    <h1>Unit Converter</h1>
    <label for="value">Enter Value:</label>
    <input type="number" id="value" placeholder="Value" />
    <select id="unit">
      <option value="kmToMiles">Kilometers to Miles</option>
      <option value="kgToPounds">Kilograms to Pounds</option>
    </select>
    <button onclick="convert()">Convert</button>
    <p id="result"></p>
    <script src="cordova.js"></script>
    <script src="converter.js"></script>
  </body>
</html>

Create converter.js to handle the conversion:

function convert() {
  var value = document.getElementById('value').value;
  var unit = document.getElementById('unit').value;
  var result = '';

  if (unit === 'kmToMiles') {
    result = (value * 0.621371).toFixed(2) + ' miles';
  } else if (unit === 'kgToPounds') {
    result = (value * 2.20462).toFixed(2) + ' pounds';
  }
  
  document.getElementById('result').innerText = result;
}
