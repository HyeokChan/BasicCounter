import './App.css';
import React, { useState, useEffect, useReducer, useRef } from 'react';
import axios from 'axios';

function App() {
    const [count, setCount] = useState(0);
    const increaseCount = async (e) => {
        //setCount(count + 1);
        const postData = {
            count: count
        }
        console.log("postData :::::", postData);
        axios.post('http://localhost:8081/api/count/increase', postData)
            .then(response => {
                console.log("response.data :::::", response.data);
                setCount(response.data);
            });
    }

    const decreaseCount = (e) => {
        //setCount(count - 1);
        const postData = {
            count : count
        }
        console.log("postData :::::", postData);
        axios.post('http://localhost:8081/api/count/decrease', postData)
            .then(response => {
                setCount(response.data);
            });
    }

    return (
        <div className="App">
            <div className={"counterContainer"}>
                <div>
                    <p className={"numberDisplay"}>{count}</p>
                </div>
                <div>
                    <button className={"countButton"} onClick={increaseCount}>
                        plus
                    </button>
                    <button className={"countButton"} onClick={decreaseCount}>
                        minus
                    </button>
                </div>

            </div>

        </div>
    );
}

export default App;
