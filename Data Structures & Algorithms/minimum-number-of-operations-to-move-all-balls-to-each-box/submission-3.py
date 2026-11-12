class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        prefixSum = [0]*len(boxes)
        noOfOnesToLeft = 0

        for i in range(0,len(boxes),1):
            if(noOfOnesToLeft>0):
                prefixSum[i] = noOfOnesToLeft + prefixSum[i-1]
            else:
                prefixSum[i] = 0
            if(boxes[i]=='1'):
                noOfOnesToLeft+=1


        suffixSum = [0]*len(boxes)
        noOfOnesToRight = 0

        for i in range(len(boxes)-1,-1,-1):
            if(noOfOnesToRight>0):
                suffixSum[i] = noOfOnesToRight + suffixSum[i+1]
            else:
                suffixSum[i] = 0
            if(boxes[i]=='1'):
                noOfOnesToRight+=1

        result = [x + y for x, y in zip(suffixSum, prefixSum)]
        return result


        


            
        