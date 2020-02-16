import React, {Component} from 'react';
import Orders from './components/orders';

class App extends Component {

    state = {
        orders: []
    }

    componentDidMount() {
        fetch('http://localhost:8080/orders')
        .then(res => res.json())
        .then((data) => {
          this.setState({ orders: data })
        })
        .catch(console.log)
    }

    render () {
        return (
          <Orders orders={this.state.orders} />
        );
      }
    }

    export default App;