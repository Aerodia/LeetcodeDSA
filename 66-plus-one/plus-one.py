class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        res = 0
        for i in range(len(digits)):
            res = res * 10 +digits[i]
        num = res +1
        arr =list(map(int, str(num)))
        return arr 
        

