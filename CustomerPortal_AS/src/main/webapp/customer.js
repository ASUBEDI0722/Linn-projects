/**
 * 
 */

var inputFirstName = document.getElementById('first_name');
var inputLastName = document.getElementById('last_name');
var inputEmail = document.getElementById('e-mail');
var inputPhone = document.getElementById('contact-number');
var inputAddress1 = document.getElementById('address1');
var inputAddress = document.getElementById('address2');
var inputCity = document.getElementById('City');
var inputState = document.getElementById('State');
var inputZip = document.getElementById('zipcode');
/*var button = document.getElementsByTagName('input'[9]);*/

var button = document.getElementById('submit-form');

var regEx = "/^[^\s@]+@[^\s@]+\.[^\s@]+$/";

const form = document.getElementById('customer-form');

button.disabled = true;

form.addEventListener("change", validateForm());


function validateForm() {

if(first_name.value.length != 0 && last_name.value.length != 0 && e-mail.value.length != 0 && contact-number.value.length != 0 && address1.value.length != 0 && City.value.length != 0 && State.value.length != 0 && zipcode.value.length != 0 && regEx.test(e-mail.value) == true ){
		button.disabled = false ;
   }else{
   		button.disabled = true ;
   }};

