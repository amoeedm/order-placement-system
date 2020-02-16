
export const deleteOrder = (id) =>{
    fetch('http://localhost:8080/orders/' + id, {
        method: 'DELETE'
    });
    window.location.reload();
};

export const editOrder = () =>{
    console.log("Buttion not in function yet: Edit");
    alert("Buttion not in function yet: Edit");
};

export const newOrder = () =>{
     console.log("Buttion not in function yet: New");
     alert("Buttion not in function yet:    New");
};