<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Polyglot Hello</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            body,h1,h2,h3,h4,h5,h6 {font-family: "Lato", sans-serif;}
            body, html {
                height: 100%;
                color: #777;
                line-height: 1.8;
            }

            /* Create a Parallax Effect */
            .bgimg-1 {
                background-attachment: fixed;
                background-position: center;
                background-repeat: no-repeat;
                background-size: cover;
            }

            /* First image (Logo. Full height) */
            .bgimg-1 {
                background-image: url('https://www.asianlanguageschool.com/wp-content/uploads/2018/06/Ni-Hao-LRES.jpg');
                min-height: 100%;
            }

            .w3-wide {letter-spacing: 10px;}
            .w3-hover-opacity {cursor: pointer;}

            /* Turn off parallax scrolling for tablets and phones */
            @media only screen and (max-device-width: 1600px) {
                .bgimg-1, .bgimg-2, .bgimg-3 {
                    background-attachment: scroll;
                    min-height: 400px;
                }
            }
        </style>
    </head>
    <body>
    <div class="bgimg-1 w3-display-container w3-opacity-min" id="home">
        <div class="w3-display-middle" style="white-space:nowrap;">
            <span class="w3-center w3-padding-large w3-black w3-xlarge w3-wide w3-animate-opacity">
                <jsp:useBean id="myBean" class="hello.MessageBean"/>
                <% String lang = request.getParameter("lang");
                    String gend = request.getParameter("gend");%>
                <jsp:setProperty name="myBean" property="gen" value="<%=gend%>"/>
                <jsp:setProperty name="myBean" property="msg" value="<%=lang%>"/>
                <jsp:getProperty name="myBean" property="msg"/> <%=request.getParameter("name")%>!
            </span>
            <br>
            <button class="w3-button w3-black " style="margin: 0; position: absolute; top: 180%; left: 50%; -ms-transform: translate(-50%, -50%); transform: translate(-50%, -50%);">
                <a href="index.html"><i class="fa fa-undo"></i></a>
            </button>
        </div>
    </div>
    </body>
</html>
