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

module.exports = async function (context) {
    context.log('Getting all tasks to the planner');
  
    const responseMessage = tasks;
  
    context.res = {
        status: 200,
        body: responseMessage
    };
  }