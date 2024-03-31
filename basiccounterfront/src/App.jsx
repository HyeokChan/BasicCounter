import './App.css';
import React, { useState } from 'react';
import axios from 'axios';

function App() {
    const [count, setCount] = useState(0);
    const increaseCount = async (e) => {
        const postData = {
            count: count
        }
        axios.post('http://localhost:8081/api/count/increase', postData)
            .then(response => {
                setCount(response.data);
            });
    }

    const decreaseCount = (e) => {
        const postData = {
            count : count
        }
        axios.post('http://localhost:8081/api/count/decrease', postData)
            .then(response => {
                setCount(response.data);
            });
    }

    return (
        <div className="App">
            <div className={"counterContainer"}>
                <div>
                    <p className={"count-label"}>COUNT</p>
                </div>
                <div>
                    <p className={"counter"}>{count}</p>
                </div>
                <div>
                    <button className={"count-button"} onClick={increaseCount}>
                        plus
                    </button>
                    <button className={"count-button"} onClick={decreaseCount}>
                        minus
                    </button>
                </div>

            </div>

        </div>
    );
}

export default App;
