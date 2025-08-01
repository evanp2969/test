from CommandApp import CommandApp
from NumberSort import NumberSort

class Main():

    numbers = []

    def loadNumbers(self):
        with open("numbers.txt","r") as file1:
            for line in file1:
                self.numbers.append(int(line))
    
    def programSetter(self):
        self.input = input()

        match(int(self.input)):
            case 1:
                self.app = NumberSort()
                self.app.run(self.numbers)

            
    def __init__(self):
        print("Number Sort Program")
        print("Loading numbers.txt")
        self.loadNumbers()
        print("- Numbers Loaded -")
        print("Welcome to the Number Sort Program, please set program...")
        print("1. Number Sorting")
        self.programSetter()



main = Main()


