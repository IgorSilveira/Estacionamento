<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background:radial-gradient(white 5%, #f3f3f3 95%);">
        <form name="form1" action="Login">
            <table width="400px" cellpadding="5" celspacing="1" bgcolor="#dadada" align="center" style="border-radius:10px;margin-top:220px">
                <tr bgcolor="#f3f3f3">
                    <td style="text-align:center;vertical-align:middle;border-radius:10px;">
                        <b>LOGIN</b>
                    </td>
                </tr>
                <tr bgcolor="#ffffff">
                    <td style="text-align:center">
                        <table border="0" align="center">
                            <tr>
                                <td style="text-align:center" colspan="2"><p> <% String msg = request.getParameter("mensagem"); if(msg!=null) out.print(msg); %> </p></td>
                            </tr>
                            <tr>
                                <td style="text-align:right"><b>Login:</b></td>
                                <td><input type="text" name="Login" maxlenght="50" size="30"></td>
                            </tr>
                            <tr>
                                <td style="text-align:right"><b>Senha:</b></td>
                                <td style="text-align:left"><input type="password" name="senha" size="30"></td>
                            </tr>
                            <tr>
                                <td colspan="2"><input type="submit" name="Envia" value="Enviar Dados"></td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
         </form>
    </body>
</html>
