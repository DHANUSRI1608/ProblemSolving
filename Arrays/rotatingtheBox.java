import java.util.*;
class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int rows = boxGrid[0].length;
        int cols = boxGrid.length;
        char[][] rotate = new char[rows][cols];
        for(int i=0;i<boxGrid.length;i++)
        {
            for(int j=0;j<boxGrid[0].length;j++)
            {
                rotate[j][cols-1-i] = boxGrid[i][j];
            }
        }
        for(int j = 0; j <rotate[0].length; j++)
        {
            for(int i = rotate.length-2; i >= 0; i--)
            {
                if(rotate[i][j]=='#')
                {
                    int k=i;
                    while(k+1 < rotate.length && rotate[k+1][j]=='.')
                    {
                        rotate[k+1][j] = '#';
                        rotate[k][j] = '.';
                        k++;
                    }
                }
            }
        }

        return rotate;
    }
}