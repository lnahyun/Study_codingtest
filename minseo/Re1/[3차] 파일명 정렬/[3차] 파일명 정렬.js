function solution(files) {
  const regex = /^([^0-9]+)([0-9]{1,10})(.*)$/
  
  return files.sort((a,b) => {
     let aMatch = a.match(regex)
     let bMatch = b.match(regex)
     
     let aHead = aMatch[1]
     let aNumber = aMatch[2]
     
     let bHead = bMatch[1]
     let bNumber = bMatch[2]
     
     let aHeadLower = aHead.toLowerCase()
     let bHeadLower = bHead.toLowerCase()
     if(aHeadLower < bHeadLower) return -1
     if(aHeadLower > bHeadLower) return 1
      
      let aNum = parseInt(aNumber, 10)
      let bNum = parseInt(bNumber, 10)
      if(aNum < bNum) return -1;
      if(aNum > bNum) return 1;
      
       return 0;
  })
}
