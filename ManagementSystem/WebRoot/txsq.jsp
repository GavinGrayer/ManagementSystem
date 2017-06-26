<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

	<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Amaze UI Admin index Examples</title>
    <meta name="description" content="这是一个 index 页面">
    <meta name="keywords" content="index">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="icon" type="image/png" href="assets/i/favicon.png">
    <link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
    <meta name="apple-mobile-web-app-title" content="Amaze UI" />
    <script src="http://cdn.bootcss.com/echarts/3.3.2/echarts.min.js"></script>
    <link rel="stylesheet" href="assets/css/amazeui.min.css" />
    <link rel="stylesheet" href="assets/css/amazeui.datatables.min.css" />
    <link rel="stylesheet" href="assets/css/app.css">
    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>

</head>

<body data-type="widgets">
    <script src="assets/js/theme.js"></script>
    <div class="am-g tpl-g">
        <!-- 头部 -->
        <header>
            <!-- logo -->
            <div class="am-fl tpl-header-logo">
                <a href="javascript:;"><img src="assets/img/logo.png" alt=""></a>
            </div>
            <!-- 右侧内容 -->
            <div class="tpl-header-fluid">
                <!-- 侧边切换 -->
                <div class="am-fl tpl-header-switch-button am-icon-list">
                    <span>

                </span>
                </div>
                <!-- 搜索 -->
                <!-- <div class="am-fl tpl-header-search">
                    <form class="tpl-header-search-form" action="javascript:;">
                        <button class="tpl-header-search-btn am-icon-search"></button>
                        <input class="tpl-header-search-box" type="text" placeholder="搜索内容...">
                    </form>
                </div>-->
                <!-- 其它功能-->
                <div class="am-fr tpl-header-navbar">
                    <ul>
                        <!-- 欢迎语 -->
                        <li class="am-text-sm tpl-header-navbar-welcome">
                            <a href="javascript:;">
							
							 
							<span id="time" >    
								<script>     
								document.getElementById('time').innerHTML=new Date().toLocaleString();     
								setInterval("document.getElementById('time').innerHTML=new Date().toLocaleString();",1000);  
								</script>    
							</span>&nbsp;&nbsp;&nbsp;&nbsp;欢迎你, <span>${sessionScope.username} </span> </a>
                        </li>

                        <!-- 新邮件 -->
                        <li class="am-dropdown tpl-dropdown" data-am-dropdown>
                            <a href="javascript:;" class="am-dropdown-toggle tpl-dropdown-toggle" data-am-dropdown-toggle>
                                <i class="am-icon-envelope"></i>
                                <span class="am-badge am-badge-success am-round item-feed-badge">4</span>
                            </a>
                            <!-- 弹出列表 -->
                            <ul class="am-dropdown-content tpl-dropdown-content">
                                <li class="tpl-dropdown-menu-messages">
                                    <a href="javascript:;" class="tpl-dropdown-menu-messages-item am-cf">
                                        <div class="menu-messages-ico">
                                            <img src="assets/img/user04.png" alt="">
                                        </div>
                                        <div class="menu-messages-time">
                                            3小时前
                                        </div>
                                        <div class="menu-messages-content">
                                            <div class="menu-messages-content-title">
                                                <i class="am-icon-circle-o am-text-success"></i>
                                                <span>夕风色</span>
                                            </div>
                                            <div class="am-text-truncate"> Amaze UI 的诞生，依托于 GitHub 及其他技术社区上一些优秀的资源；Amaze UI 的成长，则离不开用户的支持。 </div>
                                            <div class="menu-messages-content-time">2016-09-21 下午 16:40</div>
                                        </div>
                                    </a>
                                </li>

                                <li class="tpl-dropdown-menu-messages">
                                    <a href="javascript:;" class="tpl-dropdown-menu-messages-item am-cf">
                                        <div class="menu-messages-ico">
                                            <img src="assets/img/user02.png" alt="">
                                        </div>
                                        <div class="menu-messages-time">
                                            5天前
                                        </div>
                                        <div class="menu-messages-content">
                                            <div class="menu-messages-content-title">
                                                <i class="am-icon-circle-o am-text-warning"></i>
                                                <span>禁言小张</span>
                                            </div>
                                            <div class="am-text-truncate"> 为了能最准确的传达所描述的问题， 建议你在反馈时附上演示，方便我们理解。 </div>
                                            <div class="menu-messages-content-time">2016-09-16 上午 09:23</div>
                                        </div>
                                    </a>
                                </li>
                                <li class="tpl-dropdown-menu-messages">
                                    <a href="javascript:;" class="tpl-dropdown-menu-messages-item am-cf">
                                        <i class="am-icon-circle-o"></i> 进入列表…
                                    </a>
                                </li>
                            </ul>
                        </li>

                        <!-- 新提示 -->
                        <li class="am-dropdown" data-am-dropdown>
                            <a href="javascript:;" class="am-dropdown-toggle" data-am-dropdown-toggle>
                                <i class="am-icon-bell"></i>
                                <span class="am-badge am-badge-warning am-round item-feed-badge">5</span>
                            </a>

                            <!-- 弹出列表 -->
                            <ul class="am-dropdown-content tpl-dropdown-content">
                                <li class="tpl-dropdown-menu-notifications">
                                    <a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
                                        <div class="tpl-dropdown-menu-notifications-title">
                                            <i class="am-icon-line-chart"></i>
                                            <span> 有6笔新的销售订单</span>
                                        </div>
                                        <div class="tpl-dropdown-menu-notifications-time">
                                            12分钟前
                                        </div>
                                    </a>
                                </li>
                                <li class="tpl-dropdown-menu-notifications">
                                    <a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
                                        <div class="tpl-dropdown-menu-notifications-title">
                                            <i class="am-icon-star"></i>
                                            <span> 有3个来自人事部的消息</span>
                                        </div>
                                        <div class="tpl-dropdown-menu-notifications-time">
                                            30分钟前
                                        </div>
                                    </a>
                                </li>
                                <li class="tpl-dropdown-menu-notifications">
                                    <a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
                                        <div class="tpl-dropdown-menu-notifications-title">
                                            <i class="am-icon-folder-o"></i>
                                            <span> 上午开会记录存档</span>
                                        </div>
                                        <div class="tpl-dropdown-menu-notifications-time">
                                            1天前
                                        </div>
                                    </a>
                                </li>


                                <li class="tpl-dropdown-menu-notifications">
                                    <a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
                                        <i class="am-icon-bell"></i> 进入列表…
                                    </a>
                                </li>
                            </ul>
                        </li>

                        <!-- 退出 -->
                        <li class="am-text-sm">
                            <a href="login.jsp" style="text-decoration:none;">
                                <span class="am-icon-sign-out"></span> 退出
                            </a>
                        </li>
                    </ul>
                </div>
            </div>

        </header>
        <!-- 风格切换 -->
        <div class="tpl-skiner">
            <div class="tpl-skiner-toggle am-icon-cog">
            </div>
            <div class="tpl-skiner-content">
                <div class="tpl-skiner-content-title">
                    选择主题
                </div>
                <div class="tpl-skiner-content-bar">
                    <span class="skiner-color skiner-white" data-color="theme-white"></span>
                    <span class="skiner-color skiner-black" data-color="theme-black"></span>
                </div>
            </div>
        </div>
		
		
        <!-- 侧边导航栏 -->
        <div class="left-sidebar">
            <!-- 用户信息 -->
            <div class="tpl-sidebar-user-panel">
                <div class="tpl-user-panel-slide-toggleable">
                    <div class="tpl-user-panel-profile-picture">
                        <img src="assets/img/user04.png" alt="">
                    </div>
                    <span class="user-panel-logged-in-text">
              <i class="am-icon-circle-o am-text-success tpl-user-panel-status-icon"></i>
              ${sessionScope.username} 
          </span>
                    <a href="javascript:;" class="tpl-user-panel-action-link"> <span class="am-icon-pencil"></span> 账号设置</a>
                </div>
            </div>

            <!-- 菜单 -->
            <ul class="sidebar-nav">
                <li class="sidebar-nav-heading">Components <span class="sidebar-nav-heading-info"> 附加组件</span></li>
                <li class="sidebar-nav-link">
                    <a href="index.jsp" class="active">
                        <i class="am-icon-home sidebar-nav-link-logo"></i> 首页
                    </a>
                </li>
               
                
                <%
		String flag=(String)session.getAttribute("flag")== null ? "" : (String)session.getAttribute("flag");
		
		if(flag.equals("员工")){
		
		
		}else{
%>		
                
                <li class="sidebar-nav-link">
                    <a href="sjzdqueryAction">
                        <i class="am-icon-table sidebar-nav-link-logo"></i> 数据字典
                    </a>
                </li>
                
                <li class="sidebar-nav-link">
                    <a href="queryUseraAction">
                        <i class="am-icon-calendar sidebar-nav-link-logo"></i> 员工查询
                    </a>
                </li>
                
      <%		
		}

 %>         
                

 
 

                <li class="sidebar-nav-heading">Page<span class="sidebar-nav-heading-info"> 常用页面</span></li>
				
				
				<!--

								===============数据列表
				
				-->
				
                <li class="sidebar-nav-link">
                    <a href="javascript:;" class="sidebar-nav-sub-title">
                        <i class="am-icon-table sidebar-nav-link-logo"></i> 申请列表
                        <span class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
                    </a>
                    <ul class="sidebar-nav sidebar-nav-sub">
                       <li class="sidebar-nav-link">
                            <a href="kqjlsjzdAction?type=考勤">
                                <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 考勤记录
                            </a>
                        </li>

                        <li class="sidebar-nav-link">
                            <a href="jqsqsjzdAction?type=假">
                                <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 假期申请
                            </a>
                        </li>
						
						 <li class="sidebar-nav-link">
                            <a href="ccsqsjzdAction?type=出差">
                                <span class="am-icon-angle-right sidebar-nav-link-logo"></span>出差申请
                            </a>
                        </li>
						
						 <li class="sidebar-nav-link">
                            <a href="jbsq.jsp">
                                <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 加班申请
                            </a>
                        </li>
						
						<li class="sidebar-nav-link">
                            <a href="txsq.jsp">
                                <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 调休申请
                            </a>
                        </li>
                        
 
						
                    </ul>
                </li>
				
				
				
<%
		 flag=(String)session.getAttribute("flag")== null ? "" : (String)session.getAttribute("flag");
		
		if(flag.equals("员工")){
		
		
		}else{
%>		
	
		<!--

								===============数据查询
				
				-->
				
                <li class="sidebar-nav-link">
                    <a href="javascript:;" class="sidebar-nav-sub-title">
                        <i class="am-icon-table sidebar-nav-link-logo"></i> 数据查询
                        <span class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
                    </a>
                    <ul class="sidebar-nav sidebar-nav-sub">
					
						 <li class="sidebar-nav-link">
                            <a href="jqQueryAction?type=考勤">
                                <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 考勤查询
                            </a>
                        </li>
					


                        <li class="sidebar-nav-link">
                            <a href="jqQueryAction?type=假">
                                <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 假期查询
                            </a>
                        </li>
						
						 <li class="sidebar-nav-link">
                            <a href="jqQueryAction?type=出差">
                                <span class="am-icon-angle-right sidebar-nav-link-logo"></span>出差查询
                            </a>
                        </li>
						
						 <li class="sidebar-nav-link">
                            <a href="jbQueryAction?type=加班">
                                <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 加班查询
                            </a>
                        </li>
						
						<li class="sidebar-nav-link">
                            <a href="txQueryAction?type=调休">
                                <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 调休查询
                            </a>
                        </li>
                        
                       
						
						
                    </ul>
                </li>

		
<%		
		}

 %>

            </ul>
        </div>





		
		


        <!-- 内容区域 -->
        <div class="tpl-content-wrapper">

            <div class="container-fluid am-cf">
                <div class="row">
                    <div class="am-u-sm-12 am-u-md-12 am-u-lg-9">
                        <div class="page-header-heading"><span class="am-icon-home page-header-heading-icon"></span> 调休申请 <small>Amaze UI</small></div>
                        <p class="page-header-description"> leave in lieu</p>
                    </div>
                    
                </div>

            </div>

            <div class="row-content am-cf">


                <div class="row">

                    <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                        <div class="widget am-cf">
                            <div class="widget-head am-cf">
                                <div class="widget-title am-fl">填写</div>
                                <div class="widget-function am-fr">
                                    <a href="javascript:;" class="am-icon-cog"></a>
                                </div>
                            </div>
                            <div class="widget-body am-fr">

                                <form id="txform" class="am-form tpl-form-line-form" action="txsqAction" method="post">
                                    <div class="am-form-group">
                                        <label for="user-name" class="am-u-sm-3 am-form-label">申请日期 <span class="tpl-form-line-small-title">Today</span></label>
                                        <div class="am-u-sm-9">
                                            <input type="text" class="tpl-form-input" name="today"	id="today" placeholder="点击自动填写申请日期" value="">
                                            <small>请点击自动填写申请日期</small>
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="user-email" class="am-u-sm-3 am-form-label">调休时间 <span class="tpl-form-line-small-title">Time</span></label>
                                        <div class="am-u-sm-9">
                                            <input type="text" id="txtime" name="txtime" class="am-form-field tpl-form-no-bg" placeholder="调休时间" data-am-datepicker="" readonly>
                                            <small>调休时间为必填</small>
                                        </div>
                                    </div>

                                								
									<div class="am-form-group">
                                        <label class="am-u-sm-3 am-form-label">调休时长 <span class="tpl-form-line-small-title">SEO</span></label>
                                        <div class="am-u-sm-9">
                                            <input type="text" id="txmethod" name="txmethod" placeholder="调休时长">
											<small>请填写调休时长</small>
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label class="am-u-sm-3 am-form-label">未休时长 <span class="tpl-form-line-small-title">SEO</span></label>
                                        <div class="am-u-sm-9">
                                            <input type="text"  id="wxmethod" name="wxmethod" placeholder="未休时长">
											<small>请点击自动填写未休时长=加班时长-所有调休时长</small>
                                        </div>
                                    </div>
									
	


                                    <div class="am-form-group">
                                        <label for="user-intro" class="am-u-sm-3 am-form-label">调休原因</label>
                                        <div class="am-u-sm-9">
                                            <textarea class="" rows="10" name="reason" id="user-intro" placeholder="请输入调休原因"></textarea>
                                        	<input type="hidden" name="username" value="${sessionScope.username}">
                                        
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <div class="am-u-sm-9 am-u-sm-push-3">
                                            <button type="submit" class="am-btn am-btn-primary tpl-btn-bg-color-success ">提交</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>
   
    <script src="http://cdn.bootcss.com/amazeui/2.7.2/js/amazeui.min.js"></script>
    <script src="assets/js/amazeui.datatables.min.js"></script>
    <script src="assets/js/dataTables.responsive.min.js"></script>
    <script src="assets/js/app.js"></script>
	
	
	    
    <script type="text/javascript">
    	$(function(){
    	
    		$("#today").click(function(){
    			
    			
    			function p(s) {
				    return s < 10 ? '0' + s: s;
				}
    			
    			
    			console.log("hello today");
    			var myDate = new Date();
    			
				//获取当前年
				var year=myDate.getFullYear();
				//获取当前月
				var month=myDate.getMonth()+1;
				//获取当前日
				var date=myDate.getDate(); 
				var h=myDate.getHours();       //获取当前小时数(0-23)
				var m=myDate.getMinutes();     //获取当前分钟数(0-59)
				var s=myDate.getSeconds();  
				
				var now=year+'-'+p(month)+"-"+p(date)+" "+p(h)+':'+p(m)+":"+p(s);
				
				var now1=year+'-'+p(month)+"-"+p(date);
				$("#today").val(now1);
				
    			console.log(now);
    		});
    	
    	
    	
    	$("#wxmethod").click(function(){
    	
    		console.log("---ajax---");
    		
    		var params=$("#txform").serialize();
    		
    		console.log(params+"------");
    	
    		$.ajax({
					url:"txAjaxAction",
					data:params,
					success:function(data){
						
						console.log("从ajax得来的值：----"+data);
						
						$("#wxmethod").val(data);
						
						
					},
					error:function(){
						alert("出错了");
					}
				
				});
    	
    	});
    	
    	
    	
    	
    	})
    
    
    </script>
    
    

	
	

</body>



</html>
