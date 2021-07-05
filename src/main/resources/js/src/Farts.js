import React, { useEffect, useState } from "react";
import { getAllFarts, deleteFart } from "./services/fartService";
import { DataGrid } from '@material-ui/data-grid';
import Button from "@material-ui/core/Button";
import DeleteIcon from '@material-ui/icons/Delete';

export default function Farts() {
    const [farts, setFarts] = useState([])
    const [selectedRows, setSelectedRows] = useState([]);

    const columns = [
        { field: 'id', headerName: 'ID', width: 70 },
        { field: 'timestamp', headerName: 'Time', type: 'timestamp', width: '40%' },
        { field: 'smelliness', headerName: 'Smelliness', width: 130 },
        { field: 'loudness', headerName: 'Loudness', width: 130 },
    ]

    useEffect(() => {
        getAllFarts()
            .then((response) => setFarts(response))
            .catch(e => console.log(e));
    }, []);

    function handleRowSelection(e) {
        if (selectedRows.length !== 0 && selectedRows.find(id => id === e.data.id)) {
            setSelectedRows(selectedRows.filter((id) => id !== e.data.id))
            console.log("reselected " + selectedRows);
        } else {
            setSelectedRows([...selectedRows, e.data.id]);
            console.log("selecting" + selectedRows);
        }
    }

    function handleDelete() {
        selectedRows.forEach(deleteFart);
        setSelectedRows([]);
    }

    return (
        <>
            <div style={{ height: 400, width: '50%', marginLeft: '25%' }}>
                <DataGrid
                    class="fart"
                    rows={farts}
                    columns={columns}
                    pageSize={5}
                    checkboxSelection
                    onRowSelected={handleRowSelection}
                />
            </div>
            <br />
            <Button
                variant="contained"
                color="primary"
                startIcon={<DeleteIcon />}
                style={{ textTransform: "none" }}
                onClick={handleDelete}>
                Delete Rows
            </Button>
        </>
    );
}