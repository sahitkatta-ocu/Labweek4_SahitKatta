// Author: Sahit Katta
public class Labweek4_SahitKatta {

    // returns the minimmum common denominator
    public static int mcd(int a, int b) {
	if(a==b)
	    return a;
	else if (a>b) 
	    return mcd(a-b,b);
	else
	    return mcd(b-a,a);
    }

    public static int largest(int arr[]){
	assert(arr.length>0);
	int curLargest=arr[0];
	for(int i=1; i<arr.length; ++i) {
	    if(arr[i]>curLargest) 
		curLargest=arr[i];
	}
	return curLargest;
    }

    public static void main(String args[]) {
		int arr[]={10,15,19,18,60,24,11,19};
		// Display the content of the array arr
		System.out.println(" Hello SE, I am Sahit Katta");
		System.out.println(" The content of arr is :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("\n******************************");
		System.out.println(" The largest value in arr is "+largest(arr));
    }
}
