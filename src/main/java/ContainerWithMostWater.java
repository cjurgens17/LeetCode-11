public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] height = new int[] {1,8,6,2,5,4,8,3,7};
        int[] height2 = new int[] {1,1};
        int[] height3 = new int[] {1,3,2,5,25,24,5};

        System.out.println(maxArea(height)); //49
        System.out.println(maxArea(height2)); //1
        System.out.println(maxArea(height3)); //24

    }

    //LeetCode problem 11. Container with most water

    //You are given an integer array height of length n. There are n vertical lines drawn such that the two
    // endpoints of the ith line are (i, 0) and (i, height[i]).
    //
    //Find two lines that together with the x-axis form a container, such that the container contains the most water.
    //
    //Return the maximum amount of water a container can store.
    //
    //Notice that you may not slant the container.

    public static int maxArea(int[] height){

        int left = 0;
        int right = height.length-1;
        int verticalLine;
        int span;
        int maxWater = 0;

        while(left<right){
            //length of our container
            span = right -left;
            //minimum height of our container, so that we avoid any diagonals
            verticalLine = Math.min(height[left], height[right]);
            //since we grabbed the span and min height of vertical line, this gives us the area of how much water we can store
            maxWater = Math.max(maxWater, span * verticalLine);
            //This adjusts our window, so we can check and update our container until or while-loop condition becomes false
            if(height[left] <= height[right]){
                left++;
            }else if(height[right] <= height[left]){
                right--;
            }
        }
        return maxWater;
    }


    //Complexity Analysis
    //Time Complexity: O(n), where n is the length of our array(height)
    //Space Complexity: O(1), where we only initialize 5 variables.
}
