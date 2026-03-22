# How to use this repository?

- `cd` into `kafka-cluster/` and run `docker-compose up`, a kafka-cluster of 3 instances will be launched, with `localhost:9092` as the entrypoint.
- Both `consumer/` and `producer/` are spring applications
-  Launch the spring application in `consumer/`
-  Launch the spring application in `producer/`, this will launch a backend server at port: `8081`
-  Go to `localhost:8081`, a swagger document has been launched to create message:

    <img width="824" height="654" alt="image" src="https://github.com/user-attachments/assets/6f73d763-511e-41de-ae4e-f1ed4e4717ee" />

- Send the post request and receive the message from `consumer/` application
