class test{
    public static void main(String[] args){
        boolean bool = (Integer.parseInt("7"))==7;
        if (bool){
            System.out.println("Ran");
        }
        
        int[] nums ={1,2,3,4};
        int n = nums.length;
        int[] newnums = new int[n+1];
        newnums[n] = 7;

        for (int i=0;i<nums.length;i+=1){
            System.out.print(nums[i]+" ");
        }
        System.out.print("\n");

        for (int i=0;i<newnums.length;i+=1){
            System.out.print(newnums[i]+" ");
        }
    }
}

