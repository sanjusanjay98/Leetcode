class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        strs.sort()
        st=strs[0]
        end=strs[len(strs)-1]
        s=""
        for i in range(0,min(len(st),len(end))):
            if st[i]==end[i]:
                s+=st[i]
            else:
                break
        return s
        