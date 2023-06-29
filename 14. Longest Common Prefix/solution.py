class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        s:str=max(strs)
        com=""    
        count=0
        for i in range(1,len(s)+1):
            for j in range(0,len(strs)):
                subs=s[:i]
                if strs[j].find(subs)==0 and len(subs)>len(com):
                    count=count+1
                    if count==len(strs):
                       com=subs
            count=0
        return com