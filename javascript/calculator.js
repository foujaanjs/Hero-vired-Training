let a = parseFloat(prompt("Number one:"));
var b = parseFloat(prompt("number two:"));
var opr = prompt("Enter the value: ");
if(opr == "+" ){
    add();
}
else if(opr == "-"){
    sub();
}
else if(opr == "*"){
    mul();
}
else if(opr == "/"){
    div();
}
else{
    console.log("I am Sry Try Next time");
}

function add(){
    console.log(a + b);    
}

function sub(){
    console.log(a-b);
}
function mul(){
    console.log(a*b);
}
function div(){
    console.log(a/b);
}