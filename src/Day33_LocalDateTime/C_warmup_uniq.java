package Day33_LocalDateTime;

public class C_warmup_uniq {
    public static void main(String[] args) {

        int[] arr = {2,2,1,3,3, 4, 5, 6};

        for(int element : arr ){
            int count = 0 ;
            for(int b : arr){
                if(element == b){
                    count++;
                }
            }

            if(count == 1){
                System.out.print(element+" ");
            }
        }

        System.out.println();

/*
        int element =  arr[0]; //2
        int count = 0 ;
        for(int b : arr){
            if(element == b){
                count++;
            }
        }
        if(count == 1){
            System.out.println(element);
        }
*/

          double[] n2 = {10, 20, 20, 40, 50};





    }

    public static void uniqueElements(int[] arr){
        for(int element : arr ){
            int count = 0 ;
            for(int b : arr){
                if(element == b){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }


    public static void uniqueElements(char[] arr){

        for(char element : arr ){
            int count = 0 ;
            for(char b : arr){
                if(element == b){
                    count++;
                }
            }

            if(count == 1){
                System.out.print(element+" ");
            }
        }

        System.out.println();

    }


    public static void uniqueElements(double[] arr){

        for(double element : arr ){
            int count = 0 ;
            for(double b : arr){
                if(element == b){
                    count++;
                }
            }

            if(count == 1){
                System.out.print(element+" ");
            }
        }

        System.out.println();

    }


    public static void uniqueElements(String[] arr){

        for(String element : arr ){
            int count = 0 ;
            for(String b : arr){
                if( element.equals(b) ){
                    count++;
                }
            }

            if(count == 1){
                System.out.print(element+" ");
            }
        }

        System.out.println();

    }




}
