/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.18
 * Generated at: 2017-08-09 16:05:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.vrpload3d;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewSolution_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-3.2.6.RELEASE.jar", Long.valueOf(1423481836151L));
    _jspx_dependants.put("jar:file:/C:/DungPQ/research/projects/cblsvr/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/slp/WEB-INF/lib/spring-webmvc-3.2.6.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1386784424000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1423481802197L));
    _jspx_dependants.put("jar:file:/C:/DungPQ/research/projects/cblsvr/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/slp/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- DataTables CSS -->\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- DataTables Responsive CSS -->\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- DataTables JavaScript -->\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("#modal-load3d .modal-dialog{\r\n");
      out.write("\twidth: 95%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<div id=\"page-wrapper\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t<h1 class=\"page-header\">VRP-Load3D Solution</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div id=\"map\" style=\"height:100%\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"modal-load3d\" role=\"dialog\">\r\n");
      out.write("\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("\t\t\t\t<h4 class=\"modal-title\">Load3D of <span id=\"vehicle-name\"></span></h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dataTable_wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"table table-striped table-bordered table-hover\" id=\"table-info-load3d\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Tên S/P</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Mã Hoá Đơn</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Địa chỉ</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-6\" id=\"canvas-load3d\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script async defer src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyDEXgYFE4flSYrNfeA7VKljWB_IhrDwxL4&callback=initMap\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("var colorInit=[\"red\",\"green\",\"blue\",\"yellow\",\"black\"]; // mang init mau\r\n");
      out.write("var map;\r\n");
      out.write("var dataResponse = JSON.parse('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sol}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("//console.log(\"dataResponse::\"+JSON.stringify(dataResponse));\r\n");
      out.write("var routes = dataResponse.routes;\r\n");
      out.write("var loads = dataResponse.loads;\r\n");
      out.write("var polyline_route = [];\r\n");
      out.write("var labels = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';\r\n");
      out.write("\r\n");
      out.write("function f_latlng(slatlng){\r\n");
      out.write("\tvar index_cut = slatlng.indexOf(',');\r\n");
      out.write("\tvar latlng = [];\r\n");
      out.write("\tvar lat = slatlng.substring(0,index_cut);\r\n");
      out.write("\tlatlng[0] = parseFloat(lat);\r\n");
      out.write("\tvar lng = slatlng.substring(index_cut+1);\r\n");
      out.write("\tlatlng[1] = parseFloat(lng);\r\n");
      out.write("\t\r\n");
      out.write("\treturn latlng;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function initMap(){\r\n");
      out.write("\tmap = new google.maps.Map(document.getElementById('map'),{\r\n");
      out.write("\t\tcenter: {lat:21.03, lng:105.8},\r\n");
      out.write("\t\tzoom: 12\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfor(var i=0; i<routes.length; i++){\r\n");
      out.write("\t\tvar elements = routes[i].elements;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar lineSymbol = {\r\n");
      out.write("\t\t\tpath: google.maps.SymbolPath.FORWARD_CLOSED_ARROW,\r\n");
      out.write("\t\t\tstrokeOpacity: 2,\r\n");
      out.write("\t\t\tscale: 1.5\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tpolyline_route[i] = new google.maps.Polyline({\r\n");
      out.write("\t\t\tmap : map,\r\n");
      out.write("\t\t\tstrokeColor : colorInit[i],\r\n");
      out.write("\t\t\tstrokeOpacity : 1.0,\r\n");
      out.write("\t\t\tstrokeWeight : 3,\r\n");
      out.write("\t\t\ticons: [{\r\n");
      out.write("\t\t\t\ticon: lineSymbol,\r\n");
      out.write("\t\t\t\toffset: '100%',\r\n");
      out.write("\t\t\t\trepeat: '200px'\r\n");
      out.write("\t\t\t}]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//polyline_route[i].setMap(map);\r\n");
      out.write("\t\tvar labelIndex = 0;\r\n");
      out.write("\t\tvar prelat = -1;\r\n");
      out.write("\t\tvar prelng = -1;\r\n");
      out.write("\t\tfor(var j=0; j<elements.length; j++){\r\n");
      out.write("\t\t\tvar latlng = f_latlng(elements[j].latlng);\r\n");
      out.write("\t\t\tvar lat = latlng[0];\r\n");
      out.write("\t\t\tvar lng = latlng[1];\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(prelat == lat && prelng == lng){\r\n");
      out.write("\t\t\t\tcontinue;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tprelat = lat;\r\n");
      out.write("\t\t\tprelng = lng;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tconsole.log(\"route[\"+i+\"].element[\"+elements[j].code+\"] = (\"+lat+\",\"+lng+\")\");\r\n");
      out.write("\t\t\tvar pos = new google.maps.LatLng(lat,lng);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(elements[j].code == 'depot'){\r\n");
      out.write("\t\t\t\tvar marker = new google.maps.Marker({\r\n");
      out.write("\t\t\t\t\tmap : map,\r\n");
      out.write("\t\t\t\t\tposition : pos,\r\n");
      out.write("\t\t\t\t\tlabel: \"DP\"\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tvar marker = new google.maps.Marker({\r\n");
      out.write("\t\t\t\t\tmap : map,\r\n");
      out.write("\t\t\t\t\tposition : pos,\r\n");
      out.write("\t\t\t\t\tlabel: labels[labelIndex++ % labels.length]\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tpolyline_route[i].getPath().push(pos);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfor(var i=0; i<routes.length; i++){\r\n");
      out.write("\t\tgoogle.maps.event.addListener(polyline_route[i],'click',function(event){\r\n");
      out.write("\t\t\tvar index_route = polyline_route.indexOf(this);\r\n");
      out.write("\t\t\tconsole.log(\"index_route clicked = \"+index_route);\r\n");
      out.write("\t\t\tf_view_load3d(index_route);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function createCuboid(x, y, z, w, h, d) { \r\n");
      out.write("\tvar nodes = [[x,   y,   z  ],\r\n");
      out.write("     \t\t\t [x,   y,   z+d],\r\n");
      out.write("      \t\t\t [x,   y+h, z  ],\r\n");
      out.write("     \t\t\t [x,   y+h, z+d],\r\n");
      out.write("     \t\t\t [x+w, y,   z  ],\r\n");
      out.write("     \t\t\t [x+w, y,   z+d],\r\n");
      out.write("     \t\t\t [x+w, y+h, z  ],\r\n");
      out.write("     \t\t\t [x+w, y+h, z+d]];\r\n");
      out.write("\tvar edges = [[0, 1], [1, 3], [3, 2], [2, 0],\r\n");
      out.write("    \t\t\t [4, 5], [5, 7], [7, 6], [6, 4],\r\n");
      out.write("     \t\t\t [0, 4], [1, 5], [2, 6], [3, 7]];\r\n");
      out.write("\treturn { 'nodes': nodes, 'edges': edges };\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("function rotateZ3D(theta,nodes) {\r\n");
      out.write("    var sin_t = Math.sin(theta);\r\n");
      out.write("    var cos_t = Math.cos(theta);\r\n");
      out.write("    \r\n");
      out.write("    for (var n=0; n<nodes.length; n++) {\r\n");
      out.write("        var node = nodes[n];\r\n");
      out.write("        var x = node[0];\r\n");
      out.write("        var y = node[1];\r\n");
      out.write("        node[0] = x * cos_t - y * sin_t;\r\n");
      out.write("        node[1] = y * cos_t + x * sin_t;\r\n");
      out.write("    }\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("function rotateY3D(theta, nodes) {\r\n");
      out.write("    var sin_t = Math.sin(theta);\r\n");
      out.write("    var cos_t = Math.cos(theta);\r\n");
      out.write("    \r\n");
      out.write("    for (var n=0; n<nodes.length; n++) {\r\n");
      out.write("        var node = nodes[n];\r\n");
      out.write("        var x = node[0];\r\n");
      out.write("        var z = node[2];\r\n");
      out.write("        node[0] = x * cos_t - z * sin_t;\r\n");
      out.write("        node[2] = z * cos_t + x * sin_t;\r\n");
      out.write("    }\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("function rotateX3D(theta, nodes) {\r\n");
      out.write("    var sin_t = Math.sin(theta);\r\n");
      out.write("    var cos_t = Math.cos(theta);\r\n");
      out.write("    \r\n");
      out.write("    for (var n=0; n<nodes.length; n++) {\r\n");
      out.write("        var node = nodes[n];\r\n");
      out.write("        var y = node[1];\r\n");
      out.write("        var z = node[2];\r\n");
      out.write("        node[1] = y * cos_t - z * sin_t;\r\n");
      out.write("        node[2] = z * cos_t + y * sin_t;\r\n");
      out.write("    }\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("//var index_object = 0;\r\n");
      out.write("var objects = [];\r\n");
      out.write("\r\n");
      out.write("function f_view_load3d (index_route){\r\n");
      out.write("\t$('#modal-load3d').modal();\r\n");
      out.write("\t$('#vehicle-name').text(loads[index_route].vehicle.code);\r\n");
      out.write("\t$('#canvas-load3d').html(\"<canvas id='canvas1'></canvas>\");\r\n");
      out.write("\t$('#table-info-load3d').dataTable().fnDestroy();\r\n");
      out.write("\tvar table_info = $('#table-info-load3d').DataTable({\r\n");
      out.write("\t\t\"searching\" : false,\r\n");
      out.write("\t\t\"aaSorting\" : [],\r\n");
      out.write("\t\t\"ordering\" : false,\r\n");
      out.write("\t\t\"bInfo\" : false\r\n");
      out.write("\t});\r\n");
      out.write("\ttable_info.clear().draw();\r\n");
      out.write("\tvar load = loads[index_route];\r\n");
      out.write("\tvar vehicle = load.vehicle;\r\n");
      out.write("\tvar loadElements = load.loadElements;\r\n");
      out.write("\tfor(var i=0; i<loadElements.length; i++){\r\n");
      out.write("\t\tvar e = loadElements[i];\r\n");
      out.write("\t\ttable_info.row.add([\r\n");
      out.write("\t\t   \te.item.name,\r\n");
      out.write("\t\t   \te.orderID,\r\n");
      out.write("\t\t   \te.addr,\r\n");
      out.write("\t\t   \t'<button class=\"btn btn-primary\" onclick=\"f_view_item('+index_route+','+i+',this)\">Xem</button>'\r\n");
      out.write("\t\t                    ]).draw(false);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tobjects = [];\r\n");
      out.write("\tvar object = createCuboid(0,0,0,vehicle.width,vehicle.length,vehicle.height);\r\n");
      out.write("\trotateX3D(120,object.nodes);\r\n");
      out.write("\trotateY3D(120,object.nodes);\r\n");
      out.write("\trotateZ3D(120,object.nodes);\r\n");
      out.write("\tobjects.push(object);\r\n");
      out.write("\tf_draw_box();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function f_view_item(index_route, index_item, button_clicked){\r\n");
      out.write("\tvar load = loads[index_route];\r\n");
      out.write("\tvar loadElements = load.loadElements;\r\n");
      out.write("\tvar e = loadElements[index_item];\r\n");
      out.write("\tvar tmp_o = createCuboid(e.posWidth,e.posLength,e.posHeight,e.item.w,e.item.l,e.item.h);\r\n");
      out.write("\trotateX3D(120,tmp_o.nodes);\r\n");
      out.write("\trotateY3D(120,tmp_o.nodes);\r\n");
      out.write("\trotateZ3D(120,tmp_o.nodes);\r\n");
      out.write("\t\r\n");
      out.write("\tobjects.push(tmp_o);\r\n");
      out.write("\tf_draw_box();\r\n");
      out.write("\t$(button_clicked).prop('disabled',true);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function f_draw_box(){\r\n");
      out.write("\tvar sketch = new Processing.Sketch();\r\n");
      out.write("\t//sketch.use3DContext = true;\r\n");
      out.write("\tsketch.attachFunction = function(processing){\r\n");
      out.write("\t\tprocessing.setup = function(){\r\n");
      out.write("\t\t\tprocessing.size(600,500);\r\n");
      out.write("\t\t\tprocessing.background(220,220,220);\r\n");
      out.write("\t\t\tprocessing.noLoop();\r\n");
      out.write("\t\t\t//processing.translate(400, 200);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tprocessing.draw = function(){\r\n");
      out.write("\t\t\tprocessing.translate(400, 200);\r\n");
      out.write("\t\t\tfor(o = 0; o < objects.length-1; o++){\r\n");
      out.write("\t\t\t\tprocessing.stroke(34, 68, 204);\r\n");
      out.write("\t\t\t\tvar edges = objects[o].edges;\r\n");
      out.write("\t\t\t\tvar nodes = objects[o].nodes;\r\n");
      out.write("\t\t\t\tfor (var e=0; e<edges.length; e++) {\r\n");
      out.write("\t\t\t\t\tvar n0 = edges[e][0];\r\n");
      out.write("\t\t\t\t\tvar n1 = edges[e][1];\r\n");
      out.write("\t\t\t\t\tvar node0 = nodes[n0];\r\n");
      out.write("\t\t\t\t\tvar node1 = nodes[n1];\r\n");
      out.write("\t\t\t\t\tprocessing.line(node0[0], node0[1], node1[0], node1[1]);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t    // Draw nodes\r\n");
      out.write("\t\t\t    processing.fill(40, 168, 107);\r\n");
      out.write("\t\t\t    processing.noStroke();\r\n");
      out.write("\t\t\t    for (var n=0; n<nodes.length; n++) {\r\n");
      out.write("\t\t\t        var node = nodes[n];\r\n");
      out.write("\t\t\t        processing.ellipse(node[0], node[1], 2, 2);\r\n");
      out.write("\t\t\t    }\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar lastObject = objects[objects.length-1];\r\n");
      out.write("\t\t\tvar edges = lastObject.edges;\r\n");
      out.write("\t\t\tvar nodes = lastObject.nodes;\r\n");
      out.write("\t\t\tprocessing.stroke(255, 0, 0);\r\n");
      out.write("\t\t\tprocessing.strokeWeight(2);\r\n");
      out.write("\t\t\tfor (var e=0; e<edges.length; e++) {\r\n");
      out.write("\t\t\t\tvar n0 = edges[e][0];\r\n");
      out.write("\t\t\t\tvar n1 = edges[e][1];\r\n");
      out.write("\t\t\t\tvar node0 = nodes[n0];\r\n");
      out.write("\t\t\t\tvar node1 = nodes[n1];\r\n");
      out.write("\t\t\t\tprocessing.line(node0[0], node0[1], node1[0], node1[1]);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t    // Draw nodes\r\n");
      out.write("\t\t    processing.fill(40, 168, 107);\r\n");
      out.write("\t\t    processing.noStroke();\r\n");
      out.write("\t\t    for (var n=0; n<nodes.length; n++) {\r\n");
      out.write("\t\t        var node = nodes[n];\r\n");
      out.write("\t\t        processing.ellipse(node[0], node[1], 4, 4);\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\tvar canvas = document.getElementById(\"canvas1\");\r\n");
      out.write("\tvar p = new Processing(canvas,sketch);\r\n");
      out.write("}\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/vrpload3d/viewSolution.jsp(6,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/assets/libs/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/views/vrpload3d/viewSolution.jsp(9,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/assets/libs/datatables-responsive/css/dataTables.responsive.css");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/views/vrpload3d/viewSolution.jsp(12,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/assets/libs/datatables/media/js/jquery.dataTables.js");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/views/vrpload3d/viewSolution.jsp(13,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/assets/libs/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.js");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent(null);
    // /WEB-INF/views/vrpload3d/viewSolution.jsp(70,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/assets/libs/processing/processing.js");
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }
}
