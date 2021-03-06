<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt" %>


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
    &lt;<script src="assets/js/theme.js"></script>
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
		String flag=(String)session.getAttribute("flag")== null ? "" : (String)session.getAttribute("flag");
		
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
            <div class="row-content am-cf">
                <div class="row">
                    <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                        <div class="widget am-cf">
                            <div class="widget-head am-cf">
                                <div class="widget-title  am-cf">数据字典</div>


                            </div>
                            <div class="widget-body  am-fr">

                                <div class="am-u-sm-12 am-u-md-6 am-u-lg-6">
                                    <div class="am-form-group">
                                        <div class="am-btn-toolbar">
                                            <div class="am-btn-group am-btn-group-xs">
                                                <button type="button" id="sjzdinsert" class="am-btn am-btn-default am-btn-success"><span id="inserticon" class="am-icon-plus"></span> 新增</button>
                                                <button type="button" class="am-btn am-btn-default am-btn-secondary" ><span class="am-icon-save"></span> 保存</button>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="am-u-sm-12 am-u-md-6 am-u-lg-3">
                                    <div class="am-form-group tpl-table-list-select">

                                    </div>
                                </div>
                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    <div class="am-input-group am-input-group-sm tpl-form-border-form cl-p">
                                        
                                    </div>
                                </div>

                                <div class="am-u-sm-12">
                                    
                                    
	                                  <form id="sjzdupdateform" action="sjzdupdateAction" method="post">  
	                                    
	                                    <table id="sjzdquery" width="100%" class="am-table am-table-compact am-table-striped tpl-table-black " id="example-r">
	                                        <thead>
	                                            <tr>
	                                            	
	                                            	<th>数据字典类型</th>
	                                                <th>数据字典相应内容</th>
	                                                <th>操作</th>
	
	                                            
	                                            </tr>
	                                        </thead>
	                                        <tbody>
	                                        
	                                        <s:iterator value="sjzdList" var="sjzd">
	                                        
	                                            <tr class="gradeX">
	                                            	<!-- <td>${sjzd.sjzdid} </td> -->
	                                             	<td>${sjzd.type} </td>                                  
	                                                <td>${sjzd.content}</td>
	
	                                                <td>
	                                                    <div class="tpl-table-black-operation">
	                                                        <a id="edit" href="javascript:;"value="${sjzd.sjzdid}" ><i class="am-icon-pencil"></i>编辑</a>
	                                                        <a href="javascript:;" class="tpl-table-black-operation-del"><i class="am-icon-trash"></i>删除</a>
	                                                    </div>
	                                                </td>
	                                            </tr>
											</s:iterator>	
												
											<!-- 隐藏项 -->
											<input type="hidden" id="content" name="content" value=""/>
											<input type="hidden" id="content1" name="content1" value=""/>
											<input type="hidden" id="sjzdid" name="sjzdid" value=""/>
											
											
	                                            <!-- more data  分页 -->
	                                        </tbody>
	                                    </table>
									</form>
                                </div>
                                
                                
                                
                                <!-- 
                                
                                		以下是隐藏的数据字典
                                
                                
                                 -->
                                
                                 <div class="am-u-sm-12">
                                 
                                 <form id="sjzdinsertform" action="sjzdinsertAction" method="post">
                                 
                                    <table width="100%" style="display:none" class="am-table am-table-compact am-table-striped tpl-table-black " id="example-rabc">
                                    <caption>请在下面添加</caption>
                                        <thead>
                                            <tr>
                                            	<th>数据字典类型</th>
                                                <th>数据字典相应内容</th>
                                                <th>操作</th>

                                            
                                            </tr>
                                        </thead>
                                        <tbody>
                                       
                                        
                                            <tr class="gradeX">
                                             	<td><input class="tpl-header-search-box" type="text" style="width:80px" placeholder="请输入类型..." name="sjzdinserttype"></td>                                  
                                                <td><input class="tpl-header-search-box" type="text" style="width:80px" placeholder="请输入内容..." name="sjzdinsertcontent"></td>

                                                <td>
                                                    <div class="tpl-table-black-operation">
                                                        <a href="javascript:;">
                                                            <i class="am-icon-pencil"></i> 编辑
                                                        </a>
                                                        <input type="submit" style="display:none">
                                                        	<a id="insert" href="javascript:;" class="am-btn am-btn-default am-btn-secondary" style="color:#33b5e5;color:white">
                                                            <i class="am-icon-save" ></i>保存
                                                        </a>
                                                    </div>
                                                </td>
                                            </tr>
									
											
											
                                            
                                            
                                            

                                            
                                            <!-- more data  分页 -->
                                        </tbody>
                                    </table>
                                    
                                    </form>
                                    </div>
                                
                                
                                
                                <div class="am-u-lg-12 am-cf">

                                    <div class="am-fr">
                                        <!-- <ul class="am-pagination tpl-pagination">
                                            <li class="am-disabled"><a href="#">«</a></li>
                                            <li class="am-active"><a href="#">1</a></li>
                                            <li><a href="#">2</a></li>
                                            <li><a href="#">3</a></li>
                                            <li><a href="#">4</a></li>
                                            <li><a href="#">5</a></li>
                                            <li><a href="#">»</a></li>
                                        </ul> -->
                                    </div>
                                </div>
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
    	
    		$("#sjzdinsert").click(function(){
    		
    			console.log("insert  sjzd insert------");
    			
    			
    			var m=$("#sjzdinsert").text();
    			console.log(m+"----");

    			
    			if(m==' 新增'){
    			
    				//$("#sjzdinsert").text(" 放弃");
    				
    				$("#sjzdinsert").html('<span id="inserticon" class="am-icon-trash"></span> 放弃');
    				
					$("#sjzdinsert").css({"background":"red"});
					
    				
    				$("#example-rabc").show();
    				
    				
    				
    			}
    			
    			if(m==' 放弃'){
    			
    				//$("#sjzdinsert").text(" 新增");
    				
    				$("#sjzdinsert").html('<span id="inserticon" class="am-icon-plus"></span> 新增');
    				
    				$("#sjzdinsert").css({"background":"#00bb00"});
    				
    				$("#example-rabc").hide();
    				
    			}
    			
    			
    			
    		});
    		
    		
    		
    		$("#insert").click(function(){
    		
    			console.log("insert ....");
    		
    			$("#sjzdinsertform").submit();
    		
    		
    		});
    		
    		/**
    		*	可编辑表格
    		*
    		*/
    		$("#sjzdquery div a").click(function(){
    			
    			
    			
    			/*
    				n :: 当前点击的对象
    			*/
    			var n= $(this).text();
    			
    			console.log(n+"-------1");
    			
    			var sjzdid= $(this).attr("value");
    			
    			console.log(sjzdid+"-------2");
    			
    			var next=$(this).next("a").text();
    			
    			console.log(next+"-------3");
    			
    			
    			
    			if(n=="编辑"){
    			
    				$(this).html('<i class="am-icon-pencil"></i>确定');
    				$(this).css({"color":"red"});

    			} 

    			
    			if(next=="删除"){
    				$(this).next("a").html('<i class="am-icon-trash"></i>取消');
    				$(this).next("a").css({"color":"white"});
    			}
    			
    			if(n=="取消"){
    				
    				
    				$(this).html('<i class="am-icon-trash"></i>删除');
    				$(this).css({"color":"#ff0000"});
    			}
    			
    			if(n=="删除"){
    			
    				sjzdid= $(this).prev("a").attr("value");
    			
    				console.log("删除..."+sjzdid);
    				 $("#sjzdid").val(sjzdid);
    	
    				//$("#sjzdupdateform").submit();
    				$(this).attr("href","sjzddeleteAction?sjzdid="+sjzdid);

    			}
    			
    			
    			
    			/*
    				定义数组存修改后的text的数据
    			*/
    			var data = new Array(2);
    			var i=0;
    			
    			$(this).parent().parent().siblings("td").each(function() {  // 获取当前行的其他单元格
			
			            var m=$(this).html();
						console.log(m+":::");
						
						
						obj_text = $(this).find("input:text");    // 判断单元格下是否有文本框
						
						
						console.log(" obj_text :: "+obj_text.val());
						
						
						
						
						if(obj_text.val()!= null){
						
							data[i]=obj_text.val();
						
							console.log("adsdadasfaf");
						
							 $("#content").val(data[0]);
    						 $("#content1").val(data[1]);
    						 
    						 
    						 if(n=="确定"){
    			
			    				 $(this).html('<i class="am-icon-pencil"></i>编辑');
			    				 $(this).css({"color":"#888"});
			    				 $("#sjzdid").val(sjzdid);

				    				$("#sjzdupdateform").submit();
			    				 
			    			}

						}
						

						console.log("i::"+i)
							i++;
						
			            if(!obj_text.length)   // 如果没有文本框，则添加文本框使之可以编辑

							
			                $(this).html("<input type='text' style='border:solid 1px #555;background-color:#555;width:100px' value='"+$(this).text()+"'>");
			
			            else   // 如果已经存在文本框，则将其显示为文本框修改的值
						{
						
			                $(this).html(obj_text.val()); 
						
							console.log("  $(this).text()  "+ $(this).text());
							
							
						}
						
						
		
	    		});
	    		console.log("for(var e in data){=--------");
	    		
	    		for(var n =0; n<data.length; n++){
	    		
	    			console.log(data[n]+"---");
	    		}
	    		
	    		    
    		
    		});
    		

 /*   		
    		
    		$("#sjzdquery td").click(function(){
    		
    			console.log("------");
    			var tdvalue=$(this).text();
    			
    			console.log(":::"+tdvalue+":::");
    			
    			$(this).html("<input type='text' style='background-color: #555;width:80px' value='"+tdvalue+"'>");
    		
    		
    		});
 */   	
    	
    	
    	
    	})
    
    
    </script>

</body>

</html>
