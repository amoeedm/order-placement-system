import React, {Component} from 'react';
import Orders from './components/orders';

//Main component class.
class App extends Component {

    state = {
        orders: []
    }

//GETs all entries in the database.
    componentDidMount() {
        fetch('http://localhost:8080/orders')
        .then(res => res.json())
        .then((data) => {
          this.setState({ orders: data })
        })
        .catch(console.log)
    }

//Renders all entries in the dataabase by mapping array of Order components.
    render () {
        return (
            <Orders orders={this.state.orders} />
        );
      }
    }

    export default App;
