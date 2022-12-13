function player(jn,pn,cn)
{
    this.jn=jn;
    this.playerName=pn;
    this.countryName=cn;
}

player.prototype.show =function()
{
console.log(this.jn,"   ",this.playerName,"  ",this.countryName,"  ",this.coachName);
}
player.prototype.coachName="Ravi Shastri"
var fun= new player(18,"Virat","INDIA")
fun.show();