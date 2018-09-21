<%@ page session="false" %>
<html>
<head>
</head>
<body>
<h1><a href="#">spring-mvc-showcase</a></h1>
<p>Recommended: Using a Web Developer tool such a Firebug to inspect the client/server interaction</p>
<div id="tabs">
	<ul>
		<li><a href="#simple">Simple</a></li>
		<li><a href="#mapping">Request Mapping</a></li>
		<li><a href="#data">Request Data</a></li>
		<li><a href="#responses">Response Writing</a></li>
		<li><a href="#messageconverters">Message Converters</a></li>
		<li><a href="#views">View Rendering</a></li>
		<li><a href="#convert">Type Conversion</a></li>
		<li><a href="#validation">Validation</a></li>
		<li><a href="http://www.google.com" title="forms">Forms</a></li>
		<li><a href="http://www.google.com" />" title="fileupload">File Upload</a></li>
		<li><a href="#exceptions">Exception Handling</a></li>
		<li><a href="#redirect">Redirecting</a></li>
        <li><a href="#async">Async Requests</a></li>
    </ul>
    <div id="simple">
		<h2>Simple</h2>
		<p>
			See the <code>org.springframework.samples.mvc.simple</code> package for the @Controller code
		</p>
		<ul>
			<li>
				<a id="simpleLink" class="textLink" href="http://www.google.com" />">GET /simple</a>
			</li>
			<li>
				<a id="simpleRevisited" class="textLink" href="http://www.google.com" />">GET /simple/revisited</a>
			</li>
		</ul>
	</div>
</div>

</body>
</html>