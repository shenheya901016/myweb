<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../../pages/common/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>登录</title>

    <!-- Bootstrap Core CSS -->
    <link href="${ctx}/common/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="${ctx}/common/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${ctx}/common/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="${ctx}/common/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <link href="${ctx}/css/login.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<div class="container" style="width:100%;">
        <div class="col-md-4 col-md-offset-4">
            <div class="login-panel panel_new">
                <div class="panel-heading_new">
                    <h3 class="panel-title_new">Welcome</h3>
                </div>
                <div class="panel-body">
                    <form role="form">
                        <fieldset>
                            <div class="form-group">
                                <input class="form-control_new" placeholder="E-mail" name="email" type="email" autofocus>
                            </div>
                            <div class="form-group">
                                <input class="form-control_new" placeholder="Password" name="password" type="password" value="">
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                </label>
                            </div>
                            <!-- Change this to a button or input when using this as a form -->
                            <div class="checkbox">
                                 <a href="#" class="btn btn-lg btn-success btn-block">Login</a>
                            </div>
                            <div class="checkbox">
                                <a href="#">Forget password ?</a>
                                <a href="#" style="float: right">Sign in</a>
                            </div>

                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
</div>

<!-- jQuery -->
<script src="${ctx}/common/jquery/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="${ctx}/common/bootstrap/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="${ctx}/common/metisMenu/metisMenu.min.js"></script>

<!-- Custom Theme JavaScript -->
<script src="${ctx}/common/js/sb-admin-2.js"></script>

</body>

</html>

