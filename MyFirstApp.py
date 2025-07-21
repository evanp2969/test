MY_VALUE = 400

x = 4

while x>1:
    print("looping...")
    x -= 1

print("outside loop")

if x == 1 :
    print(MY_VALUE)

oddNumbers = []
evenNumbers = []
numbers = [25, 2, 6, 35, 67, 100, 4, 121, 209, 9]

for element in numbers:
    if element %2 != 0:
        #odd
        oddNumbers.append(element)
    else:
        #even
        evenNumbers.append(element)

print("Odd Numbers: ")
print(oddNumbers)
print("Even Numbers: ")
print(evenNumbers)

def compareNumbers(numberList1, numberList2):
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
            

compareNumbers(evenNumbers,oddNumbers)