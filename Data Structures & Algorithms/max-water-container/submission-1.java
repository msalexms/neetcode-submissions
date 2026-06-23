class Solution {
    public int maxArea(int[] heights) {

        int l = 0;
        int r = heights.length - 1;
        int maxArea = 0;

        while (l < r) {

            int height = Math.min(heights[l], heights[r]);
            int width = r - l;

            int area = height * width;

            maxArea = Math.max(maxArea, area);

            // mover el puntero del menor
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }
}