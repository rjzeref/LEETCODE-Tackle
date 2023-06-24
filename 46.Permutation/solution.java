class Solution 
{
   List<List<Integer>> o = new ArrayList<List<Integer>>();
    List<Integer> o1 = new ArrayList<Integer>();

    int[] swap(int[] r, int x, int y) 
    {
        int temp = r[x];
        r[x] = r[y];
        r[y] = temp;
        return r;
    }

    List<Integer> add(int[] r) {
        List<Integer> o1 = new ArrayList<Integer>();
        for (int i = 0; i < r.length; i++)
            o1.add(r[i]);
        return o1;
    }

    void permute(int[] n, int l, int r) 
     {
        if (l == r) 
        {
       //     System.out.println(n[0] + "" + n[1] + "" + n[2]);
            o1 = add(n);
            if (!o.contains(o1))
                o.add(o1);
            return;
        }
        for (int i = 0; i < n.length; i++) 
        {

            swap(n, l, i);
            permute(n, l + 1, r);
            swap(n, l, i);

        }
    }

    public List<List<Integer>> permute(int[] nums) 
    {
        if (nums.length > 2)
            permute(nums, 0, nums.length - 1);
        else if (nums.length == 2) 
        {
            o1 = add(nums);
            o.add(o1);
            swap(nums, 0, 1);
            o1 = add(nums);
            o.add(o1);
        } else 
        {
            o1 = add(nums);
            o.add(o1);
        }

      //  System.out.println(o);
        return o;
    }
}