package SolvedProblem.MyAtoi;

public class Solution {
    public int myAtoi(String s) {
        long result = 0;
        boolean hasReadNum = false;
        boolean hasSymble = false;
        boolean symbol = true;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >='0'&& s.charAt(i)<='9' || s.charAt(i) == ' ' || s.charAt(i) == '+'||s.charAt(i) == '-')
            {
                if(s.charAt(i) == '+'){

                    if(hasSymble)
                    {
                        break;
                    }
                    symbol = true;
                    hasSymble = true;
                }
                else if(s.charAt(i) == '-' ){

                    if(hasSymble)
                    {
                        break;
                    }
                    symbol = false;
                    hasSymble = true;
                }
                else if(s.charAt(i) >='0'&& s.charAt(i)<='9'){
                    hasReadNum  = true;
                    hasSymble = true;
                    result = result*10 -48 +s.charAt(i);
                    if(result-1 >= Integer.MAX_VALUE )
                    {
                        break;
                    }
                }else if(hasSymble && s.charAt(i)  ==' ')
                {
                    break;
                }

                if(!(s.charAt(i) >='0'&& s.charAt(i)<='9') && hasReadNum   ){
                    break;
                }

            }
            else {
                break;
            }
        }

        if(symbol)
        {
            result =  Math.min(result,Integer.MAX_VALUE);
        }
        else
        {
            result =  Math.max(-result,Integer.MIN_VALUE);
        }

        return (int)result;
    }
}