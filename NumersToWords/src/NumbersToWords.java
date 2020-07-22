public class NumbersToWords {

    public String ones(long num){
        String ones = "";
        if(num == 1)
            ones = "One";
        else if(num == 2)
            ones = "Two";
        else if(num == 3)
            ones = "Three";
        else if(num == 4)
            ones = "Four";
        else if(num == 5)
            ones = "Five";
        else if(num == 6)
            ones =  "Six";
        else if(num == 7)
            ones = "Seven";
        else if(num == 8)
            ones = "Eight";
        else if(num == 9)
            ones = "Nine";
        return ones;
    }
    public String tens(long num){
        String tens = "";
        if(num == 1)
            tens = "Ten";
        else if(num == 2)
            tens = "Twenty";
        else if(num == 3)
            tens = "Thirty";
        else if(num == 4)
            tens = "Fourty";
        else if(num == 5)
            tens = "Fivety";
        else if(num == 6)
            tens =  "Sixty";
        else if(num == 7)
            tens = "Seventy";
        else if(num == 8)
            tens = "Eighty";
        else if(num == 9)
            tens = "Ninety";
        return tens;
    }
    public String elevenToNineteen(long num){
        String elevenToNineteen = "";
        if(num == 11)
            elevenToNineteen = "Eleven";
        else if(num == 12)
            elevenToNineteen = "Twelve";
        else if(num == 13)
            elevenToNineteen = "Thirteen";
        else if(num == 14)
            elevenToNineteen = "Fourteen";
        else if(num == 15)
            elevenToNineteen = "Fivteen";
        else if(num == 16)
            elevenToNineteen =  "Sixteen";
        else if(num == 17)
            elevenToNineteen = "Seventeen";
        else if(num == 18)
            elevenToNineteen = "Eighteen";
        else if(num == 19)
            elevenToNineteen = "Nineteen";
        return elevenToNineteen;
    }
    public String twoDigit(long num){
        String twoDigit ="";
        if(num > 20)
            twoDigit = tens(num / 10) +" "+ones(num % 10)+" ";
        else if(num % 10 == 0)
            twoDigit = tens(num / 10)+" ";
        else if(num <= 9)
            twoDigit = ones(num)+" ";
        else if(num >= 11 && num <= 19)
            twoDigit = elevenToNineteen(num)+" ";
        return twoDigit;
    }
    public String covert(long num){
        String words = "";
        if(String.valueOf(num).length() >= 6){
            long lakhs = num / 100000;
            num = num % 100000;
            words += twoDigit(lakhs)+"Lakhs ";
        }
        if(String.valueOf(num).length() >= 4){
            long thousand = num / 1000;
            num = num % 1000;
            words += twoDigit(thousand)+"Thousand ";
        }
        if(String.valueOf(num).length() >= 3){
            long hundread = num / 100;
            num = num % 100;
            words += ones(hundread)+" Hundread ";
        }
        if(num != 0)
            words += twoDigit(num)+" ";

        return words;
    }

}
