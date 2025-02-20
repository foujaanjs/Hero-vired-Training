

function handlesubmit(event){
    event.preventDefault();

    var name = document.getElementById("name").value;
    var address = document.getElementById("address").value;
    
    alert(`name:${name}\n address:${address} `);
   
}