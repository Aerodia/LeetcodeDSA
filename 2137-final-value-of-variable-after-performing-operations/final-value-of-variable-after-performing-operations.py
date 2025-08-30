class Solution(object):
    def finalValueAfterOperations(self, operations):
        """
        :type operations: List[str]
        :rtype: int
        """
        X = 0
        for i in range(len(operations)):
            if operations[i] == "X++" or operations[i] == "++X":
                X+=1
            else:
                X-=1
        return X