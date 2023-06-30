class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        n=list()
        for i in range(1,len(nums)+1):
            n.append(sum(nums[:i]))
          #  print(sum(nums[:i]))
        #print(str(n).replace(" ","")) 
        return n    



