import React from 'react'

 const Orders = ({ orders }) => {
      return (
        <div>
          <center><h1>Order List</h1></center>
          {orders.map((order) => (
          <div className="order">
            <div className="order-body">
              <h5 className="order-name">Order Id: {order.id}</h5>
              <h6 className="order-phone">Phone number: {order.phoneNumber}</h6>
              <h6 className="order-email">Email: {order.email}</h6>
              <h6 className="order-address-from">Moving From: {order.addressMovingFrom}</h6>
              <h6 className="order-address-to">Moving To: {order.addressMovingTo}</h6>
              <h6 className="order-date">Date: {order.serviceDate}</h6>
              <p className="order-note">Note: {order.orderNote}</p>
              <p className="order-packing">Packing: {order.packing}</p>
              <p className="order-moving">Moving: {order.moving}</p>
              <p className="order-cleaning">Cleaning: {order.cleaning}</p>
            </div>
          </div>
          ))}
        </div>
      )
    };

    export default Orders