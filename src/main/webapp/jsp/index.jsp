<?xml version="1.0" encoding="ISO-8859-2" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.1">
	<jsp:directive.page contentType="text/html; charset=ISO-8859-2" 
		pageEncoding="ISO-8859-2" session="false"/>
	<jsp:output doctype-root-element="html"
		doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
		omit-xml-declaration="true" />
<html>
  <head>
    <title>Home</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <link href="resources/css/jquery-ui-themes.css" type="text/css" rel="stylesheet"/>
    <link href="resources/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="data/styles.css" type="text/css" rel="stylesheet"/>
    <link href="files/home/styles.css" type="text/css" rel="stylesheet"/>
    <script src="resources/scripts/jquery-1.7.1.min.js"></script>
    <script src="resources/scripts/jquery-ui-1.8.10.custom.min.js"></script>
    <script src="resources/scripts/prototypePre.js"></script>
    <script src="data/document.js"></script>
    <script src="resources/scripts/prototypePost.js"></script>
    <script src="files/home/data.js"></script>
    <script type="text/javascript">
      $axure.utils.getTransparentGifPath = function() { return 'resources/images/transparent.gif'; };
      $axure.utils.getOtherPath = function() { return 'resources/Other.html'; };
      $axure.utils.getReloadPath = function() { return 'resources/reload.html'; };
    </script>
  </head>
  <body>
    <div id="base" class="">

      <!-- RodzajBroni (Droplist) -->
      <div id="u0" class="ax_default droplist" data-label="RodzajBroni" title="Rodzaj Broni">
        <select id="u0_input" title="Rodzaj Broni">
          <option value="Pistolet">Pistolet</option>
          <option value="Strzelba">Strzelba</option>
          <option value="Karabin">Karabin</option>
        </select>
      </div>

      <!-- Nagłówek (Rectangle) -->
      <div id="u1" class="ax_default heading_1" data-label="Nagłówek">
        <div id="u1_div" class=""></div>
        <div id="u1_text" class="text ">
          <p><span>Wprowadź dane</span></p>
        </div>
      </div>

      <!-- ListaKalibrow (Group) -->
      <div id="u2" class="ax_default ax_default_hidden" data-label="ListaKalibrow" style="display:none; visibility: hidden" data-left="0" data-top="0" data-width="0" data-height="0">

        <!-- Dropdown_Container (Rectangle) -->
        <div id="u3" class="ax_default shape" data-label="Dropdown_Container">
          <div id="u3_div" class=""></div>
        </div>

        <!-- Kaliber1 (Group) -->
        <div id="u4" class="ax_default" data-label="Kaliber1" data-left="0" data-top="0" data-width="0" data-height="0">

          <!-- item1 (Rectangle) -->
          <div id="u5" class="ax_default button" data-label="item1">
            <div id="u5_div" class=""></div>
            <div id="u5_text" class="text ">
              <p><span>.22/.223</span></p>
            </div>
          </div>

          <!-- check1 (Dynamic Panel) -->
          <div id="u6" class="ax_default" data-label="check1">
            <div id="u6_state0" class="panel_state" data-label="State1" style="">
              <div id="u6_state0_content" class="panel_state_content">

                <!-- Unnamed (Shape) -->
                <div id="u7" class="ax_default icon">
                  <img id="u7_img" class="img " src="images/home/u7.png"/>
                </div>
              </div>
            </div>
            <div id="u6_state1" class="panel_state" data-label="State2" style="visibility: hidden;">
              <div id="u6_state1_content" class="panel_state_content">

                <!-- Unnamed (Shape) -->
                <div id="u8" class="ax_default icon">
                  <img id="u8_img" class="img " src="images/home/u8.png"/>
                </div>
              </div>
            </div>
          </div>
        </div>

        <!-- Kaliber2 (Group) -->
        <div id="u9" class="ax_default" data-label="Kaliber2" data-left="0" data-top="0" data-width="0" data-height="0">

          <!-- item2 (Rectangle) -->
          <div id="u10" class="ax_default button" data-label="item2">
            <div id="u10_div" class=""></div>
            <div id="u10_text" class="text ">
              <p><span>7.62mm</span></p>
            </div>
          </div>

          <!-- check2 (Dynamic Panel) -->
          <div id="u11" class="ax_default" data-label="check2">
            <div id="u11_state0" class="panel_state" data-label="State1" style="">
              <div id="u11_state0_content" class="panel_state_content">

                <!-- Unnamed (Shape) -->
                <div id="u12" class="ax_default icon">
                  <img id="u12_img" class="img " src="images/home/u7.png"/>
                </div>
              </div>
            </div>
            <div id="u11_state1" class="panel_state" data-label="State2" style="visibility: hidden;">
              <div id="u11_state1_content" class="panel_state_content">

                <!-- Unnamed (Shape) -->
                <div id="u13" class="ax_default icon">
                  <img id="u13_img" class="img " src="images/home/u8.png"/>
                </div>
              </div>
            </div>
          </div>
        </div>

        <!-- Kaliber3 (Group) -->
        <div id="u14" class="ax_default" data-label="Kaliber3" data-left="0" data-top="0" data-width="0" data-height="0">

          <!-- item3 (Rectangle) -->
          <div id="u15" class="ax_default button" data-label="item3">
            <div id="u15_div" class=""></div>
            <div id="u15_text" class="text ">
              <p><span>7.65mm</span></p>
            </div>
          </div>

          <!-- check3 (Dynamic Panel) -->
          <div id="u16" class="ax_default" data-label="check3">
            <div id="u16_state0" class="panel_state" data-label="State1" style="">
              <div id="u16_state0_content" class="panel_state_content">

                <!-- Unnamed (Shape) -->
                <div id="u17" class="ax_default icon">
                  <img id="u17_img" class="img " src="images/home/u7.png"/>
                </div>
              </div>
            </div>
            <div id="u16_state1" class="panel_state" data-label="State2" style="visibility: hidden;">
              <div id="u16_state1_content" class="panel_state_content">

                <!-- Unnamed (Shape) -->
                <div id="u18" class="ax_default icon">
                  <img id="u18_img" class="img " src="images/home/u8.png"/>
                </div>
              </div>
            </div>
          </div>
        </div>

        <!-- Kaliber4 (Group) -->
        <div id="u19" class="ax_default" data-label="Kaliber4" data-left="0" data-top="0" data-width="0" data-height="0">

          <!-- item4 (Rectangle) -->
          <div id="u20" class="ax_default button" data-label="item4">
            <div id="u20_div" class=""></div>
            <div id="u20_text" class="text ">
              <p><span>8.58mm</span></p>
            </div>
          </div>

          <!-- check4 (Dynamic Panel) -->
          <div id="u21" class="ax_default" data-label="check4">
            <div id="u21_state0" class="panel_state" data-label="State1" style="">
              <div id="u21_state0_content" class="panel_state_content">

                <!-- Unnamed (Shape) -->
                <div id="u22" class="ax_default icon">
                  <img id="u22_img" class="img " src="images/home/u7.png"/>
                </div>
              </div>
            </div>
            <div id="u21_state1" class="panel_state" data-label="State2" style="visibility: hidden;">
              <div id="u21_state1_content" class="panel_state_content">

                <!-- Unnamed (Shape) -->
                <div id="u23" class="ax_default icon">
                  <img id="u23_img" class="img " src="images/home/u8.png"/>
                </div>
              </div>
            </div>
          </div>
        </div>

        <!-- Kaliber5 (Group) -->
        <div id="u24" class="ax_default" data-label="Kaliber5" data-left="0" data-top="0" data-width="0" data-height="0">

          <!-- item5 (Rectangle) -->
          <div id="u25" class="ax_default button" data-label="item5">
            <div id="u25_div" class=""></div>
            <div id="u25_text" class="text ">
              <p><span>5.6mm</span></p>
            </div>
          </div>

          <!-- check5 (Dynamic Panel) -->
          <div id="u26" class="ax_default" data-label="check5">
            <div id="u26_state0" class="panel_state" data-label="State1" style="">
              <div id="u26_state0_content" class="panel_state_content">

                <!-- Unnamed (Shape) -->
                <div id="u27" class="ax_default icon">
                  <img id="u27_img" class="img " src="images/home/u7.png"/>
                </div>
              </div>
            </div>
            <div id="u26_state1" class="panel_state" data-label="State2" style="visibility: hidden;">
              <div id="u26_state1_content" class="panel_state_content">

                <!-- Unnamed (Shape) -->
                <div id="u28" class="ax_default icon">
                  <img id="u28_img" class="img " src="images/home/u8.png"/>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <!-- MenuKalibrow (Group) -->
      <div id="u29" class="ax_default" data-label="MenuKalibrow" data-left="80" data-top="187" data-width="220" data-height="42">

        <!-- Menu_Background (Rectangle) -->
        <div id="u30" class="ax_default button" data-label="Menu_Background">
          <div id="u30_div" class=""></div>
        </div>

        <!-- Unnamed (Triangle) -->
        <div id="u31" class="ax_default box_1">
          <img id="u31_img" class="img " src="images/home/u31.png"/>
        </div>

        <!-- Frame (Dynamic Panel) -->
        <div id="u32" class="ax_default" data-label="Frame">
          <div id="u32_state0" class="panel_state" data-label="State1" style="">
            <div id="u32_state0_content" class="panel_state_content">

              <!-- TargetShape (Rectangle) -->
              <div id="u33" class="ax_default button" data-label="TargetShape">
                <div id="u33_div" class=""></div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <!-- TypAmunicji (Droplist) -->
      <div id="u34" class="ax_default droplist" data-label="TypAmunicji" title="Typ amunicji">
        <select id="u34_input" title="Typ amunicji">
          <option value="FMJ">FMJ</option>
          <option value="HP">HP</option>
        </select>
      </div>

      <!-- ListaRodzajow (Group) -->
      <div id="u35" class="ax_default ax_default_hidden" data-label="ListaRodzajow" style="display:none; visibility: hidden" data-left="0" data-top="0" data-width="0" data-height="0">

        <!-- Dropdown_Container (Rectangle) -->
        <div id="u36" class="ax_default shape" data-label="Dropdown_Container">
          <div id="u36_div" class=""></div>
        </div>

        <!-- Pocisk1 (Group) -->
        <div id="u37" class="ax_default" data-label="Pocisk1" data-left="0" data-top="0" data-width="0" data-height="0">

          <!-- item1 (Rectangle) -->
          <div id="u38" class="ax_default button" data-label="item1">
            <div id="u38_div" class=""></div>
            <div id="u38_text" class="text ">
              <p><span>NATO 5.56mm</span></p>
            </div>
          </div>

          <!-- check1 (Dynamic Panel) -->
          <div id="u39" class="ax_default" data-label="check1">
            <div id="u39_state0" class="panel_state" data-label="State1" style="">
              <div id="u39_state0_content" class="panel_state_content">

                <!-- Unnamed (Shape) -->
                <div id="u40" class="ax_default icon">
                  <img id="u40_img" class="img " src="images/home/u7.png"/>
                </div>
              </div>
            </div>
            <div id="u39_state1" class="panel_state" data-label="State2" style="visibility: hidden;">
              <div id="u39_state1_content" class="panel_state_content">

                <!-- Unnamed (Shape) -->
                <div id="u41" class="ax_default icon">
                  <img id="u41_img" class="img " src="images/home/u8.png"/>
                </div>
              </div>
            </div>
          </div>
        </div>

        <!-- Pocisk2 (Group) -->
        <div id="u42" class="ax_default" data-label="Pocisk2" data-left="0" data-top="0" data-width="0" data-height="0">

          <!-- item2 (Rectangle) -->
          <div id="u43" class="ax_default button" data-label="item2">
            <div id="u43_div" class=""></div>
            <div id="u43_text" class="text ">
              <p><span>NATO 7.62mm</span></p>
            </div>
          </div>

          <!-- check2 (Dynamic Panel) -->
          <div id="u44" class="ax_default" data-label="check2">
            <div id="u44_state0" class="panel_state" data-label="State1" style="">
              <div id="u44_state0_content" class="panel_state_content">

                <!-- Unnamed (Shape) -->
                <div id="u45" class="ax_default icon">
                  <img id="u45_img" class="img " src="images/home/u7.png"/>
                </div>
              </div>
            </div>
            <div id="u44_state1" class="panel_state" data-label="State2" style="visibility: hidden;">
              <div id="u44_state1_content" class="panel_state_content">

                <!-- Unnamed (Shape) -->
                <div id="u46" class="ax_default icon">
                  <img id="u46_img" class="img " src="images/home/u8.png"/>
                </div>
              </div>
            </div>
          </div>
        </div>

        <!-- Pocisk3 (Group) -->
        <div id="u47" class="ax_default" data-label="Pocisk3" data-left="0" data-top="0" data-width="0" data-height="0">

          <!-- item3 (Rectangle) -->
          <div id="u48" class="ax_default button" data-label="item3">
            <div id="u48_div" class=""></div>
            <div id="u48_text" class="text ">
              <p><span>Ruski 7.62mm</span></p>
            </div>
          </div>

          <!-- check3 (Dynamic Panel) -->
          <div id="u49" class="ax_default" data-label="check3">
            <div id="u49_state0" class="panel_state" data-label="State1" style="">
              <div id="u49_state0_content" class="panel_state_content">

                <!-- Unnamed (Shape) -->
                <div id="u50" class="ax_default icon">
                  <img id="u50_img" class="img " src="images/home/u7.png"/>
                </div>
              </div>
            </div>
            <div id="u49_state1" class="panel_state" data-label="State2" style="visibility: hidden;">
              <div id="u49_state1_content" class="panel_state_content">

                <!-- Unnamed (Shape) -->
                <div id="u51" class="ax_default icon">
                  <img id="u51_img" class="img " src="images/home/u8.png"/>
                </div>
              </div>
            </div>
          </div>
        </div>

        <!-- Pocisk4 (Group) -->
        <div id="u52" class="ax_default" data-label="Pocisk4" data-left="0" data-top="0" data-width="0" data-height="0">

          <!-- item4 (Rectangle) -->
          <div id="u53" class="ax_default button" data-label="item4">
            <div id="u53_div" class=""></div>
            <div id="u53_text" class="text ">
              <p><span>9mm pistolet</span></p>
            </div>
          </div>

          <!-- check4 (Dynamic Panel) -->
          <div id="u54" class="ax_default" data-label="check4">
            <div id="u54_state0" class="panel_state" data-label="State1" style="">
              <div id="u54_state0_content" class="panel_state_content">

                <!-- Unnamed (Shape) -->
                <div id="u55" class="ax_default icon">
                  <img id="u55_img" class="img " src="images/home/u7.png"/>
                </div>
              </div>
            </div>
            <div id="u54_state1" class="panel_state" data-label="State2" style="visibility: hidden;">
              <div id="u54_state1_content" class="panel_state_content">

                <!-- Unnamed (Shape) -->
                <div id="u56" class="ax_default icon">
                  <img id="u56_img" class="img " src="images/home/u8.png"/>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <!-- MenuRodzajow (Group) -->
      <div id="u57" class="ax_default" data-label="MenuRodzajow" data-left="343" data-top="187" data-width="220" data-height="42">

        <!-- Menu_Background (Rectangle) -->
        <div id="u58" class="ax_default button" data-label="Menu_Background">
          <div id="u58_div" class=""></div>
        </div>

        <!-- Unnamed (Triangle) -->
        <div id="u59" class="ax_default box_1">
          <img id="u59_img" class="img " src="images/home/u31.png"/>
        </div>

        <!-- Frame (Dynamic Panel) -->
        <div id="u60" class="ax_default" data-label="Frame">
          <div id="u60_state0" class="panel_state" data-label="State1" style="">
            <div id="u60_state0_content" class="panel_state_content">

              <!-- TargetShape (Rectangle) -->
              <div id="u61" class="ax_default button" data-label="TargetShape">
                <div id="u61_div" class=""></div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <!-- GuzikSzukaj (Rectangle) -->
      <div id="u62" class="ax_default primary_button" data-label="GuzikSzukaj">
        <div id="u62_div" class=""></div>
        <div id="u62_text" class="text ">
          <p><span>SZUKAJ</span></p>
        </div>
      </div>

      <!-- Konwersja (Checkbox) -->
      <div id="u63" class="ax_default checkbox" data-label="Konwersja">
        <label for="u63_input" style="position: absolute; left: 0px;">
          <div id="u63_text" class="text ">
            <p><span>Konwersja na system imperialny</span></p>
          </div>
        </label>
        <input id="u63_input" type="checkbox" value="checkbox"/>
      </div>

      <!-- Pojemnosc (Droplist) -->
      <div id="u64" class="ax_default droplist" data-label="Pojemnosc" title="pojemność">
        <select id="u64_input" title="pojemność">
          <option value="Od największej">Od największej</option>
          <option value="Od najmniejszej">Od najmniejszej</option>
        </select>
      </div>

      <!-- Masa (Droplist) -->
      <div id="u65" class="ax_default droplist" data-label="Masa" title="masa">
        <select id="u65_input" title="masa">
          <option value="Od największej">Od największej</option>
          <option value="Od najmniejszej">Od najmniejszej</option>
        </select>
      </div>

      <!-- DlugoscCalkowita (Droplist) -->
      <div id="u66" class="ax_default droplist" data-label="DlugoscCalkowita" title="Długość calkowita">
        <select id="u66_input" title="Długość calkowita">
          <option value="Od największej">Od największej</option>
          <option value="Od najmniejszej">Od najmniejszej</option>
        </select>
      </div>

      <!-- DlugoscLufy (Droplist) -->
      <div id="u67" class="ax_default droplist" data-label="DlugoscLufy" title="Długość lufy">
        <select id="u67_input" title="Długość lufy">
          <option value="Od największej">Od największej</option>
          <option value="Od najmniejszej">Od najmniejszej</option>
        </select>
      </div>

      <!-- SredniaEK (Droplist) -->
      <div id="u68" class="ax_default droplist" data-label="SredniaEK" title="Średnia EK">
        <select id="u68_input" title="Średnia EK">
          <option value="Od największej">Od największej</option>
          <option value="Od najmniejszej">Od najmniejszej</option>
        </select>
      </div>

      <!-- SredniaPredkosc (Droplist) -->
      <div id="u69" class="ax_default droplist" data-label="SredniaPredkosc" title="Średnia Prędkość">
        <select id="u69_input" title="Średnia Prędkość">
          <option value="Od największej">Od największej</option>
          <option value="Od najmniejszej">Od najmniejszej</option>
        </select>
      </div>

      <!-- SredniaMasaPocisku (Droplist) -->
      <div id="u70" class="ax_default droplist" data-label="SredniaMasaPocisku" title="Średnia Masa Pocisku">
        <select id="u70_input" title="Średnia Masa Pocisku">
          <option value="Od największej">Od największej</option>
          <option value="Od najmniejszej">Od najmniejszej</option>
        </select>
      </div>

      <!-- ZasiegSkuteczny (Droplist) -->
      <div id="u71" class="ax_default droplist" data-label="ZasiegSkuteczny" title="Zasieg Skuteczny">
        <select id="u71_input" title="Zasieg Skuteczny">
          <option value="Od największej">Od największej</option>
          <option value="Od najmniejszej">Od najmniejszej</option>
        </select>
      </div>

      <!-- Podrzut (Droplist) -->
      <div id="u72" class="ax_default droplist" data-label="Podrzut" title="Podrzut Lufy">
        <select id="u72_input" title="Podrzut Lufy">
          <option value="Od największej">Od największej</option>
          <option value="Od najmniejszej">Od najmniejszej</option>
        </select>
      </div>

      <!-- Odrzut (Droplist) -->
      <div id="u73" class="ax_default droplist" data-label="Odrzut" title="Odrzut Lufy">
        <select id="u73_input" title="Odrzut Lufy">
          <option value="Od największej">Od największej</option>
          <option value="Od najmniejszej">Od najmniejszej</option>
        </select>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u74" class="ax_default label">
        <div id="u74_div" class=""></div>
        <div id="u74_text" class="text ">
          <p><span>Rodzaj broni</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u75" class="ax_default label">
        <div id="u75_div" class=""></div>
        <div id="u75_text" class="text ">
          <p><span>Kaliber</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u76" class="ax_default label">
        <div id="u76_div" class=""></div>
        <div id="u76_text" class="text ">
          <p><span>Typ amunicji</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u77" class="ax_default label">
        <div id="u77_div" class=""></div>
        <div id="u77_text" class="text ">
          <p><span>Rodzaj pocisku</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u78" class="ax_default label">
        <div id="u78_div" class=""></div>
        <div id="u78_text" class="text ">
          <p><span>Pojemność</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u79" class="ax_default label">
        <div id="u79_div" class=""></div>
        <div id="u79_text" class="text ">
          <p><span>Masa</span></p><p><span><br/></span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u80" class="ax_default label">
        <div id="u80_div" class=""></div>
        <div id="u80_text" class="text ">
          <p><span>Dlugość całkowita</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u81" class="ax_default label">
        <div id="u81_div" class=""></div>
        <div id="u81_text" class="text ">
          <p><span>Długość lufy</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u82" class="ax_default label">
        <div id="u82_div" class=""></div>
        <div id="u82_text" class="text ">
          <p><span>Srednia EK</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u83" class="ax_default label">
        <div id="u83_div" class=""></div>
        <div id="u83_text" class="text ">
          <p><span>Srednia prędkość</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u84" class="ax_default label">
        <div id="u84_div" class=""></div>
        <div id="u84_text" class="text ">
          <p><span>Srednia masa pocisku</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u85" class="ax_default label">
        <div id="u85_div" class=""></div>
        <div id="u85_text" class="text ">
          <p><span>Odrzut lufy</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u86" class="ax_default label">
        <div id="u86_div" class=""></div>
        <div id="u86_text" class="text ">
          <p><span>Podrzut lufy</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u87" class="ax_default label">
        <div id="u87_div" class=""></div>
        <div id="u87_text" class="text ">
          <p><span>Zasięg skuteczny</span></p>
        </div>
      </div>
    </div>
  </body>
</html>

</jsp:root>