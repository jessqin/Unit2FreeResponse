package com.company;

/**
 * Created by jq210 on 11/10/16.
 */
public class Code
{
    private String myCode;
    private String hiddenC1;
    private String hiddenC2;
    private String hiddenCode;
    private String recoveredC1;
    private String recoveredC2;
    private String recoveredCode;

    public Code(String code)
    {
        myCode = code;
    }

    public String getCode()
    {
        return myCode;
    }

    public void hide(int p1, int p2)
    {

        hiddenC1 = myCode.replace(myCode.charAt(p1), 'X');
        hiddenC2 = hiddenC1.replace(hiddenC1.charAt(p2), 'X');
        hiddenCode = hiddenC2;

    }

    public void recover(int p1, int p2)
    {

        recoveredC1 = hiddenC2.replace(hiddenC2.charAt(p2), myCode.charAt(p2));
        recoveredC2 = recoveredC1.replace(hiddenC1.charAt(p1), myCode.charAt(p2));
        recoveredCode = recoveredC2;

    }


}
