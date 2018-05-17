<#import  "../Shared/globalFunction.ftl" as app>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${app.basePath}css/index.css">
    <script type="text/javascript" src="${basePath}/js/hello.js"></script>
</head>
<body>
<#include "../Shared/homt.ftl">
<#if name??>
<h2 class="hello-title">Hello ${name}!</h2>
<#else >
<h2 class="hello-title">Welcome to See the remarker demo</h2>
</#if>

<#if Infos??>
<ui>
    <#list Infos as info>
        <li>Name's ${info}</li>
    </#list>
</ui>
</#if>
<span>This page's url is: ${springMacroRequestContext.getRequestUri()}</span>
</body>
</html>