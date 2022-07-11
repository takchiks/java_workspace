var candidate = {
    "id":092,
    "name":"Peter",
    get(){
        console.log(candidate.id*2);

    }
}
var name1:string = "hello"
candidate.get()

console.log(name1)

// var nu:number =12341
var iseven:Array<Number> =[12341,23909,99093,4909,51829]
for(var numb of iseven){
    var num:string = numb.toString();
    if(num.length>4){
        if(parseInt(num.charAt(4))% 2 ){
            console.log("Even 4th index: "+numb)

        }
    }
}
class Human{
    constructor(){
        
    }
    private static tk:number =56 ;
    static print():number{
        console.log(this.tk);
        return 78;
    }

}
var h1 = new Human();
Human.print()