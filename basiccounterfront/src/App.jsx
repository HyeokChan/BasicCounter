import './App.css';
import React, { useState, useEffect, useReducer, useRef } from 'react';

function App() {
    const [count, setCount] = useState(0);
    const increaseCount = (e) => {
        e.preventDefault();
        setCount(count + 1);
    }

    const decreaseCount = (e) => {
        e.preventDefault();
        setCount(count - 1);
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
