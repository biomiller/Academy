const animals = ['dog', 'cat', 'hippopotamus', 'squid', 'unicorn'];

const zoo = animals
.filter((x)=>x.length<=7)
.map((x)=> x.charAt(0).toUpperCase() + x.slice(1) + "!")
.reduce(
    (acc,x,i,array)=>{
        if(i=array.length-1){acc+= " " + x} 
        else{acc+= " " + x + ","}
        return acc;
    }, "Animals:")

//.slice(0, -1);

//

document.getElementById("zoo").innerText = zoo;