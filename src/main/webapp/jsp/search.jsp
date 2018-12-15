<?xml version="1.0" encoding="ISO-8859-2" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.1">
	<jsp:directive.page contentType="text/html; charset=ISO-8859-2" 
		pageEncoding="ISO-8859-2" session="false"/>
	<jsp:output doctype-root-element="html"
		doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
		omit-xml-declaration="true" />
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Gun Search Engine</title>
</head>
<body>
<form action="search-page">
	<label for="gun">Gun</label><br /> 
	<input name="name" type="text" placeholder="Gun name" /> <br /> 
	<input checked="checked" name="gun-type" type="checkbox" value="pistol" /> Pistol <br /> 
	<input name="gun-type" type="checkbox" value="rifle" /> Rifle <br />  
  <input name="gun-type" type="checkbox" value="rifle" /> Shotgun <br />  
	<label for="caliber">Caliber</label><br /> 
	<input name="democheckbox" type="checkbox" value="1" /> Checkbox<br /> 
	<label for="caliber">Caliber</label><br /> 
  <button type="submit" value="Search">Search</button>
</form>
<p>${response}</p>
</body>
</html>
</jsp:root>