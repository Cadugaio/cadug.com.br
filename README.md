# Backend / Rest / Http

This project demonstrates how to create a task management API using Ktor. The API is designed to handle basic CRUD operations on tasks, including listing and saving them.
* Create a Project with Ktor
Start by setting up a new Ktor project using the Ktor project generator or manually through IntelliJ.
Configure the necessary dependencies for Ktor, routing, and testing.

* Open and Run the Project with IntelliJ.
  Once the project is created, open it in IntelliJ IDEA. Ensure the necessary build tools (Gradle or Maven) are configured properly, then run the application to verify that it starts without errors.

* Map Routes
Map the necessary routes using Ktor's routing features. For this project, create routes to:

  List tasks (GET /tasks)
  
  Save a new task (POST /tasks)
  
* Implement In-Memory Repository
Build a simple in-memory repository to store tasks. This will allow tasks to be saved and listed temporarily while the server is running. The repository should contain methods to:

   List all tasks
 
   Save new tasks

* Test the Application with Postman
Use Postman to test the API endpoints. Send GET and POST requests to verify that tasks are being listed and saved correctly. Make sure the in-memory repository is working as expected for the duration of the application runtime.

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)
