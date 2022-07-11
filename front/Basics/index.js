var candidate = {
    "id": 092,
    "name": "Peter",
    get: function () {
        console.log(candidate.id * 2);
    }
};
var name1 = "hello";
candidate.get();
console.log(name1);
// var nu:number =12341
var iseven = [12341, 23909, 99093, 4909, 51829];
for (var _i = 0, iseven_1 = iseven; _i < iseven_1.length; _i++) {
    var numb = iseven_1[_i];
    var num = numb.toString();
    if (num.length > 4) {
        if (parseInt(num.charAt(4)) % 2) {
            console.log("Even 4th index: " + numb);
        }
    }
}
var Human = /** @class */ (function () {
    function Human() {
    }
    Human.print = function () {
        console.log(this.tk);
        return 78;
    };
    Human.tk = 56;
    return Human;
}());
var h1 = new Human();
Human.print();
