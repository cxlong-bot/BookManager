<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<!--    <meta charset="UTF-8">-->
    <base href="<%=basePath%>>">
    <title>用户登录</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- HTTP 1.1 -->
    <meta http-equiv="pragma" content="no-cache">
    <!-- HTTP 1.0 -->
    <meta http-equiv="cache-control" content="no-cache">
    <!-- Prevent caching at the proxy server -->
    <meta http-equiv="expires" content="0">
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE9" />
    <link rel="stylesheet" href="static/fontawesome@5.11.2/css/all.min.css">
    <link rel="stylesheet" href="static/bootstrap@4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="public/css/index.css">
</head>
<body>
    <div id="login_container" class="container">
        <form id="login_form" class="form-inline needs-validation" novalidate>
            <div class="form-row m-0">
                <label class="index_title">图书管理</label>
            </div>

            <div class="form-row mt-3 col-md-12">
                <div class="input-group">
                    <input type="text" name="username" class="form-control" placeholder="请输入用户名" autofocus="autofocus" required pattern="[a-zA-Z]\w{2,19}"/>
                    <div class="input-group-append">
                        <div class="input-group-text">
                            <i class="fas fa-user" aria-hidden="true"></i>
                        </div>
                    </div>
                    <div class="invalid-feedback">
                        请输入用户名（3-20位，字母、数字、_，且首位为字母）
                    </div>
                </div>
            </div>
            <div class="form-row mt-3 col-md-12">
                <div class="input-group">
                    <input type="password" name="password" class="form-control" placeholder="请输入密码" required pattern="\w{3,20}"/>
                    <div class="input-group-append">
                        <div class="input-group-text">
                            <i class="fas fa-lock" aria-hidden="true"></i>
                        </div>
                    </div>
                    <div class="invalid-feedback">
                        请输入密码（3-20位，大小写字母、数字、_）
                    </div>
                </div>
            </div>
            <div class="form-row mt-2 col-md-12">
                <div id="login_error" class="invalid-feedback"></div>
            </div>
            <div class="form-row mt-2 col-md-12">
                <label class="checkbox" style="color: lightblue; font-size: smaller">
                    <input type="checkbox" name="rememberMe" value="false" onclick="this.value=this.checked" />&nbsp;&nbsp;记住我
                </label>
            </div>
            <div class="form-row mt-3 mb-3 col-md-12">
                <input id="btn_to_register" type="button" class="btn btn-info col-md-5 ml-auto mr-3" value="注册账号" onclick="return toggle('#register_container', '#login_container');" />
                <input type="submit" class="btn btn-success col-md-4" value="登录"/>
            </div>
        </form>
    </div>

    <div id="register_container" class="container d-none">
        <form id="register_form" class="form-inline needs-validation" novalidate>
            <div class="form-row m-0">
                <label class="index_title">用户注册</label>
            </div>
            <div class="form-row mt-3 col-md-12">
                <div class="input-group">
                    <input type="text" name="username" class="form-control" placeholder="请输入用户名" autofocus="autofocus" required pattern="[a-zA-Z]\w{2,19}"/>
                    <div class="input-group-append">
                        <div class="input-group-text">
                            <i class="fas fa-user" aria-hidden="true"></i>
                        </div>
                    </div>
                    <div class="invalid-feedback">
                        请输入用户名（3-20位，字母、数字、_，且首位为字母）
                    </div>
                </div>
            </div>
            <div class="form-row mt-3 col-md-12">
                <div class="input-group">
                    <input id="register_password" type="password" name="password" class="form-control" placeholder="请输入密码" required pattern="(?=.*[a-z])(?=.*[A-Z])(?=.*\d)\w{6,20}"/>
                    <div class="input-group-append">
                        <div class="input-group-text">
                            <i class="fas fa-lock" aria-hidden="true"></i>
                        </div>
                    </div>
                    <div class="invalid-feedback">
                        请输入密码（6-20位，大小写字母、数字、_，且至少一个大写字母，小写字母及数字）
                    </div>
                </div>
            </div>
            <div class="form-row mt-3 col-md-12">
                <div class="input-group">
                    <input id="register_confirm_password" type="password" class="form-control" placeholder="确认密码" required />
                    <div class="input-group-append">
                        <div class="input-group-text">
                            <i class="fas fa-check-square" aria-hidden="true"></i>
                        </div>
                    </div>
                    <div class="invalid-feedback">
                        两次输入的密码不一致
                    </div>
                </div>
            </div>
            <div class="form-row mt-3 col-md-12">
                <div class="input-group">
                    <input type="text" name="email" class="form-control" pattern="[A-Za-z0-9_-]+[@](\S*)(net|com|cn|org|cc|tv|[0-9]{1,3})(\S*)" placeholder="请输入邮箱"/>
                    <div class="input-group-append">
                        <div class="input-group-text">
                            <i class="fas fa-envelope" aria-hidden="true"></i>
                        </div>
                    </div>
                </div>
            </div>
            <div class="form-row mt-3 mb-3 col-md-12">
                <input type="button" class="btn btn-info col-md-4 ml-auto mr-3" value="返回" onclick="return toggle('#login_container', '#register_container');" />
                <input type="submit" class="btn btn-success col-md-4" value="注册"/>
            </div>
        </form>
    </div>

    <script src="static/jquery@3.3.1/jquery.min.js"></script>
    <script src="static/fontawesome@5.11.2/js/all.min.js"></script>
    <script src="static/bootstrap@4.3.1/js/bootstrap.min.js"></script>
<!--    <script src="static/clipboard.js@2.0.6/clipboard.min.js"></script>-->
    <script src="public/js/app.js"></script>
    <script src="public/js/index.js"></script>
</body>
</html>
