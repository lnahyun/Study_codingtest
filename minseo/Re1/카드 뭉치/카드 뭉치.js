function solution(cards1, cards2, goal) {
  let goal1 = goal.filter(word => cards1.includes(word));
  let goal2 = goal.filter(word => cards2.includes(word));

 
  let fix1 = cards1.slice(0, goal1.length);
  let fix2 = cards2.slice(0, goal2.length);

  if (goal1.join(" ") !== fix1.join(" ") || goal2.join(" ") !== fix2.join(" ")) {
    return "No";
  }
  return "Yes";
}
