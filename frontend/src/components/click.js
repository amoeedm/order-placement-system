import React from 'react';

export const deleteOrder = (id) =>{
    fetch('http://localhost:8080/orders/' + id, {
        method: 'DELETE'
    });
    window.location.reload();
};

export const editOrder = () =>{
    console.log("Edit");
    alert("Edit");
};

export const newOrder = () =>{
    console.log("New");
    alert("New");
};