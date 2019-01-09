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
<title>KAL Index</title>
</head>
<body>
<article>
<form action="pages/search" id="gun-form">
	<label for="gun">Gun</label><br />
	 <input type="hidden" name="gun-control" value="0"/>
	<input checked="checked" name="gun-unit-type" type="checkbox" value="0" /> Imperial (ticked) / Metric <br />
	<input name="gun-name" type="search" placeholder="Gun name" /> <br /> 
	<input type="radio" name="gun-type" value="pistol" checked="checked"/> Pistol <br /> 
	<input type="radio" name="gun-type" value="rifle"/> Rifle <br />
	<input type="radio" name="gun-type" value="shotgun"/> Shotgun <br /> 
	<label for="gun-caliber">Caliber</label><br />
	<input name="gun-caliber-value" type="search" placeholder="Caliber Value" /><br /> 
<label for="gun-manufacturer">Manufacturer</label><br />
	<input name="gun-manufacturer-name" type="search" placeholder="Gun manufacturer" /><br /> 
<label for="gun-magazine">Magazine Capacity</label><br />
	<input name="gun-magazine-capacity" type="number" placeholder="Magazine capacity" /><br /> 
<select name="gun-magazine-select">
  <option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
<label for="gun-muzzle">Muzzle length</label><br />
	<input name="gun-muzzle-length" type="number" placeholder="Muzzle length" /><br /> 
<select name="gun-muzzle-select">
 <option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
<label for="weight">Gun weight</label><br />
	<input name="gun-weight" type="number" placeholder="Gun weight" /><br /> 
<select name="gun-weight-select">
  <option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
<label for="gun-boreaxisoffset">Bore axis offset</label><br />
	<input name="gun-bore-axis-offset" type="number" placeholder="Bore axis offset" /><br /> 
<select name="gun-bore-axis-offset-select">
<option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
<label for="gun-dimension">Dimensions</label><br />
	<input name="gun-dimension-x" type="number" placeholder="Dimension x" /><br />
	<select name="gun-dimension-x-select">
<option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
	<input name="gun-dimension-y" type="number" placeholder="Dimension y" /><br /> 
	<select name="gun-dimension-y-select">
<option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
	<input name="gun-dimension-z" type="number" placeholder="Dimension z" /><br />  
<select name="gun-dimension-z-select">
<option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
<label for="gun-ccwbox">CCWBox</label><br />
	<input name="gun-ccwbox" type="number" placeholder="CCWBox" /><br /> 
<select name="gun-ccwbox-select">
  <option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
 <button type="submit" value="Search">Search</button>
</form></article>
<article>
<form action="pages/search" id="ammo-form">
<label for="ammo">Ammo</label><br />
 <input type="hidden" name="ammo-control" value="1"/>
<input checked="checked" name="ammo-unit-type" type="checkbox" value="1" /> Imperial (ticked) / Metric <br />
	<input name="ammo-name" type="search" placeholder="Ammo name" /> <br />
<label for="ammo-caliber">Caliber</label><br />
	<input name="ammo-caliber-value" type="text" placeholder="Caliber Value" /><br /> 
<label for="ammo-type">Ammo type</label><br /> 
<select name="ammo-type-select">
  <option value="lrn">LRN</option>
  <option value="sj">SJ</option>
  <option value="sjhp">SJHP</option>
  <option value="swc">SWC</option>
  <option value="fmj">FMJ</option>
  <option value="jhp">JHP</option>
  <option value="wc">WC</option>
  <option value="rbcd">RBCD</option>
</select> <br/>
<label for="ammo-mass">Bullet mass</label><br /> 
	<input name="ammo-mass-value" type="number" placeholder="Bullet mass" /><br />  
<select name="ammo-mass-select">
  <option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
<label for="ammo-muzzle-velocity">Muzzle velocity</label><br />
	<input name="ammo-muzzle-velocity-value" type="number" placeholder="Muzzle velocity" /><br /> 
<select name="ammo-muzzle-velocity-select">
  <option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
<label for="ammo-muzzle-energy">Muzzle energy</label><br />
	<input name="ammo-muzzle-energy-value" type="number" placeholder="Muzzle energy" /><br /> 
<select name="ammo-muzzle-energy-select">
  <option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
<label for="ammo-ballistic-coefficient">Ballistic coefficient</label><br />
	<input name="ammo-ballistic-coefficient-value" type="number" placeholder="Ballistic coefficient" /><br /> 
<select name="ammo-ballistic-coefficient-select">
  <option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
<label for="ammo-muzzle-velocity-per-mm">Muzzle velocity per 10 mm</label><br />
	<input name="ammo-muzzle-velocity-per-mm-value" type="number" placeholder="Muzzle velocity per 10 mm" /><br /> 
<select name="ammo-muzzle-velocity-per-mm-select">
  <option value="&gt;">Bigger than</option>
  <option value="&lt;">Smaller than</option>
</select> <br/>
<button type="submit" value="Search">Search</button>
</form></article>
<p>${response}</p>
<p>${responseObject}</p>
</body>
</html>
</jsp:root>