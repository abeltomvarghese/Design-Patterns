from threading import Thread

from GameLogic import GetTheTiles

if __name__ == "__main__":
	process1 = Thread(target=GetTheTiles, args=(1,))
	process2 = Thread(target=GetTheTiles, args=(2,))

	process1.start()
	process2.start()