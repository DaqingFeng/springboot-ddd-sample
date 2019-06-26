<#assign path=request.contextPath >
<#if !path?ends_with("/")>
    <#assign path=path+"/" >
</#if>
<#assign basePath=path >