<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <base href="<%=basePath%>">
<!--    <meta charset="UTF-8">-->
    <title>图书管理</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- HTTP 1.1 -->
    <meta http-equiv="pragma" content="no-cache">
    <!-- HTTP 1.0 -->
    <meta http-equiv="cache-control" content="no-cache">
    <!-- Prevent caching at the proxy server -->
    <meta http-equiv="expires" content="0">
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE9" />
    <!-- Font Awesome -->
    <link rel="stylesheet" href="static/fontawesome@5.11.2/css/all.min.css">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="static/bootstrap@4.3.1/css/bootstrap.min.css">
    <!-- Bootstrap Select 下拉插件 -->
    <link rel="stylesheet" href="static/bootstrap-select@1.13.9/css/bootstrap-select.min.css">
    <!-- Bootstrap 日期插件 -->
    <link rel="stylesheet" href="static/tempusdominus@5.0.1-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">
    <!-- Bootstrap 表格插件 -->
    <link rel="stylesheet" href="static/bootstrap-table@1.16.0/bootstrap-table.min.css">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="javascript:void(0);">
            <img src="public/images/head.jpg" width="30" height="30" class="d-inline-block align-top" alt="">
            图书管理系统
        </a>

        <ul id="main_nav" class="nav navbar-nav ml-auto" role="tablist">
            <li class="nav-item">
                <a class="nav-link" id="classes_tab" data-toggle="tab" href="#classes_panel" role="tab" aria-controls="classes_panel" aria-selected="false">班级管理</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" id="stu_tab" data-toggle="tab" href="#stu_panel" role="tab" aria-controls="stu_panel" aria-selected="false">学生管理</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" id="book_tab" data-toggle="tab" href="#book_panel" role="tab" aria-controls="book_panel" aria-selected="false">图书管理</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" id="borrow_record_tab" data-toggle="tab" href="#borrow_record_panel" role="tab" aria-controls="borrow_record_panel" aria-selected="false">借阅管理</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" id="user_tab" data-toggle="tab" href="#user_panel" role="tab" aria-controls="user_panel" aria-selected="false">用户管理</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    欢迎您xxx
                </a>
                <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" id="settings_tab" data-toggle="tab" href="#settings_panel" role="tab" aria-controls="settings_panel" aria-selected="false">个人资料</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#" onclick="return logout();">注销</a>
                </div>
            </li>
        </ul>
    </nav>
    <!-- Tab panes -->
    <div class="tab-content ml-3 mr-3">
        <div class="tab-pane" id="classes_panel" role="tabpanel" aria-labelledby="classes_tab">
            <table id="classes_table"></table>
        </div>
        <div class="tab-pane" id="stu_panel" role="tabpanel" aria-labelledby="stu_tab">
            <table id="stu_table"></table>
        </div>
        <div class="tab-pane" id="book_panel" role="tabpanel" aria-labelledby="book_tab">
            <table id="book_table"></table>
        </div>
        <div class="tab-pane" id="borrow_record_panel" role="tabpanel" aria-labelledby="borrow_record_tab">
            <table id="borrow_record_table"></table>
        </div>
        <div class="tab-pane" id="user_panel" role="tabpanel" aria-labelledby="user_tab">
            <table id="user_table"></table>
        </div>
        <div class="tab-pane" id="settings_panel" role="tabpanel" aria-labelledby="settings_tab">
            <div class="mt-3">
                <p class="lead">超级管理员可以修改用户信息</p>
                <p>普通用户就只能修改自己的个人信息哦，但是这样涉及权限的管理，我们就不实现啦😜</p>
<!--            <table id="settings_table">Settings</table>-->
                <select class="selectpicker" data-live-search="true" multiple data-max-options="5" title="你可以点我看看哦" data-selected-text-format="count" data-actions-box="true">
                    <optgroup label="咖啡馆">
                        <option>星巴克</option>
                        <option>康泰克</option>
                        <option>欧阳克</option>
                    </optgroup>
                    <optgroup label="火锅店">
                        <option>重庆老火锅</option>
                        <option>西安本地锅</option>
                        <option>北京雾霾锅</option>
                    </optgroup>
                    <optgroup label="烧烤店">
                        <option>假装烧烤店</option>
                        <option>潜伏烧烤店</option>
                        <option>女装烧烤店</option>
                    </optgroup>
                </select>
            </div>
        </div>
    </div>

    <!-- jQuery -->
    <script src="static/jquery@3.3.1/jquery.js"></script>
    <!-- Font Awesome -->
    <script src="static/fontawesome@5.11.2/js/all.min.js"></script>
    <!-- Bootstrap -->
<!--    <script src="static/popper@1.15.0/umd/popper.min.js"></script>-->
<!--    <script src="static/bootstrap@4.3.1/js/bootstrap.min.js"></script>-->
    <script src="static/bootstrap@4.3.1/js/bootstrap.bundle.min.js"></script>
    <!-- Bootstrap Select 下拉插件 -->
    <script src="static/bootstrap-select@1.13.9/js/bootstrap-select.min.js"></script>
    <script src="static/bootstrap-select@1.13.9/js/i18n/defaults-zh_CN.min.js"></script>
    <!-- Bootstrap 日期插件 -->
    <script src="static/moment@2.22.2/moment-with-locales.min.js"></script>
    <script src="static/tempusdominus@5.0.1-bootstrap-4/js/tempusdominus-bootstrap-4.min.js"></script>
    <!-- Bootstrap 表格插件 -->
    <script src="static/bootstrap-table@1.16.0/bootstrap-table.min.js"></script>
    <script src="static/bootstrap-table@1.16.0/locale/bootstrap-table-zh-CN.min.js"></script>
    <!-- 复制粘贴插件 -->
    <script src="static/clipboard.js@2.0.6/clipboard.min.js"></script>
    <script src="public/js/app.js"></script>
    <script src="public/js/main.js"></script>
</body>
</html>