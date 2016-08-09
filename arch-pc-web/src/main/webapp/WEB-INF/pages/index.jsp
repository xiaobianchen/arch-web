<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${assets}/css/style.css">
    <link rel="stylesheet" href="${assets}/css/antd.min.css">
    <link rel="stylesheet" href="${app}/styles.css">
    <!--[if lt IE 9]>
    <script src="${assets}/js/polyfill/html5-shiv.js"></script>
    <script src="${assets}/js/polyfill/es5-shim.min.js"></script>
    <script src="${assets}/js/polyfill/es5-sham.min.js"></script>
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
        cascadeMock: false,
        containerId: 'react-root',
        menus:${menus}
    }
</script>
<!--[if lt IE 9]>
<script src="${assets}/js/jquery-1.12.0.min.js"></script>
<script src="${assets}/js/polyfill/ie-love.js"></script>
<![endif]-->
<!--[if gt IE 8]><!-->
<script src="${assets}/js/jquery-2.2.0.min.js"></script>
<!--<![endif]-->
<!-- Dependencies -->
<script src="${assets}/js/vendor.bundle.min.js"></script>
<!-- Main -->
<script src="${app}/bundle.js"></script>
</body>

</html>
