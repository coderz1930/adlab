<!DOCTYPE html>
<html>
    <head>
        <title>Login Screen</title>
        <script src="cordova.js"></script>
        <style>
            body { font-family: Arial, sans-serif; padding: 20px; }
            input, button { padding: 10px; width: 100%; margin: 10px 0; }
            #header { width: 100%; height: 150px; background: url('header_image.jpg') no-repeat center center; background-size: cover; }
            #form-container { padding: 20px; background-color: #f1f1f1; border-radius: 8px; }
        </style>
    </head>
    <body>
        <div id="header"></div>
        <div id="form-container">
            <label for="username">Username:</label>
            <input type="text" id="username" placeholder="Enter username" />
            <label for="password">Password:</label>
            <input type="password" id="password" placeholder="Enter password" />
            <button onclick="login()">Submit</button>
            <button onclick="resetForm()">Reset</button>
        </div>

        <script>
            function login() {
                const username = document.getElementById('username').value;
                const password = document.getElementById('password').value;
                if (username && password) {
                    alert('Login Successful!');
                } else {
                    alert('Please enter both username and password.');
                }
            }

            function resetForm() {
                document.getElementById('username').value = '';
                document.getElementById('password').value = '';
            }
        </script>
    </body>
</html>
