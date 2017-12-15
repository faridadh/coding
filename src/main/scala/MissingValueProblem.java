public class MissingValueProblem {

    public int solve(int[] a ){
        int missingIndex = a.length;

        for(int index=0; index<a.length; index++){
            while(a[index]!=-1 && a[index]!=index+1){
                int j = a[index]-1;
                if(j==a.length){
                    a[index] = -1;
                } else {
                    a[index] = a[j];
                    a[j]=j+1;
                }
            }

            if(a[index]==-1){
                missingIndex = index;
            }
        }

        return missingIndex+1;
    }
}
