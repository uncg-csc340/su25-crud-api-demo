# su25-crud-api-demo

## Description
Simple CRUD API for Student Objects
### Version
0.1.4

## Installation
- Get the project
    - clone
        ```
      git clone https://github.com/uncg-csc340/su25-crud-api-demo.git
        ```
    - OR download zip.
- Open the project in VS Code.
- This project is built to run with jdk 21.

## API Endpoints
Base URL: [`http://localhost:8080/students`](http://localhost:8080/students)


1. ### [`/`](http://localhost:8080/students) (GET)
Gets a list of all Students in the database.

#### Response - A JSON array of Student objects.

 ```
[
  {
    "id": 1,
    "name": "John Doe",
    "email": "jd@uncg.edu",
    "major": "Computer Science",
    "gpa": 3.5
  },
  {
    "id": 2,
    "name": "Jane Smith",
    "email": "js@uncg.edu",
    "major": "Mathematics",
    "gpa": 3.8
  }
]
```

2. ### [`/{studentId}`](http://localhost:8080/students/1) (GET)
Gets an individual Student in the system. Each Student is identified by a numeric `studentId`

#### Parameters
- Path Variable: `studentId` &lt;Long &gt; - REQUIRED

#### Response - A single Student

```
  {
    "id": 1,
    "name": "John Doe",
    "email": "jd@uncg.edu",
    "major": "Computer Science",
    "gpa": 3.5
  }
```

3. ### [`/name`](http://localhost:8080/students/name?key=jo) (GET)
Gets a list of students with a name that contains the given string.

#### Parameters
- query parameter: `search` &lt; String &gt; - REQUIRED

#### Response - A JSON array of Student objects.

```
[
  {
    "id": 1,
    "name": "John Doe",
    "email": "jd@uncg.edu",
    "major": "Computer Science",
    "gpa": 3.5
  }
]
```

4. ### [`/major/{major}`](http://localhost:8080/students/major/mathematics) (GET)
Gets a list of students for a named major.

#### Parameters
- path variable: `major` &lt; String &gt; - REQUIRED

#### Response - A JSON array of Student objects.

```
[
  {
    "id": 2,
    "name": "Jane Smith",
    "email": "js@uncg.edu",
    "major": "Mathematics",
    "gpa": 3.8
  }
]
```

5. ### [`/`](http://localhost:8080/students) (POST)
Create  a new Student entry

#### Request Body
A student object.
```
{
  "id":3,
  "name":"Bob Testing",
  "email":"bt@test.edu",
  "major":"Computer Science",
  "gpa":3.44
}
```
#### Response - The updated list of Students.

```
[
  {
    "id": 1,
    "name": "John Doe",
    "email": "jd@uncg.edu",
    "major": "Computer Science",
    "gpa": 3.5
  },
  {
    "id": 2,
    "name": "Jane Smith",
    "email": "js@uncg.edu",
    "major": "Mathematics",
    "gpa": 3.8
  },
  {
    "id": 3,
    "name": "Bob Testing",
    "email": "bt@test.edu",
    "major": "Computer Science",
    "gpa": 3.44
  }
]
```

6. ### [`/{studentId}`](http://localhost:8080/students/3) (PUT)
Update an existing Student.

#### Parameters
- Path Variable: `studentId` &lt;integer&gt; - REQUIRED

#### Request Body
A student object with the updates.
```
{
  "id":3,
  "name":"Mister Updated",
  "email":"bt@test.edu",
  "major":"Computer Science",
  "gpa":3.44
}
```
#### Response - the updated Student object.
```
{
  "id":3,
  "name":"Mister Updated",
  "email":"bt@test.edu",
  "major":"Computer Science",
  "gpa":3.44
}
```

7. ### [`/{studentId}`](http://localhost:8080/students/3) (DELETE)
Delete an existing Student.

#### Parameters
- Path Variable: `studentId` &lt;integer&gt; - REQUIRED

#### Response - the updated list of Students.
```
[
  {
    "id": 1,
    "name": "John Doe",
    "email": "jd@uncg.edu",
    "major": "Computer Science",
    "gpa": 3.5
  },
  {
    "id": 2,
    "name": "Jane Smith",
    "email": "js@uncg.edu",
    "major": "Mathematics",
    "gpa": 3.8
  }
]
```