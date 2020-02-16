import React, {Component} from 'react';

class App extends Component {

    constructor(props){
    super(props);
    this.state = {
        id: '',
        };
    }

    componentDidMount(){
    fetch('http://localhost:8080/orders')
        .then(res => {
            const data = res.json();
            console.log(data);
            this.setState({
                id: data
            });
        }).catch(err => {
            console.log("Error.");
        });
    }

    render(){
     if (this.state.length == 0) {
        return <div>Loading...</div>;
     }
     return (
        <div>Test:</div>
      );
    }
}

export default App;