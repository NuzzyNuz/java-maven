/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2020-04-26 06:57:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonArray;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.net.HttpURLConnection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.net.HttpURLConnection");
    _jspx_imports_classes.add("com.google.gson.JsonObject");
    _jspx_imports_classes.add("com.google.gson.JsonArray");
    _jspx_imports_classes.add("java.net.URL");
    _jspx_imports_classes.add("java.io.BufferedReader");
    _jspx_imports_classes.add("com.google.gson.JsonParser");
    _jspx_imports_classes.add("java.io.InputStreamReader");
    _jspx_imports_classes.add("java.io.InputStream");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Car Application</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\"> \r\n");
      out.write("\t<!-- <style type=\"text/css\">\r\n");
      out.write("\t\ttable, th, td , tr {\r\n");
      out.write("\t\t\tborder : 1px solid black;\r\n");
      out.write("\t\t\tborder-collapse: collapse;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\ttd,td{\r\n");
      out.write("\t\t\tpadding: 5px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\ttr:nth-child(even){\r\n");
      out.write("\t\t\tbackground-color: #ccc;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\ttr:nth-child(odd){\r\n");
      out.write("\t\t\tbackground-color: white;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t</style> -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <h2>Solent Batch 01</h2>\r\n");
      out.write("    <h3>These are the car details</h3>\r\n");
      out.write("    ");
 out.println("Hello World!"); 
      out.write(" <!-- Similar to echo in php-->\r\n");
      out.write("    \r\n");
      out.write("    <table>\r\n");
      out.write("    \t<thead>\r\n");
      out.write("    \t\t<tr>\r\n");
      out.write("    \t\t\t<th>Id</th>\r\n");
      out.write("    \t\t\t<th>Model</th>\r\n");
      out.write("    \t\t\t<th>Brand</th>\r\n");
      out.write("    \t\t\t<th>Year</th>\r\n");
      out.write("    \t\t\t<th>Color</th>\r\n");
      out.write("    \t\t\t<th>Type</th>\r\n");
      out.write("    \t\t</tr>\r\n");
      out.write("    \t</thead>\r\n");
      out.write("    \t<tbody>\r\n");
      out.write("    \t\t");

    			//URL for the API, final = constant variable  that cannot be changed
    			final String API_URL = "http://localhost:8080/appone/carapi/cars";
    			
    			//Fetching the data from the API
    			try{
    				URL url = new URL(API_URL);
    				HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
    				httpURLConnection.setRequestMethod("GET");
    				httpURLConnection.setDoInput(true); //Downloads
    				httpURLConnection.setDoOutput(false); //Uploads
    				
    				InputStream inputStream = (InputStream)httpURLConnection.getInputStream();
    				InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
    				BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    				
    				if(httpURLConnection.getResponseCode() == 200){
    					
    					//Reading the file line by line
    					
    					String line = "";
    					StringBuilder sb = new StringBuilder();
    					
    					while((line = bufferedReader.readLine()) != null){
    						//Debug the condition
    						////out.println(line);
    						
    						sb.append(line);
    					}
    					
    					String jsonString = sb.toString();
    					
    					JsonArray jsonArray = JsonParser.parseString(jsonString).getAsJsonArray();
    					
    					for(int i = 0; i < jsonArray.size(); i++){
    						JsonObject obj = jsonArray.get(i).getAsJsonObject();
    						
    						
      out.write("\r\n");
      out.write("    \t\t\t\t\t\t\t<tr>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td>");
 out.print(obj.get("id").getAsString()); 
      out.write("</td>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td>");
 out.print(obj.get("model").getAsString()); 
      out.write("</td>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td>");
 out.print(obj.get("brand").getAsString()); 
      out.write("</td>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td>");
 out.print(obj.get("year").getAsString()); 
      out.write("</td>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td>");
 out.print(obj.get("color").getAsString()); 
      out.write("</td>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td>");
 out.print(obj.get("type").getAsString()); 
      out.write("</td>\r\n");
      out.write("    \t\t\t\t\t\t\t</tr>\r\n");
      out.write("    \t\t\t\t\t\t");

    					}
    					
    				}
    				
    			}catch(Exception e){
    				e.printStackTrace();
    				
    				out.print("Error: " + e.getMessage());
    			}
    		
    		
      out.write("\r\n");
      out.write("    \t</tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
}
