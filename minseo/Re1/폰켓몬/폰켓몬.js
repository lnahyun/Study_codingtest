function solution(nums) {
    let select = new Set(nums)
    
    let maxSelect = Math.floor(nums.length/2)
    
    return Math.min(select.size, maxSelect)
}
