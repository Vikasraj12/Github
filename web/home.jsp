<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
       <style>
            header
            {
                height: 100px;
                background-color: wheat;
            }
            main
            {
                height: 500px;
            }
            main iframe
            {
                width: 100%;
                background-color: gray;
                height: 500px;
            }
            footer
            {
                height: 100px;
                background-color: wheat;
            }
            table td{
                background-color: seagreen;
                border-radiud: 10px;
                padding: 3px;
                font-size: 25px;
            }
            table td:hover{
                background-color: slategray;
                border-radiud: 10px;
            }
            
            table td a{
                text-decoration: none;
                color: white;
                
            }
        </style>
    </head>
    <body>
        <header>
            <span><img src="images/Logo.png" height="100" width="100" alt="Logo" style="float:left; border-radius:100px;"></span>
                <span style="font-size:30px; font-weight: bold;">Its a sample project that is useless</span>
                <table>
                    <tr>
                        <td><a href="home.jsp" target="ifr">Home</a></td>
                        <td><a href="about.html" target="ifr">About Us</a></td>
                        <td><a href="login.jsp" target="ifr">Login</a></td>
                        <td><a href="register.jsp" target="ifr">Register</a></td>
                    </tr>
                </table>
        </header>
        <main>
            <iframe name="ifr" src="images/Logo.png">
                
            </iframe>
        </main>
        <footer></footer>>
    </body>
</html>
