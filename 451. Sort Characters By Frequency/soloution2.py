class Solution:
    def frequencySort(self, s: str) -> str:
        
        d={}
        for i in s:
                    if i not in d:
                        d[i]=1
                    else :
                        d[i]=d[i]+1
        
                       
        s=''
        for i in sorted(d.items(),key=lambda x:x[1]):
                 s=s+i[0]*i[1]
        return s[::-1] 