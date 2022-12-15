
async function getSheep() {
    const sheepElem = document.getElementById("sheep");
    try {
        const response = await fetch('http://localhost:8080/api/sheep');
        const responseJSO = await response.json();

        // If I want to make a loop 
        
        // for(sheep of responseJSO) {
        //     sheepElem.innerText = `I have a dog named ${responseJSO.name} and she is of a ${responseJSO.color} color.`;} 
        // }
    sheepElem.innerText = `I have a dog named ${responseJSO[2].name} and she is of a ${responseJSO[2].color} color.`;} 
    
    catch (e) {
        console.log("oh no: " + e.message);
    }
}

getSheep();



// async function postSheep() {
//     const sheepName = document.getElementById("name");
//     const sheepColor = document.getElementById("color");
//     const button = document.getElementById("submit"); 
//     try {
//         const response = await fetch('http://localhost:8080/api/sheep');
//         const responseJSO = await response.json();
//     sheepElem.innerText = `I have a dog named ${responseJSO[2].name} and she is of a ${responseJSO[2].color} color.`;} 
    
//     catch (e) {
//         console.log(e);
//     }
// }

// postSheep();