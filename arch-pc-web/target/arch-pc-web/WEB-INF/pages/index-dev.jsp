<!doctype html>
<html lang="en">

<%
    String prefix = "http://localhost:3000";
%>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://localhost:3000/assets/css/style.css">
    <link rel="stylesheet" href="http://localhost:3000/assets/css/antd.min.css">
    <!--[if lt IE 9]>
    <script src="http://localhost:3000/assets/js/polyfill/html5-shiv.js"></script>
    <script src="http://localhost:3000/assets/js/polyfill/es5-shim.min.js"></script>
    <script src="http://localhost:3000/assets/js/polyfill/es5-sham.min.js"></script>
    <![endif]-->
</head>

<body>
<!--[if IE]>
<div class="browserupgrade"><p>You are using an <strong>outdated</strong> browser. Please <a
        href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p></div>
<![endif]-->
<div id="react-root"></div>
<script>
    ENV = {
        cascadeEntry: '/hdk/cascade/query',
        containerId: 'react-root',
        menus:${menus}
    }
</script>
<!--[if lt IE 9]>
<script src="http://localhost:3000/assets/js/jquery-1.12.0.min.js"></script>
<script src="http://localhost:3000/assets/js/polyfill/ie-love.js"></script>
<![endif]-->
<!--[if gt IE 8]><!-->
<script src="http://localhost:3000/assets/js/jquery-2.2.0.min.js"></script>
<!--<![endif]-->
<!-- Dependencies -->
<script src="http://localhost:3000/assets/js/vendor.bundle.js"></script>
<!-- Main -->
<script src="http://localhost:3000/dist/bundle.js"></script>
</body>

</html>
