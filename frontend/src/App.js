import React, {Component} from 'react';

class App extends Component {

    constructor(props){
    super(props);
    this.state = {
        id: null,
        };
    }

    componentDidMount(){
    fetch('http://localhost:8080/orders')
        .then(res => {
            const data = res.json();
            this.setState({
                id: data
            });
            console.log(this.state.id);
        }).catch(err => {
            console.log("Error.");
        });
    }

    render(){
     if(this.state.id == null) {
        return <div>Loading...</div>;
     }
     return (
        <div> {this.state.id} </div>
        );
    }

}

export default App;