import React from 'react'

 const Orders = ({ orders }) => {
      return (
        <div>
          <center><h1>Contact List</h1></center>
          {orders.map((order) => (
          <div className="order">
            <div className="order-body">
              <h5 className="order-name">{order.name}</h5>
              <h6 className="order-email">{order.email}</h6>
              <p className="order-note">{order.note}</p>
            </div>
          </div>
          ))}
        </div>
      )
    };

    export default Orders