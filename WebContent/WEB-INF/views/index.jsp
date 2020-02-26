<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <link rel="stylesheet" href="/lap-java-excelsheetconverter/style.css" />
    <title>Prograd Details</title>
</head>

<body>
<body>
		<form action="/lap-java-excelsheetconverter/prograd" method="post" id="myForm">
		<div>
			<div class="start">
				<h1 class = "heading">Share Your Experience With Us</h1>
				<p class = "para">Now that you are nearing halfway point of our ProGrad program, we are love to hear how things are going.<br><br>
				Your feedback is important to us! We use it to ensure we are offering the best of things. 
				Please select the answer that best represents your experience with us thus far.</p>
			</div>
			<div class="starts">
				<label class = "name">Your Name</label>
				<label class = "id">Your ProGrad Id</label>
			</div>
			<div class= "inputs">
				<input type = "text" class = "nametext" id = "name" name = "name">
				<input type = "text" class = "idtext" id = "id" name = "id">
			</div>
			<div>
				<h3 class = "experience">Rate Your Experience</h3><br>
				<p class = "experienceQuestion">How would you rate your experience with us so far?</p><br>
				<div class = "rate">
				<fieldset>
    				<span class="star-cb-group">
						<input type="radio" id="rating-5" name="rating5" id="rating5" value="5" class = "r5"/><label for="rating-5"></label>
						<input type="radio" id="rating-4" name="rating4" id="rating4" value="4" class = "r"  /><label for="rating-4"></label>
						<input type="radio" id="rating-3" name="rating3" id="rating3" value="3" class = "r" /><label for="rating-3"></label>
						<input type="radio" id="rating-2" name="rating2" id="rating2" value="2" class = "r" /><label for="rating-2"></label>
						<input type="radio" id="rating-1" name="rating1" id="rating1" value="1" class = "r1" checked="checked"/><label for="rating-1"></label>
						<input type="radio" id="rating-0" name="rating0" id="rating0" value="0" class="star-cb-clear" /><label for="rating-0"></label>
    				</span>
				</fieldset>
				</div>
				
			</div>
			
  				<p class ="suggestion" id="recommand">How likely is that you would recommend ProGrad to a friend/junior/colleague?</p><br>
  				<div class = "rating">
  				<input type ="button" class = "re1" onclick = "button1()" value = "1" id = "re1" name = "re1">
  				<input type ="button" class = "re2" onclick = "button2()" value = "2" id = "re2" name = "re2">
  				<input type ="button" class = "re3" onclick = "button3()" value = "3" id = "re3" name = "re3">
  				<input type ="button" class = "re4" onclick = "button4()" value = "4" id = "re4" name = "re4">
  				<input type ="button" class = "re5" onclick = "button5()" value = "5" id = "re5" name = "re5">
  				</div>	
  				<p class = "like" id = "unlike">Very Unlikely</p>
				<p class = "like" id = "like">Very Likely</p>
			
			<div>
				<p class = "suggestion" id = "suggest">Do you have any suggestions for us?</p><br>
				<textarea rows="4" cols="50" name="comment" id = "comment"  class = "suggestiontext"></textarea>
  				<button class = "submit" name = "submit" id = "submit" value = "SUBMIT" onclick = "next()">SUBMIT</button>
			</div>
		</div>
		</form>
</body>
<script type="text/javascript" type="text/javascript" src="./script/script.js"></script>
</html>