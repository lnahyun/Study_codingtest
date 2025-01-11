//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Permutation {
   private void swap(char[] list, int i, int k) {
      char temp=list[k];
      list[k]=list[i];
      list[i]=temp;
   } //배열 list 와 인덱스 i와 k에 있는 요소 교환
   public void perm(char[] list, int k){
      if(k == list.length-1){ // 순열 하나만 존재
         for(int i=0; i<list.length; i++){
            System.out.print(list[i] + " ");
         }
         System.out.println();
      }
      else{
         for(int i=k; i<list.length; i++){
            swap(list, i, k); // 현재위치 k 부터 배열 끝까지 요소 순환 후 교환
            perm(list, k+1); // 교환 후 다음위치 기준 다시 순열 생성
            swap(list, i, k); // 순열 생성 끝난 후 교환을 통해 list 배열을 원 상태로 복구
         }
      }
   }
   // 제대로 실행되는지 확인하는 코드
   /* public static void main(String[] args) {
      Permutation p = new Permutation();
      char[] intput = {'1', '2', '3'};
      p.perm(intput, 0);
   }*/
}
