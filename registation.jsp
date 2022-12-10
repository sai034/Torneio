<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form action="SignupAction" method="post">
		<div class="container">
			<div class="head">
				<h1>REGISTRATION</h1>
			</div>

			<!--usn-->
			<div class="box">
				<label for="Usn" class="fl fontLabel"> USN: </label>
				<div class="new iconBox">
					<i class="fa fa-user" aria-hidden="true"></i>
				</div>
				<div class="fr">
					<input type="text" name="Usn" placeholder="usn id" class="textBox"
						required>
				</div>
				<div class="clr"></div>
			</div>
			<!--usn-->


			<!--name-->
			<div class="box">
				<label for="Name" class="fl fontLabel"> Name: </label>
				<div class="fl iconBox">
					<i class="fa fa-user" aria-hidden="true"></i>
				</div>
				<div class="fr">
					<input type="text" required name="Name" placeholder="Name"
						class="textBox">
				</div>
				<div class="clr"></div>
			</div>
			<!--name-->


			<!---game.------>
			<div class="box">
				<label for="Game" class="fl fontLabel"> Game: </label>
				<div class="fl iconBox">
					<i class="fa fa-phone-square" aria-hidden="true"></i>
				</div>
				<div class="fr">
					<input type="text" required name="Game" maxlength="10"
						placeholder="Game" class="textBox">
				</div>
				<div class="clr"></div>
			</div>
			<!---game.---->


			<!---semester---->
			<div class="box">
				<label for="Sem" class="fl fontLabel"> Semester: </label>
				<div class="fl iconBox">
					<i class="fa fa-envelope" aria-hidden="true"></i>
				</div>
				<div class="fr">
					<input type="text" required name="Sem" placeholder="Sem"
						class="textBox">
				</div>
				<div class="clr"></div>
			</div>
			<!--semester----->


			<!---section------>
			<div class="box">
				<label for="Sec" class="fl fontLabel"> Section </label>
				<div class="fl iconBox">
					<i class="fa fa-key" aria-hidden="true"></i>
				</div>
				<div class="fr">
					<input type="text" required name="Sec" placeholder="Section"
						class="textBox">
				</div>
				<div class="clr"></div>
			</div>
			<!---Section---->

			<!---Phone No.------>
			<div class="box">
				<label for="phoneNo1" class="fl fontLabel"> Phone No.: </label>
				<div class="fl iconBox">
					<i class="fa fa-phone-square" aria-hidden="true"></i>
				</div>
				<div class="fr">
					<input type="text" required name="phoneNo1" maxlength="10"
						placeholder="Phone No." class="textBox">
				</div>
				<div class="clr"></div>
			</div>
			<!---Phone No.---->



			<!--Terms and Conditions------>
			<div class="box terms">
				<input type="checkbox" name="Terms" required> &nbsp; I
				accept the terms and conditions
			</div>
			<!--Terms and Conditions------>



			<!---Submit Button------>
			<div class="box" style="background: #ABD699">
				<input type="Submit" name="Submit" class="submit" value="SUBMIT">
			</div>
			<!---Submit Button----->


		</div>
	</form>


</body>
</html>