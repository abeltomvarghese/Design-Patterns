##https://python-patterns.guide/gang-of-four/singleton/
##https://stackoverflow.com/questions/27200674/python-queue-join

from threading import Thread, Lock
import time

class Singleton:
	_instance = None
	_lock = Lock()
	_name = None
	def __new__(cls):
		if not cls._instance:
			with cls._lock:

				if not cls._instance:
					cls._instance = super(Singleton, cls).__new__(cls)

		return cls._instance

	def __init__(self):
		self._scrabbleList = ["a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z"]

	def getLetterList(self):
		return self._instance._scrabbleList

	def takeTiles(self, numTiles):
		playerTiles = []
		for x in range(numTiles):
			playerTiles.append(numTiles.pop(0))

		return playerTiles

if __name__ == '__main__':
	game = Singleton()
	myList = game.getLetterList()
	print(myList)
