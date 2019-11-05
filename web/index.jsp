<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- jstl
       作用： 提高jsp中逻辑代码的编写逻辑，使用标签。
       使用： JSTL 的核心标签库（重点）
              JSTL 的格式化标签库（讲解）
              JSTL 的SQL标签库（了解）
              JSTL 的函数标签库（了解）
              JSTL的XML标签库（了解）
        JSTL 的核心：标签库
            1 导jar包
            2  声明jstl标签库的引入
            <c:out value="数据" default="默认值"></c:out>
            作用： 将数据输出给客户端

            <c:set var="键名" value="数据" scope="page"></c:set>
            作用： 存储数据到作用域对象中  scope表示要存储的作用域

            <c:remove var="键名" scope="page"></c:remove>
    删除作用域中的数据  若不指定作用域 则四个作用域的符合要求的数据都会删掉

<c:if test="${a>3}">
    <b>sldkjasd</b>
</c:if>
作用 进行逻辑判断 需要依赖于EL的逻辑运算 表达式涉及到的数据要从作用域中获取
--%>
<c:out value="数据" default="默认值"></c:out>
<c:set var="键名" value="set数据" scope="page"></c:set>
<c:out value="${键名}"></c:out>
<%--<c:remove var="键名" scope="page"></c:remove>--%>
<br />
<c:out value="${键名}"></c:out>
<hr />
<c:set var="a" value="8"></c:set>
<c:if test="${a>3}">
    <b>sldkjasd</b>
</c:if>
<c:choose>
    <c:when test=""></c:when>
    <c:when test=""></c:when>
    <c:when test=""></c:when>
    <c:when test=""></c:when>
    <c:otherwise></c:otherwise>
</c:choose>
<table>
    <tr>
        <td>课程</td>
        <td>教师</td>
        <td>价格</td>
        <td>重要性</td>
    </tr>
    <tr>
        <td>java</td>
        <td>123</td>
        <td>111</td>
        <td>09809</td>
    </tr>
</table>
<%--循环标签begin 为循环开始位置 end为循环结束位置
                step为步长 varstatus 表示循环的数据
                对循环内容进行处理 --%>
<c:forEach begin="1" end="4" step="2" varStatus="vs">
    1234${vs.index}--${vs.count}--${vs.first}--${vs.last}  <br/>

</c:forEach>
<%
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("123");
    arrayList.add("456");
    arrayList.add("789");
    request.setAttribute("list",arrayList);
%>
<%--ltems 声明要遍历的对象 结合EL表达式获取对象
    var 声明变量记录每次循环的结果存储在作用域中  用EL表达式获取
--%>
<c:forEach items="${list}" var="str">
    ${str}<br>
</c:forEach>
<%--创建表格--%>
<table>
    <tr>
        <td>课程</td>
        <td>教师</td>
        <td>价格</td>
        <td>重要性</td>
    </tr>
    <c:forEach items="list" var="s">
        <tr>
            <td>${s}</td>
            <td>${s}</td>
            <td>${s}</td>
            <td>${s}</td>
        </tr>
    </c:forEach>

</table>