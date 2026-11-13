class Solution:
    def maxArea(self, heights: List[int]) -> int:
        i = 0
        j = len(heights)-1
        maxArea = 0
        while(i<j):
            h1 = heights[i]
            h2 = heights[j]
            minHeight = min(h1,h2)
            width = j-i

            area = minHeight * width
            maxArea = max(area, maxArea)

            if(h1<h2):
                i+=1
            else:
                j-=1
        return maxArea

