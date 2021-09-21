from SingletonMeta import SingletonMeta
import random as rd
from collections import deque

class SingletonClass(metaclass=SingletonMeta):

	def __init__(self):
		self.letterList = ["a", "a", "a", "a", "a", "a", "a", "a", "a",
							"b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
							"e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
							"h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
							"l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
							"o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
							"r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
							"u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z"]
		rd.shuffle(self.letterList)
		self.linkedLetterList = deque(self.letterList)
		print("This was called")

	def getLetterList(self):
		return self.linkedLetterList

	def getTiles(self, numTiles):
		playerTiles = deque()

		for x in range(numTiles):
			playerTiles.append(self.linkedLetterList.popleft())

		return playerTiles