<%@page import="com.williamdsw.jaxws.beans.Person"%>
<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="samplePersonServiceProxyid" scope="session" class="com.williamdsw.jaxws.services.PersonServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
samplePersonServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = samplePersonServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        samplePersonServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.williamdsw.jaxws.services.PersonService getPersonService10mtemp = samplePersonServiceProxyid.getPersonService();
if(getPersonService10mtemp == null){
%>
<%=getPersonService10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String age_2id=  request.getParameter("age20");
        int age_2idTemp  = Integer.parseInt(age_2id);
        String name_3id=  request.getParameter("name22");
            java.lang.String name_3idTemp = null;
        if(!name_3id.equals("")){
         name_3idTemp  = name_3id;
        }
        String id_4id=  request.getParameter("id24");
        int id_4idTemp  = Integer.parseInt(id_4id);
        %>
        <jsp:useBean id="com1williamdsw1jaxws1beans1Person_1id" scope="session" class="com.williamdsw.jaxws.beans.Person" />
        <%
        com1williamdsw1jaxws1beans1Person_1id.setAge(age_2idTemp);
        com1williamdsw1jaxws1beans1Person_1id.setName(name_3idTemp);
        com1williamdsw1jaxws1beans1Person_1id.setId(id_4idTemp);
        boolean addPerson15mtemp = samplePersonServiceProxyid.addPerson(com1williamdsw1jaxws1beans1Person_1id);
        String tempResultreturnp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addPerson15mtemp));
        %>
        <%= tempResultreturnp16 %>
        <%
break;
case 26:
        gotMethod = true;
        String id_5id=  request.getParameter("id29");
        int id_5idTemp  = Integer.parseInt(id_5id);
        boolean deletePerson26mtemp = samplePersonServiceProxyid.deletePerson(id_5idTemp);
        String tempResultreturnp27 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deletePerson26mtemp));
        %>
        <%= tempResultreturnp27 %>
        <%
break;
case 31:
        gotMethod = true;
        com.williamdsw.jaxws.beans.Person[] getAllPersons31mtemp = samplePersonServiceProxyid.getAllPersons();
if(getAllPersons31mtemp == null){
%>
<%=getAllPersons31mtemp %>
<%
}else{
        String tempreturnp32 = null;
        if(getAllPersons31mtemp != null){
        java.util.List<Person> listreturnp32= java.util.Arrays.asList(getAllPersons31mtemp);
        for (Person person : listreturnp32) {
        	%>
        	<%= person.getId() + " :: " + person.getName () + " :: " + person.getAge() %>
        	<%
        }
        }
        %>
        <%
}
break;
case 34:
        gotMethod = true;
        String id_6id=  request.getParameter("id43");
        int id_6idTemp  = Integer.parseInt(id_6id);
        com.williamdsw.jaxws.beans.Person getPerson34mtemp = samplePersonServiceProxyid.getPerson(id_6idTemp);
if(getPerson34mtemp == null){
%>
<%=getPerson34mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">age:</TD>
<TD>
<%
if(getPerson34mtemp != null){
%>
<%=getPerson34mtemp.getAge()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getPerson34mtemp != null){
java.lang.String typename39 = getPerson34mtemp.getName();
        String tempResultname39 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename39));
        %>
        <%= tempResultname39 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getPerson34mtemp != null){
%>
<%=getPerson34mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>