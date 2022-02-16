"use strict";
window.onload = customize;

function customize(){
	window.document.getElementById('div3').style.display = 'none';
}


function convertNumbers()
{
	var resultList = [];
	resultList.push(document.getElementById("addResult").value);
	resultList.push(document.getElementById("subResult").value);
	resultList.push(document.getElementById("mulResult").value);
	resultList.push(document.getElementById("divideResult").value);

	resultList.forEach((value, i) => {
		if (!isNaN(value)){
			var q_str = "method=convertNum&type=" + i + "&value=" + value + "&value2=0";
			doAjax('MyApp_Servlet',q_str,'convertNumbers_back','post',0);
		}
		else{
			//
		}
	});
}

function convertNumbers_back(result)
{
	if (result.substring(0,5)=='error'){
		   window.document.getElementById('div3').style.display = 'block';
		   window.document.getElementById('div3').innerHTML="<p style='color:red;'><b>"+result.substring(6)+"</b></p>";
		   return;
	}
	window.document.getElementById('div3').style.display = 'none';
	
	var resultList = [];
	resultList.push(document.getElementById("addResult"));
	resultList.push(document.getElementById("subResult"));
	resultList.push(document.getElementById("mulResult"));
	resultList.push(document.getElementById("divideResult"));
	
	resultList[result.substring(0,1)].value = ""+result.substring(2);
	
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
		   window.document.getElementById('div3').style.display = 'none';
		   window.document.getElementById('addResult').value=""+result.substring(4);
	   }
}

function subtract(){
	var q_str = 'method=sub&type=number&value='+document.getElementById('sub1').value
	+'&value2='+document.getElementById('sub2').value;
	doAjax('MyApp_Servlet',q_str,'subtract_back','post',0);
}

function subtract_back(result){
	if (result.substring(0,5)=='error'){
		   window.document.getElementById('div3').style.display = 'block';
		   window.document.getElementById('div3').innerHTML="<p style='color:red;'><b>"+result.substring(6)+"</b></p>";
	   }else{
		   window.document.getElementById('div3').style.display = 'none';
		   window.document.getElementById('subResult').value=""+result.substring(4);
	   }
}

function multiply(){
	var q_str = 'method=mul&type=number&value='+document.getElementById('mul1').value
	+'&value2='+document.getElementById('mul2').value;
	doAjax('MyApp_Servlet',q_str,'multiply_back','post',0);
}

function multiply_back(result){
	if (result.substring(0,5)=='error'){
		   window.document.getElementById('div3').style.display = 'block';
		   window.document.getElementById('div3').innerHTML="<p style='color:red;'><b>"+result.substring(6)+"</b></p>";
	   }else{
		   window.document.getElementById('div3').style.display = 'none';
		   window.document.getElementById('mulResult').value=""+result.substring(4);
	   }
}

function divide(){
	var q_str = 'method=div&type=number&value='+document.getElementById('divide1').value
	+'&value2='+document.getElementById('divide2').value;
	doAjax('MyApp_Servlet',q_str,'divide_back','post',0);
}

function divide_back(result){
	if (result.substring(0,5)=='error'){
		   window.document.getElementById('div3').style.display = 'block';
		   window.document.getElementById('div3').innerHTML="<p style='color:red;'><b>"+result.substring(6)+"</b></p>";
	   }else{
		   window.document.getElementById('div3').style.display = 'none';
		   window.document.getElementById('divideResult').value=""+result.substring(4);
	   }
}

