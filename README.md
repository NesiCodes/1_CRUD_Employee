# CRUD Employee Microservice
Run ```StereotypeAnnotationsApplication```, the service will be listen on the port ```8088```

```
GET http://localhost:8080/emp/get/all (Returns all the current employees registered)
GET http://localhost:8080/emp/get/byHiringSource?hiringSource=Reference (Returns all employees that have "Reference" as their hiring source)
GET http://localhost:8080/emp/get/byHiringDate?hiringDate=1.01.2019 (Returns all employees that have "1.01.2019" as their hiring date)

POST http://localhost:8080/emp/add (Adds a new employee)
    {
        "employeeId": 3,
        "name": "Macauley Peck",
        "hiringDate": "1.01.2019",
        "hiringSource": "Reference",
        "department": "Marketing",
        "country": "Germany"
    }

PUT http://localhost:8080/emp/edit (Edits current info about the employee with the given id)
    {
        "employeeId": 2,
        "name": "Macauley Peck",
        "hiringDate": "1.01.2019",
        "hiringSource": "LinkedIn",
        "department": "Finance",
        "country": "Albania"
    }

DELETE http://localhost:8080/emp/delete?id=3 (Deletes the employee with id 3)
```
