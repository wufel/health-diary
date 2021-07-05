const baseUrl = 'http://localhost:8080/fart'

export async function getAllFarts() {
    return fetch(baseUrl + '/all').then((response) => {
        if (response.ok) return response.json();
        throw response;
    });
}

export async function deleteFart(id) {
    return fetch(baseUrl + '/delete/' + id, {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(id),
    });
}

export async function saveFart(fart) {
    return fetch(baseUrl, {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(fart),
    });
}