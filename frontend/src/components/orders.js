import React from 'react';
import {Button} from 'react-bootstrap';
import {deleteOrder, newOrder, editOrder} from '../components/click.js';
import '../components/orders.css';

//Returning Orders based on input orders.
 const Orders = ({ orders }) => {

      return (
       
       //Top, static view of the database.
        <div>
          <p></p>
          <div id="left">  Order Management System</div>
       
          //Button for New Order.
          <div id="right"><Button variant="primary" onClick={newOrder}>New Order</Button></div>
       
          <p></p>
          <hr></hr>
            <table cellpadding="10">
            <tr>
              <td><h6>Order Id</h6></td>
              <td><h6>Date and Time</h6></td>
              <td><h6>Customer Name</h6></td>
              <td><h6>Phone</h6></td>
              <td><h6>Email</h6></td>
              <td><h6>From</h6></td>
              <td><h6>To</h6></td>
              <td><h6>Packing</h6></td>
              <td><h6>Moving</h6></td>
              <td><h6>Cleaning</h6></td>
              <td><h6>Note</h6></td>
              <td></td>
              <td></td>
             </tr>
       
          //Iterating each order and mapping for rendering attributes.
          {orders.map((order) => (
               <tr>
              <td><p className="order-name">{order.id}</p></td>
              <td><p className="order-date">{order.serviceDate}</p></td>
              <td><p className="order-date">{order.name}</p></td>
              <td><p className="order-phone">{order.phoneNumber}</p></td>
              <td><p className="order-email">{order.email}</p></td>
              <td><p className="order-address-from">{order.addressMovingFrom}</p></td>
              <td><p className="order-address-to">{order.addressMovingTo}</p></td>
              <td><p className="order-packing">{order.packing.toString()}</p></td>
              <td><p className="order-moving">{order.moving.toString()}</p></td>
              <td><p className="order-cleaning">{order.cleaning.toString()}</p></td>
              <td><p className="order-note">{order.orderNote}</p></td>
               
              //Buttons for editing and deleting current order.
              <td><Button variant="warning" onClick={editOrder}>Edit Order</Button></td>
              <td><Button variant="danger" onClick={() => deleteOrder(order.id)}>Delete Order</Button></td>
              </tr>
          ))}
        </table>
        <hr></hr>
        </div>
      )
    };

    export default Orders;
