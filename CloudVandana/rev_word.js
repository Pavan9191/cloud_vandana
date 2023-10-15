function rev_Word(str){
    var ans="";
    var result="";
    var j=0;
    for (var i = 0; i < str.length+1; i++) {
        if ((str.charAt(i)==" ") || (i==str.length)){
            ans+=result.split("").reverse().join("")+" ";
            result="";
        } else{
            result+=str.charAt(i);
        }
    }
    return ans.trim();
}
s=prompt("enter the string: ");
console.log(rev_Word(s));
