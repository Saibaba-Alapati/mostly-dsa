package solved;
import java.util.*;
class MergeTwoSorted
{
	public int[] solve(int[] a, int[] b) {
        int sizeOfa  =a.length;
        int sizeOfb  =b.length;
        int sizeOfc  = sizeOfa+sizeOfb;
        int[]c  = new int[sizeOfc];
        int i=0; int j =0; int k=0;
		while (i<sizeOfa && j <sizeOfb)
		{
			if (a[i] < b[j])
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}
		while (i < sizeOfa)
			c[k++] = a[i++];
		while (j < sizeOfb)
			c[k++] = b[j++];

        return c;
	}
}

