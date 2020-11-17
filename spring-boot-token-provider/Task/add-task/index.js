var tasks = [
  {
    "id": "0",
    "description": "Hacer la DB",
    "responsible": {
      "name": "Catalina",
      "email": "Catalina@gmail"
    },
    "status": "Ready",
    "dueDate": 1600931924221
  },
  {
    "id": "1",
    "description": "Implementar FrontEnd",
    "responsible": {
      "name": "Catalina",
      "email": "catalina@gmail"
    },
    "status": "Done",
    "dueDate": 1609031924221
  },
  {
    "id": "2",
    "description": "Implementar BackEnd",
    "responsible": {
      "name": "Juan",
      "email": "Juan@gmail"
    },
    "status": "In Progress",
    "dueDate": 1600031924221
  }
];

function post(task){
  tasks.push({
    "id": tasks.length,
    "description": task.description,
    "responsible": {
      "name": task.responsible.name,
      "email": task.responsible.email     
    },
    "status": task.status,
    "dueDate": task.dueDate
  });
  return(tasks);
}

module.exports = async function (context, req) {
  context.log('Adding a task to the planner');

  const task = req.body;

  // Implement the response
  const responseMessage = post(task);

  context.res = {
      status: 201,
      body: responseMessage
  };
}

