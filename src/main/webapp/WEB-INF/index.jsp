<%--
  Created by IntelliJ IDEA.
  User: sahil
  Date: 10/6/18
  Time: 11:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>

    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js">
    </script>
    <script src="https://apis.google.com/js/client:platform.js?onload=start" async defer>
    </script>
    <script>
        function start() {
            gapi.load('auth2', function() {
                auth2 = gapi.auth2.init({
                    client_id: '164955192554-24p4vju3lf1i6sjvvs0p6iaj4i7pc062.apps.googleusercontent.com',
                    // Scopes to request in addition to 'profile' and 'email'
                    scope: 'https://www.googleapis.com/auth/drive'
                });
            });
        }
    </script>

  </head>
  <body>

  <button id="signinButton">Sign in with Google</button>

  <script>
      $('#signinButton').click(function() {
          // signInCallback defined in step 6.
          auth2.grantOfflineAccess().then(signInCallback);
      });
  </script>
  <script>
      function signInCallback(authResult) {
          if (authResult['code']) {

              // Hide the sign-in button now that the user is authorized, for example:
              $('#signinButton').attr('style', 'display: none');
              // Send the code to the server
              // var URL="";

              $.post('/google', {code: authResult['code']},
                  function (returnedData) {
                      alert(returnedData);
                  });
          }

      }
  </script>

  </body>
</html>
