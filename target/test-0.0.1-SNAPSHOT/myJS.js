window.onload = customize;

function customize(){
	window.document.getElementById('div3').style.display = 'none';
}

function convertNumber()
{
    window.document.getElementById('div3').style.display = 'none';
	var q_str = 'method=convertNum&type=number&value='+document.getElementById('t1').value;
	doAjax('MyApp_Servlet',q_str,'convertNumber_back','post',0);
}
function convertNumber_back(result)
{
	if (result.substring(0,5)=='error'){
	   window.document.getElementById('div3').style.display = 'block';
	   window.document.getElementById('div3').innerHTML="<p style='color:red;'><b>"+result.substring(6)+"</b></p>";
   }else{
	   window.document.getElementById('t2').value=""+result;
   }
}

function convertPrice()
{
    window.document.getElementById('div3').style.display = 'none';
	var q_str = 'method=convertNum&type=price&value='+document.getElementById('t3').value;
	doAjax('MyApp_Servlet',q_str,'convertPrice_back','post',0);
}
function convertPrice_back(result)
{
	if (result.substring(0,5)=='error'){
	   window.document.getElementById('div3').style.display = 'block';
	   window.document.getElementById('div3').innerHTML="<p style='color:red;'><b>"+result.substring(6)+"</b></p>";
   }else{
	   window.document.getElementById('t4').value=""+result;
   }
}

function add(){
	var q_str = 'method=add&type=number&value='+document.getElementById('add1').value
				+'&value2='+document.getElementById('add2').value;
	doAjax('MyApp_Servlet',q_str,'add_back','post',0);
}

function add_back(result){
	if (result.substring(0,5)=='error'){
		   window.document.getElementById('div3').style.display = 'block';
		   window.document.getElementById('div3').innerHTML="<p style='color:red;'><b>"+result.substring(6)+"</b></p>";
	   }else{
		   window.document.getElementById('addResult').value=""+result;
	   }
}

function convertCurrency(){
	var q_str = 'method=convertCur&type=number&value='+document.getElementById('conv1').value
				+'&value2='+document.getElementById('conv2').value
				+'&value3='+document.getElementById('conv3').value;
	doAjax('MyApp_Servlet',q_str,'convertCurrency_back','post',0);
}

function convertCurrency_back(result){
	if (result.substring(0,5)=='error'){
		   window.document.getElementById('div3').style.display = 'block';
		   window.document.getElementById('div3').innerHTML="<p style='color:red;'><b>"+result.substring(6)+"</b></p>";
	   }else{
		   window.document.getElementById('convResult').value=""+result;
	   }
}
