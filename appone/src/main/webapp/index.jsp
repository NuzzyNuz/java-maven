<%@page import="com.google.gson.JsonObject"%>
<%@page import="com.google.gson.JsonParser"%>
<%@page import="com.google.gson.JsonArray"%>
<%@page import="java.net.URL"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.net.HttpURLConnection"%>


<html>
<head>
	<title>Car Application</title>
	<link rel="stylesheet" href="css/style.css"> 
<!-- <style type="text/css">
		table, th, td , tr {
			border : 1px solid black;
			border-collapse: collapse;
		}
		
		td,td{
			padding: 5px;
		}
		
		tr:nth-child(even){
			background-color: #ccc;
		}
		
		tr:nth-child(odd){
			background-color: white;
		}
		
	</style> -->
</head>
<body>
    <h2>Solent Batch 01</h2>
    <h3>These are the car details</h3>
    <% out.println("Hello World!"); %> <!-- Similar to echo in php-->
    
    <table>
    	<thead>
    		<tr>
    			<th>Id</th>
    			<th>Model</th>
    			<th>Brand</th>
    			<th>Year</th>
    			<th>Color</th>
    			<th>Type</th>
    		</tr>
    	</thead>
    	<tbody>
    		<%
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
    						
    						%>
    							<tr>
    								<td><% out.print(obj.get("id").getAsString()); %></td>
    								<td><% out.print(obj.get("model").getAsString()); %></td>
    								<td><% out.print(obj.get("brand").getAsString()); %></td>
    								<td><% out.print(obj.get("year").getAsString()); %></td>
    								<td><% out.print(obj.get("color").getAsString()); %></td>
    								<td><% out.print(obj.get("type").getAsString()); %></td>
    							</tr>
    						<%
    					}
    					
    				}
    				
    			}catch(Exception e){
    				e.printStackTrace();
    				
    				out.print("Error: " + e.getMessage());
    			}
    		
    		%>
    	</tbody>
    </table>
</body>
</html>
