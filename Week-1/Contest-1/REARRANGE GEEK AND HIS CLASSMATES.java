/*  REARRANGE GEEK AND HIS CLASSMATES  */
/*  Example:

Sample Input:
2
6
0 5 1 2 4 3
5
4 3 2 1 0

Sample Output:
0 3 5 1 4 2 
0 1 2 3 4         */
___________________________________________________________________________________________________________________________________________________________________________

//User function Template for Java
class Solution 
{
    void rearrange(int arr[], int n) 
    {
        for (int i = 0; i < n; i++)
            arr[i] += (arr[arr[i]] % n) * n;
 
        for (int i = 0; i < n; i++)
            arr[i] /= n;
    }
 
    void printArr(int arr[], int n) 
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
}
___________________________________________________________________________________________________________________________________________________________________________
