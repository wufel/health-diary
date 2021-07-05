import React, { useState } from "react";
import { saveFart } from "./services/fartService.js";
import TextField from "@material-ui/core/TextField";

const emptyFart = {
    id: "",
    timestamp: "",
    smelliness: "",
    loudness: ""
}

export default function Form() {
    const [fart, setFart] = useState(emptyFart);

    function handleChange(e) {
        e.persist(); //persist the event
        setFart((curFart) => {
            return {
                ...curFart,
                [e.target.id]: e.target.value,
            };
        })
    }

    async function handleSubmit(e) {
        e.preventDefault();
        await saveFart(fart);
        setFart(emptyFart);
    }

    return (
        <>
            <h1>Add new Fart</h1>
            <form onSubmit={handleSubmit}>
                <div>
                    <TextField
                        id="timestamp"
                        label="Time"
                        type="datetime-local"
                        value={fart.timestamp}
                        InputLabelProps={{
                            shrink: true,
                        }}
                        onChange={handleChange} />
                </div>
                <div>
                    <label htmlFor="smelliness">Smelliness</label>
                    <br />
                    <select id="smelliness" value={fart.smelliness} onChange={handleChange}>
                        <option>Please Choose</option>
                        <option value="SMELLY">Smelly</option>
                        <option value="NOT_SMELLY">Not Smelly</option>
                    </select>
                </div>
                <div>
                    <label htmlFor="loudness">Loudness</label>
                    <br />
                    <select id="loudness" value={fart.loudness} onChange={handleChange}>
                        <option>Please Choose</option>
                        <option value="LOUD">Loud</option>
                        <option value="NO_SOUND">No sound</option>
                    </select>
                </div>
                <br />
                <div>
                    <input
                        type="submit"
                        className="btn btn-primary"
                        value="Add new fart record"
                    />
                </div>
            </form>
        </>
    );
}