/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos22;

/**
 *
 * @author Mitsuki
 */
public class EstructuraDeDatos22 {
    


// Java implementation of Min Heap 

    public static void main(String...arg)
    {
        
        System.out.println("The Min Heap is ");
   
         
        
        DynArray D = new DynArray();
        MinHeap minHeap =new MinHeap(D);
        minHeap.insert(77);
        minHeap.insert(130);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);
        minHeap.insert(1);
        minHeap.print();
       while(!minHeap.isEmpty()){
        D.addHeap(minHeap.remove());
       }
       
       D.Reducir(D.size2);
        System.out.print("Arreglo ordenado {");
       print(minHeap.Dyn.d2);
        System.out.print("}");
    }
    
    
   public static void print(int[] arr) {
     
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
              
         
            } else
                System.out.print(arr[i]);  
        }
}
   /*public static void printHeap(int[] arr){
            DynArray Dyn=new DynArray();
            for (int r = 1; r <= Dyn.size / 2; r++ ){
            System.out.print(" PARENT : " + arr[r] + " LEFT CHILD : " + arr[2*r] 
                + " RIGHT CHILD :" + arr[2 * r  + 1]);
            System.out.println();
    }
            */
   
   }

