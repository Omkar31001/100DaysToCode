class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> first_row  = new ArrayList<>();
        if(numRows==0){
            return triangle;
        }
        first_row.add(1);
        triangle.add(first_row);
        for(int i=1;i<numRows;i++){
            List<Integer> prev_row = triangle.get(i-1);
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            for(int j=1;j<i;j++){
            int sum = prev_row.get(j-1) + prev_row.get(j);
                row.add(sum);
            }
            row.add(1);
            triangle.add(row);
            
        }
        return triangle;
    }
}