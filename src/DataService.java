/*
* File: DataService.java
* Author: Zsiga Gergely
* Copyright: 2024, Zsiga Gergely
* Group: Szoft/II/1/E
* Date: 2024-01-15
* Github: https://github.com/zsi-ga/AsztaliMobil_dolg_2.git
* Licenc: GNU GPL
*/

import hu.szit.Client;

public class DataService {
    String url;
    Client client;

    public DataService() {
        url = "https://jsonplaceholder.typicode.com/todos";
        client = new Client();
    }

    public String getToDos() {
        return client.get(url);
    }

    public String addToDo(String json) {
        return client.get(url);
    }
}
