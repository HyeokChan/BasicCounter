import './App.css';
import React, { useState } from 'react';
import axios from 'axios';

function App() {
    const [countValue, setCountValue] = useState(0);
    const increaseCount = async (e) => {
        const postData = {
            countValue: countValue
        }
        axios.post(`${process.env.REACT_APP_SPRING_BASE_URL}/api/count/increase`, postData)
            .then(response => {
                setCountValue(response.data);
            });
    }

    const decreaseCount = (e) => {
        const postData = {
            countValue : countValue
        }
        axios.post(`${process.env.REACT_APP_SPRING_BASE_URL}/api/count/decrease`, postData)
            .then(response => {
                setCountValue(response.data);
            });
    }

    const loadCount = (e) => {
        const postData = {
            countValue : countValue
        }
        axios.post(`${process.env.REACT_APP_SPRING_BASE_URL}/api/count/load`, postData)
            .then(response => {

            });
    }

    const saveCount = (e) => {
        const postData = {
            countValue : countValue
        }
        axios.post(`${process.env.REACT_APP_SPRING_BASE_URL}/api/count/save`, postData)
            .then(response => {

            });
    }

    return (
        <div className="App">
            <div className={"counter-container"}>
                <div>
                    <p className={"count-label"}>COUNT v1.1</p>
                </div>
                <div>
                    <p className={"counter"}>{countValue}</p>
                </div>
                <div>
                    <button className={"count-button"} onClick={increaseCount}>
                        PLUS
                    </button>
                    <button className={"count-button"} onClick={decreaseCount}>
                        MINUS
                    </button>
                </div>
                <div>
                    <button className={"count-button"} onClick={loadCount}>
                        LOAD
                    </button>
                    <button className={"count-button"} onClick={saveCount}>
                        SAVE
                    </button>
                </div>
            </div>

        </div>
    );
}

export default App;
