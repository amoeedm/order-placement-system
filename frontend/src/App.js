import React, {Component} from 'react';

class App extends Component {

    constructor(props){
    super(props);
    this.state = {
        id: [],
        };
    }

    componentDidMount(){
    fetch('https://localhost:8080/orders')
        .then(({ results }) => this.setState({ id: results }));
    }

    render(){
        return <div> {this.state.id} </div>;
    }

}

export default App;