/**
 *  Forms Validation
 */

function validation(){
	let description = frm.description.value
	let category = frm.category.value;		    
	let value = frm.value.value;
	let status = frm.status.value;
	
	
	if(description.length == "" || category.length == "" || value.length == ""){
		alert('There are empty fields');
		
		if(description.length == ""){frm.description.focus(); return false;}
		else if(category.length == ""){frm.category.focus(); return false;}
		else if(value.length == "" ){frm.value.focus(); return false;}
		
		
	
	}else{
		document.forms["frm"].submit();
	}
}