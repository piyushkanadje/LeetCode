class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        carry = 0
        for i in range(len(digits)):
            if i == 0 :
                temp = (digits[len(digits)-i-1] + 1 + carry)%10
                carry = (digits[len(digits)-i-1] + 1 + carry)/10
                digits[len(digits)-i-1] = temp
            else:
                temp = (digits[len(digits)-i-1] + carry)%10
                carry = (digits[len(digits)-i-1] + carry)/10
                digits[len(digits)-i-1] = temp
            
        if carry != 0 :
            digits = [1] + digits
            
        return digits