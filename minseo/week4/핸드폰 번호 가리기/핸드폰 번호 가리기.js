function solution(phone_number) {
    let shadowNumber = ""; 
   for(let i = 0; i<phone_number.length-4; i++){
       shadowNumber += "*";
   }
    
    for(let i = phone_number.length-4; i < phone_number.length; i++){
        shadowNumber += phone_number[i];
    }
    
    return shadowNumber;
}
