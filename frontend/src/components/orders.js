import React from 'react';
import {Button} from 'react-bootstrap';

 const Orders = ({ orders }) => {
      return (
        <div>
          <center><h3>ACME Moving Company</h3></center>
          <p></p>
          <Button variant="primary">New Order</Button>
          <p></p>
          <hr></hr>
            <table cellpadding="10">
            <tr>
              <td><h6>Order Id</h6></td>
              <td><h6>Service Date</h6></td>
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
              <td><Button variant="warning">Edit Order</Button></td>
              <td><Button variant="danger">Delete Order</Button></td>
              </tr>
          ))}
        </table>
        </div>
      )
    };

    export default Orders