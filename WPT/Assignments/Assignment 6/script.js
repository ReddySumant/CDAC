const expenses = [];
const temp_exp = [];

//getdata function
function getdata(){
    return new Promise((res,rej)=>{
        res(JSON.stringify(expenses));
    })
}

//constructor to create object
function expense(date, amount, description){
    this.date = date;
    this.amount = amount;
    this.description = description;
}

//function closure
function saveTotalExpense(){
    let totalExpense = 0;
    return function (amount){
        totalExpense = amount;
        return totalExpense;
    }
}

const addExpenseAmount = saveTotalExpense();

//callback for message
function message(){
    document.getElementById("status").innerText = "Data Added Succesfully";
}

//function to add expenses
function addExpense(callback){
    let date = document.getElementById("date").value;
    let desc = document.getElementById("desc").value;
    let amount = document.getElementById("amount").value;

    let exp = new expense(date, amount, desc);
    temp_exp.push(exp);

    document.getElementById("date").value = "";
    document.getElementById("desc").value = "";
    document.getElementById("amount").value = "";

    callback();
}

//to add data from temp to expenses and display
function populate(...objects){
    for(const obj of objects){
        expenses.push(obj);
    }
    temp_exp.splice(0, temp_exp.length);
}

// display the data into table
function display(data){
    let min = document.getElementById("minamount").value;
    let table = document.getElementById("expense-table");

    let expmin = data
    .filter((ele)=>{
        if(ele.amount >= min){
            return ele;
        }
    });

    for(const obj of expmin){
        let {date, amount, description} = obj;
        table.innerHTML += 
        `<tr>
            <td>${date}</td>
            <td>${amount}</td>
            <td>${description}</td>
        </tr>`

    }

}

async function displayData(){
    let data = await getdata();
    data = await JSON.parse(data);
    await display(data);
}

const calculateTotal = ()=>{
    let demo = [...expenses];
    return demo.reduce((obj1, obj2)=> parseInt(obj1.amount) + parseInt(obj2.amount));
};


//event listner for add
document.getElementById("adddata").onclick = ()=>{
    addExpense(message);
    console.log(temp_exp);
}

//event listner for get data
document.getElementById("submit").onclick = ()=>{
    document.getElementById("expense-table").innerHTML = ``;
    populate(...temp_exp);
    displayData();
    let totalexp = addExpenseAmount(calculateTotal());
    document.getElementById("total-expense").innerText = `Total Expenses Are ${totalexp} Rs.`;
}
