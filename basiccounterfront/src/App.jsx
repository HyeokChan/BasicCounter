import './App.css';
import React, { useState } from 'react';
import axios from 'axios';

function App() {
    const [count, setCount] = useState(0);
    const increaseCount = async (e) => {
        const postData = {
            count: count
        }
        axios.post(`${process.env.REACT_APP_SPRING_BASE_URL}/api/count/increase`, postData)
            .then(response => {
                setCount(response.data);
            });
    }

    const decreaseCount = (e) => {
        const postData = {
            count : count
        }
        axios.post(`${process.env.REACT_APP_SPRING_BASE_URL}/api/count/decrease`, postData)
            .then(response => {
                setCount(response.data);
            });
    }

    return (
        <div className="App">
            <div className={"counter-container"}>
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
