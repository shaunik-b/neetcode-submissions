class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        m_list = []
        for i in range(len(strs)):
            l_list =[]
            handled = False
            for j in range(len(m_list)):
                if self.isAnagram(strs[i],m_list[j][0]):
                    m_list[j].append(strs[i])
                    handled = True
            if not handled:
                m_list.append([strs[i]])
        return m_list
                
    def isAnagram(self,str1,str2):
        if len(str1)!=len(str2):
            return False
        dict1 = {}
        dict2 = {}
        for i in range(len(str1)):
            dict1[str1[i]] = dict1.get(str1[i],0)+1
            dict2[str2[i]] = dict2.get(str2[i],0)+1
        return dict1 == dict2






