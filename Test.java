import javax.print.attribute.standard.MediaSize.Other;

class test{

    public static int myfunc(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        OtherClass oc = new OtherClass();
        int[] my_arr = {1,2,3,4};
        System.out.println(myfunc(my_arr));
        System.out.println(oc.test());
    }
}

class OtherClass {
    public int test() {
        return 1;
    }
}
