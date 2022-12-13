interface Person
{
    name:string;
    age:number;
    dob:string;
}

function showPerson(person:Person)
{
    console.log(`${person.name}    ${person.age}     ${person.dob}`)
}

showPerson({name:"chicku",age:20,dob:"11/11/2002"});