class Solution:
    def calPoints(self, operations: List[str]) -> int:
        
        stack = []
        for temp in operations:
            if temp == "+":
                stack.append(stack[-1]+stack[-2])
            elif temp == "D":
                stack.append(stack[-1]*2)
            elif temp == "C":
                stack.pop()
            else:
                stack.append(int(temp))
            print(stack)

        return sum(stack)