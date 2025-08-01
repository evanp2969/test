from CommandApp import CommandApp

class NumberSort(CommandApp):

    oddNumbers = []
    evenNumbers = []
    numbers = []

    def run(self,n):
        self.numbers = n

        for element in self.numbers:
            if element %2 != 0:
                #odd
                self.oddNumbers.append(element)
            else:
                #even
                self.evenNumbers.append(element)

        print("Odd Numbers: ")
        print(self.oddNumbers)
        print("Even Numbers: ")
        print(self.evenNumbers)
        self.compareNumbers(self.oddNumbers,self.evenNumbers)


    def compareNumbers(self,numberList1, numberList2):
        print("-- Comparing Numbers --")

        largerList = [];
        smallerList = [];

        if len(numberList1)>len(numberList2) :
            largerList = numberList1
            smallerList = numberList2
        else:
            largerList = numberList2
            smallerList = numberList1
        
        for i in range(len(largerList)):
            if i <= len(smallerList)-1:
                num1 = largerList[i]
                num2 = smallerList[i]
                larger = num1>num2

                if larger :
                    print(num1," > ",num2)
                else :
                    print(num1," < ",num2)

            else:
                num1 = largerList[i]
                print(num1)
                
