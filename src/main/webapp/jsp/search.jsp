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
<article>
<form action="search-page">

	<label for="gun">Gun</label><br /> 
	<input name="gun-name" type="search" placeholder="Gun name" /> <br /> 
	<input checked="checked" name="gun-type" type="checkbox" value="pistol" /> Pistol <br /> 
	<input name="gun-type" type="checkbox" value="rifle" /> Rifle <br />  
  <input name="gun-type" type="checkbox" value="rifle" /> Shotgun <br />  
	<label for="caliber">Caliber</label><br />
	<input name="caliber-value" type="number" placeholder="Caliber Value" /><br /> 
<select>
  <option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
<label for="manufacturer">Manufacturer</label><br />
	<input name="manufacturer-name" type="search" placeholder="Gun manufacturer" /><br /> 
<label for="magazine">Magazine Capacity</label><br />
	<input name="magazine-capacity" type="number" placeholder="Magazine capacity" /><br /> 
<select>
  <option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
<label for="muzzle">Muzzle length</label><br />
	<input name="muzzle-length" type="number" placeholder="Muzzle length" /><br /> 
<select>
 <option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
<label for="weigth">Gun weight</label><br />
	<input name="gun-weight" type="number" placeholder="Gun weight" /><br /> 
<select>
  <option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
<label for="boreaxisoffset">Bore axis offset</label><br />
	<input name="bore-axis-offset" type="number" placeholder="Bore axis offset" /><br /> 
<select>
<option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
<label for="dimension">Dimensions</label><br />
	<input name="dimension-x" type="number" placeholder="Dimension x" /><br />
	<input name="dimension-y" type="number" placeholder="Dimension y" /><br /> 
	<input name="dimension-z" type="number" placeholder="Dimension z" /><br />  
<select>
<option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
<label for="ccwbox">CCWBox</label><br />
	<input name="ccwbox-value" type="number" placeholder="CCWBox" /><br /> 
<select>
  <option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
  <button type="submit" value="Search">Search</button>
</form>
</article>
<article>
<form action="search-page">
<label for="ammo">Ammo</label><br /> 
	<input name="ammo-name" type="search" placeholder="Ammo name" /> <br />
	<button type="submit" value="Search">Search</button>
</form></article>
<p>${response}</p>
</body>
</html>
</jsp:root>