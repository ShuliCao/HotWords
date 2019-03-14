<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<input type="text" id="asd" />
<button onclick="search()" >搜索</button>
<p id="name"></p>
<p id="expl"><!--这里是热词的解释--></p>
</body>
</html>
<script src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
			function search(){
				$.ajaxSetup({
					cache:false
				});
				$.ajax({
					type:"get",
					dataType:"JSON",
					url:"http://127.0.0.1:8081/Dazuoye/SearchServlet",
					data:{
						name2:$("input[id='asd']").val()
					},
					async:true,
					success:function(data){
						$("#name").text(data.name);
						$("#expl").text(data.expl);
					}
				});
			}
			
		</script>