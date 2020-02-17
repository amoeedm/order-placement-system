
//Function that is invoked by button clicks.

//DELETEs current order by using id and reloads to re-render.
export const deleteOrder = (id) =>{
    fetch('http://localhost:8080/orders/' + id, {
        method: 'DELETE'
    });
    window.location.reload();
};

//Not done yet.
export const editOrder = () =>{
    console.log("Buttion not in function yet: Edit");
    alert("Buttion not in function yet: Edit");
};

//Not done yet.
export const newOrder = () =>{
     console.log("Buttion not in function yet: New");
     alert("Buttion not in function yet:    New");
};
