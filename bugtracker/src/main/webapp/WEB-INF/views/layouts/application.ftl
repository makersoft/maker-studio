[#ftl]
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>[#if title != '']${title}[#else]欢迎-BugTracker[/#if]</title>
    <meta http-equiv="Cache-Control" content="no-store"/>
    <meta http-equiv="Pragma" content="no-cache"/>
    <meta http-equiv="Expires" content="0"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    
    <!-- jQuery -->
    <script type="text/javascript" src="${base}/vendor.plugins/jquery/jquery-1.7.2.js"></script>
    
    <!-- Bottstrap -->
    <link rel="stylesheet" type="text/css" href="${base}/vendor.plugins/bootstrap/css/bootstrap.css"/>
    <script type="text/javascript" src="${base}/vendor.plugins/bootstrap/js/bootstrap.js"></script>
    
    <!-- App BugTracker-->
    <link rel="stylesheet" type="text/css" href="${base}/vendor.assets/stylesheets/bugtracker.css"/>
    
    ${head}
    <style type='text/css'>
      /* Some CSS */
    </style>
  </head>
  <body>
	${body}
  </body>
</html>