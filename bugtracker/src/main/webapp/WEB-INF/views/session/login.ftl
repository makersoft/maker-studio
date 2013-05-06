<#import "/spring.ftl" as spring />
<head>
	<link href="<@spring.url "/assets/stylesheets/login.css" />" media="all" rel="stylesheet" type="text/css">
</head>

<div class="auth-form" id="login">
    <form accept-charset="UTF-8" action="<@spring.url '/session' />" method="post">
    	<div style="margin:0;padding:0;display:inline">
    		<input name="authenticity_token" type="hidden" value="MYyQrXdOZsJa8blVDPcMUxjjS/Xg038PT3KQVZBub4g=">
		</div>      
		<div class="auth-form-header">
        	<h1>Sign in</h1>
      	</div>
        <div class="auth-form-body">
            <label for="login_field">
          		Username or Email
        	</label>
        	<input autocapitalize="off" autofocus="autofocus" class="input-block" id="login_field" name="login" tabindex="1" type="text">

	        <label for="password">
	          Password <a href="/session/forgot-password">(forgot password)</a>
	        </label>
        	<input autocomplete="disabled" class="input-block" id="password" name="password" tabindex="2" type="password">
        	
            <input class="btn" style="font-weight: bold;padding: 7px 15px;" name="commit" tabindex="3" type="submit" value="Sign in">
		</div>
	</form>
</div>