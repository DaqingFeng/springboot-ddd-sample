<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>
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
<label>${springMacroRequestContext.getLocale()}</label>
</body>
</html>