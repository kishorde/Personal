class player
{
    jerseyNo
    playerName
    countryName

    constructor(jn,pn,cn)
    {
        this.jerseyNo=jn
        this.playerName=pn
        this.countryName=cn
    }

    show()
    {
        console.log(this.jerseyNo,this.playerName,this.countryName);
    }
}

var obj=new player("7","Dhoni","INDIA");

obj.show()
