class test{
    public static void main(String[] args){
        String s = "hello world";
        String vowel_list="aeiou";
        char[] s_list=s.toCharArray();
        for (int i=0; i<s_list.length; i++){
            String char_as_s=Character.toString(s_list[i]);
            if (vowel_list.contains(char_as_s)){
                System.out.println(char_as_s);
            }
        }
    }
}

